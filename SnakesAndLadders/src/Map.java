public class Map {
    // A 2D array to represent the game board
    private char[][] gameBoard;
    private Player player1;
    private Player player2;

    public Map(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        initializeGameBoard();
    }

    private void initializeGameBoard() {
        gameBoard = new char[9][9];

        // Set player positions on the game board with their symbols
        gameBoard[0][0] = player1.getPlayerSymbol().charAt(0); // 'P'
        gameBoard[0][1] = player1.getPlayerSymbol().charAt(1); // '1'
        gameBoard[8][0] = player2.getPlayerSymbol().charAt(0); // 'P'
        gameBoard[8][1] = player2.getPlayerSymbol().charAt(1); // '2'

        // Initialize other elements (snakes, ladders, etc.) as needed
        // For simplicity, the example includes just player positions.
    }

    // Method to retrieve the game board
    public char[][] getGameBoard() {
        return gameBoard;
    }

    // Method to print the game board
    public void printGameBoard() {
        System.out.println("  1 2 3 4 5 6 7 8 9"); // Column labels
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print((i + 1) + " "); // Row label
            for (int j = 0; j < gameBoard[i].length; j++) {
                char cellValue = gameBoard[i][j];
                if (cellValue == 'P') {
                    System.out.print(player1.getPlayerSymbol() + " ");
                } else if (cellValue == '1') {
                    System.out.print("  "); // Empty space
                } else if (cellValue == '2') {
                    System.out.print("  "); // Empty space
                } else {
                    System.out.print(cellValue + " ");
                }
            }
            System.out.println();
        }
    }
}





// 1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9
//---|----|----|----|----|----|----|----|----
//10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18
//---|----|----|----|----|----|----|----|----
//19 | 20 | 21 | 22 | 23 | 24 | 25 | 26 | 27
//---|----|----|----|----|----|----|----|----
//28 | 29 | 30 | 31 | 32 | 33 | 34 | 35 | 36
//---|----|----|----|----|----|----|----|----
//37 | 38 | 39 | 40 | 41 | 42 | 43 | 44 | 45
//---|----|----|----|----|----|----|----|----
//46 | 47 | 48 | 49 | 50 | 51 | 52 | 53 | 54
//---|----|----|----|----|----|----|----|----
//55 | 56 | 57 | 58 | 59 | 60 | 61 | 62 | 63
//---|----|----|----|----|----|----|----|----
//64 | 65 | 66 | 67 | 68 | 69 | 70 | 71 | 72
//---|----|----|----|----|----|----|----|----
//73 | 74 | 75 | 76 | 77 | 78 | 79 | 80 | 81
