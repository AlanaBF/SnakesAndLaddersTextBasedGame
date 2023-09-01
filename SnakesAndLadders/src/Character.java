// Abstract class to represent a character in the game
public abstract class Character {

    private String name; // Store the character's name

    // Constructor to initialize the character's name
    public Character(String name) {
        this.name = name;
    }

    // Method to get the character's name
    public String getName() {
        return name;
    }
}
