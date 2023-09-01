// This is a class named Snake that represents a snake in the Snake and Ladder game.

public class Snake {
    private int start; // Starting position of the snake
    private int end;   // Ending position of the snake
    
    // Constructor to create a snake with specified start and end positions
    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    // Method to get the starting position of the snake
    public int getStart() {
        return start;
    }
    
    // Method to get the ending position of the snake
    public int getEnd() {
        return end;
    }
}

