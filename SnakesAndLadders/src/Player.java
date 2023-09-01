public class Player extends Character {
    private int playerNumber;
    private String playerSymbol;
    private int currentPosition; // Add a field to store the player's current position

    public Player(String name, int playerNumber) {
        super(name); // Call the constructor of the Character class to set the name
        this.playerNumber = playerNumber;
        this.playerSymbol = "P" + playerNumber;
        this.currentPosition = 0; // Initialize the player's current position to 0 (or your desired initial position)
    }

    public String getPlayerSymbol() {
        return playerSymbol;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    // Method to update the player's position based on new coordinates
    public void updatePosition(int newPosition) {
        this.currentPosition = newPosition;
    }
}

