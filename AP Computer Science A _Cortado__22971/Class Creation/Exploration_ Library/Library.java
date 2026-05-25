public class Library 
{
    private String name;

    public Library(String libName)
    {
        name = libName;
    }
    
    /**
     * Adds a book object to the Library using the Book constructor
     * Then, returns the book object
     */
    public Book addBook(String title, String author, String genre) 
    {
        Book book = new Book(title, author, genre);
        return book;
    }
    
    public void returnBook(Book book) {
    if (book.getCheckedOut()) {
        book.setCheckedOut(false);
        System.out.println("You returned " + book.getTitle());
    } else {
        System.out.println(book.getTitle() + " cannot be returned because it is currently not checked out.");
    }
}

    /**
     * Simulates checking out a book by checking the
     * book's checkedOut attribute
     * Precondition: book has been properly initialized 
     */
    public void checkOutBook(Book book) 
    {
        if (book.getCheckedOut()) 
        {
            System.out.println("Sorry, that book is checked out.");
        } 
        else
        {
            book.setCheckedOut(true);
            System.out.println("You checked out " + book.getTitle());
        }
    }
}