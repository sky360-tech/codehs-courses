public class WebsiteTester {
    public static void main(String[] args) {
        // Create websites
        Website defaultWebsite = new Website();
        Website newWebsite = new Website("hi", "com", 0);
        Website oldWebsite = new Website("hi", "com");
        
        // Print the websites
        System.out.println(defaultWebsite); 
        System.out.println(newWebsite);     
        System.out.println(oldWebsite);     
    }
}// reviewed: 2026-08-07
