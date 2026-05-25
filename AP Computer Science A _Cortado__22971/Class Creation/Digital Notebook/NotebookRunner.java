public class NotebookRunner 
{
    public static void main(String[] args) 
    {
        // Create a notebook object with 100 pages
        Notebook myNotebook = new Notebook(100);
        
        // Print the notebook
        System.out.println(myNotebook);
        
        // Flip 25 pages and print again
        NotebookUtility.flipPages(myNotebook, 25);
        System.out.println(myNotebook);
        
        // Try to flip too many pages and print again
        NotebookUtility.flipPages(myNotebook, 500);
        System.out.println(myNotebook);
        
        // Reset the notebook and print a third time
        NotebookUtility.resetNotebook(myNotebook);
        System.out.println(myNotebook);
    }
}