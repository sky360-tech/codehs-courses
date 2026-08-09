public class Comment {
    // Instance variables
    private String poster;
    private String text;
    private String date;
    private String postId; // Optional: used if this is a comment on a specific post

    // Constructor for a general comment
    public Comment(String poster, String text, String date) {
        this.poster = poster;
        this.text = text;
        this.date = date;
        this.postId = null; // Default is null for a general comment
    }

    // Constructor for a comment on a specific post (includes postId)
    public Comment(String poster, String text, String date, String postId) {
        this.poster = poster;
        this.text = text;
        this.date = date;
        this.postId = postId; // Set postId if this is a specific comment
    }

    // Accessor methods
    public String getPoster() {
        return poster;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    public String getPostId() {
        return postId;
    }

    // toString method
    @Override
    public String toString() {
        String result = "Poster: " + poster + "\nText: " + text + "\nDate: " + date;
        if (postId != null) { // Include postId if this is a specific comment
            result += "\nPost ID: " + postId;
        }
        return result;
    }
}// reviewed: 2026-08-09
