// Movie.java
public class Movie
{
    private String title;
    private int releaseYear;
    private Director director;

    public Movie(String title, int releaseYear, Director director)
    {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = new Director(director.getName(), director.getYearsExperience()); // copy!
    }

    public void setDirectorName(String newName) { director.setName(newName); }
    public void setDirectorYears(int newYears) { director.setYearsExperience(newYears); }
    public void setTitle(String newTitle) { title = newTitle; }
    public String getTitle() { return title; }
    public int getReleaseYear() { return releaseYear; }
    public String getDirectorName() { return director.getName(); }
    public int getDirectorYears() { return director.getYearsExperience(); }
    public String toString() { return title + " (" + releaseYear + "), directed by " + director; }
}