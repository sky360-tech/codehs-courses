public class Exercise
{
    private String name;
    private String programmingLanguage;
    private int points;
    private int difficulty; // scale of 1 - 5
    private boolean isLive;

    // Defining a default constructor
    public Exercise()
    {
        name = "Hello World";
        programmingLanguage = "Java";
        points = 10;
        difficulty = 3;
        isLive = false;
    }

    // Defining a constructor that customizes exercise properties
    public Exercise(String name, String programmingLanguage, int points, int difficulty, boolean isLive)
    {
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.points = points;
        this.difficulty = difficulty;
        this.isLive = isLive;
    }

    public String toString()
    {
        return "Name: " + name +
        "\nLanguage: " + programmingLanguage +
        "\nPoints: " + points +
        "\nDifficulty: " + difficulty +
        "\nIs Live: " + isLive + "\n";
    }
}// reviewed: 2026-05-28
