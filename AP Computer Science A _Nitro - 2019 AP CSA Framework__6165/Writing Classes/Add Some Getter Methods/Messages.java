public class Messages {
    public static void main(String[] args) {
        // Create a general Comment object
        Comment comment1 = new Comment("Alice", "Hello!", "2024-11-09 10:00 AM");

        // Create a Comment object with a postId (representing a specific comment)
        Comment comment2 = new Comment("Bob", "Nice post!", "2024-11-09 10:05 AM", "post123");

        // Print the general Comment and specific Comment objects
        System.out.println("General Comment:");
        System.out.println(comment1);
        
        System.out.println("\nSpecific Comment:");
        System.out.println(comment2);

        // Use accessor methods to print specific instance variables
        System.out.println("\nPoster of specific comment: " + comment2.getPoster());
        System.out.println("Text of specific comment: " + comment2.getText());
        System.out.println("Date of specific comment: " + comment2.getDate());
        System.out.println("Post ID of specific comment: " + comment2.getPostId());
    }
}