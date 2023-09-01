import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    private Map map; // Add a reference to the Map object

    public Game() {
        player1 = new Player("Player 1", 1);
        player2 = new Player("Player 2", 2);
        map = new Map(player1, player2); // Initialize the Map object
    }

    // Method to start the game loop
    public void startGameLoop() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Print the game board before each player's turn
            map.printGameBoard();

            System.out.println(player1.getName() + ", enter your direction (N/S/E/W): ");
            String direction1 = scanner.nextLine().toUpperCase();
            movePlayer(player1, direction1); // Pass the direction to movePlayer

            // Check for win conditions

            System.out.println(player2.getName() + ", enter your direction (N/S/E/W): ");
            String direction2 = scanner.nextLine().toUpperCase();
            movePlayer(player2, direction2); // Pass the direction to movePlayer

            // Check for win conditions
        }

        // Close the scanner
        // scanner.close(); // Commented this line as it's better to close the scanner outside the loop
    }

    // Method to move a player based on the given direction
    private void movePlayer(Player player, String direction) {
        int currentPosition = player.getCurrentPosition();
        int currentRow = currentPosition / 9;
        int currentCol = currentPosition % 9;

        int newRow = currentRow;
        int newCol = currentCol;

        // Update the new position based on the direction
        if (direction.equals("N")) {
            newRow--;
        } else if (direction.equals("S")) {
            newRow++;
        } else if (direction.equals("E")) {
            newCol++;
        } else if (direction.equals("W")) {
            newCol--;
        }

        // Check for out-of-bounds moves
        if (newRow < 0 || newRow >= 9 || newCol < 0 || newCol >= 9) {
            System.out.println("Invalid move. Try again.");
            return;
        }

        // You need to access the game board from the Map object
        char[][] gameBoard = map.getGameBoard();
        char newPositionValue = gameBoard[newRow][newCol]; // Get the value at the new position

        // Update the player's position and handle snakes and ladders
        player.updatePosition(newRow * 9 + newCol); // Update the position with a single integer

        // Handle snakes and ladders
        if (newPositionValue == 'S') {
            System.out.println(player.getName() + " hit a snake and moved down!");
        } else if (newPositionValue == 'L') {
            System.out.println(player.getName() + " climbed a ladder and moved up!");
        }
    }
}

