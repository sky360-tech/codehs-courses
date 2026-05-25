public class Notebook 
{
    // Private instance variables
    private int currentPage;
    private int totalPages;

    // Constructor
    public Notebook(int pages) 
    {
        totalPages = pages;
        currentPage = 1;
    }

    // Getter for current page
    public int getCurrentPage() 
    {
        return currentPage;
    }

    // Setter for current page
    public void setCurrentPage(int page) 
    {
        currentPage = page;
    }

    // Getter for total pages
    public int getTotalPages() 
    {
        return totalPages;
    }

    // toString method for printing
    public String toString() 
    {
        return "Notebook: Currently on page " + currentPage + " of " + totalPages;
    }
}