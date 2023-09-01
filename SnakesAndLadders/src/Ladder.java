// This is a class named Ladder that represents a ladder in the Snake and Ladder game.

public class Ladder {
    private int start; // The starting position of the ladder
    private int end;   // The ending position of the ladder
    
    // Constructor to create a ladder with a start and end position
    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    // Method to get the starting position of the ladder
    public int getStart() {
        return start;
    }
    
    // Method to get the ending position of the ladder
    public int getEnd() {
        return end;
    }
}
