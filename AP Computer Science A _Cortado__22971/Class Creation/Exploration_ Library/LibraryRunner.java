public class LibraryRunner
{
    public static void main(String[] args)
    {
        // Create a new library
        Library library = new Library("Springfield Library");
        
        // Create a new book by adding to library, then check out and print
        Book book1 = library.addBook("The Hunger Games", "Suzanne Collins", "Dystopia");
        library.checkOutBook(book1);
        System.out.println(book1);
        
        // Create a second new book by adding to library and print
        System.out.println("----------------");
        Book book2 = library.addBook("Catching Fire", "Suzanne Collins", "Dystopia");
        System.out.println(book2);
        
        // Compare first and second books
        System.out.println("----------------");
        book1.sameBooks(book2);
        // Return book1
        library.returnBook(book1);

        // Check if book1 and book2 have the same genre
        if (book1.sameGenre(book2)) {
        System.out.println("These books are the same genre.");
            } else {
                System.out.println("These books have different genres.");
        }

    }
}