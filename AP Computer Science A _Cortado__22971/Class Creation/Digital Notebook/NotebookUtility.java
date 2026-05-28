public class NotebookUtility {
    /**
     * Advances the current page of a Notebook object
     * by a specified number of pages
     * Precondition: notebook has been properly initialized
     */
    public static void flipPages(Notebook notebook, int pagesToFlip) {
        // Only proceed if pagesToFlip is positive
        if (pagesToFlip > 0) {
            int newPage = notebook.getCurrentPage() + pagesToFlip;
            
            // Check if the new page exceeds the total number of pages
            if (newPage > notebook.getTotalPages()) {
                notebook.setCurrentPage(notebook.getTotalPages());
            } else {
                notebook.setCurrentPage(newPage);
            }
        }
    }

    /**
     * Sets the current page of a Notebook object back
     * to the first page
     * Precondition: notebook has been properly initialized
     */
    public static void resetNotebook(Notebook notebook) {
        // Sets the current page back to 1
        notebook.setCurrentPage(1);
    }
}// reviewed: 2026-05-28
