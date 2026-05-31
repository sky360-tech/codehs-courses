public class Book 
{
    private String title;
    private String author;
    private String genre;
    private boolean checkedOut;
    
    // Constructor
    public Book (String t, String aut, String gen)
    {
        title = t;
        author = aut;
        genre = gen;
        checkedOut = false;
    }
    
    /** 
     * Returns true if otherBook is determined to be the same as 
     * current book and returns false otherwise
     * Precondition: otherBook is properly initalized
     */
    public void sameBooks(Book otherBook)
    {
        if (title.equals(otherBook.title) && author.equals(otherBook.author))
        {
            System.out.println("These books are the same.");
        }
        else
        {
            System.out.println("These books have a different title or author.");
        }
    }
    public boolean sameGenre(Book otherBook) {
    // Direct access to otherBook.genre is allowed here
    return this.genre.equals(otherBook.genre);
    }

    
    // ~~~ Getter and setter methods for attributes ~~~ //
    
    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String newTitle) 
    {
        title = newTitle;
    }

    public String getAuthor() 
    {
        return author;
    }

    public void setAuthor(String newAuthor) 
    {
        author = newAuthor;
    }

    public String getGenre() 
    {
        return genre;
    }

    public void setGenre(String newGenre) 
    {
        genre = newGenre;
    }

    public boolean getCheckedOut() 
    {
        return checkedOut;
    }

    public void setCheckedOut(boolean status) 
    {
        checkedOut = status;
    }
    
    // Custom toString method
    public String toString() 
    {
        String status;
        
        if (checkedOut) 
        {
            status = "Checked Out";
        } 
        else 
        {
            status = "Available";
        }

        return "Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nStatus: " + status;
    }

}// reviewed: 2026-05-31
