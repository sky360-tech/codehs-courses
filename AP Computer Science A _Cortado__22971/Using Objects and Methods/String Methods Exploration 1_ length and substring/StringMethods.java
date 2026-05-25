public class StringMethods
{
    public static void main(String[] args)
    {
        String fullName = "Paulina Rivera";
        
        int mystery1 = fullName.length();
        System.out.println("Mystery Value 1: " + mystery1);
        
        String mystery2 = fullName.substring(0, 7);
        System.out.println("Mystery Value 2: " + mystery2);
        
        String mystery3 = fullName.substring(0, 3);
        System.out.println("Mystery Value 3: " + mystery3);
        
        String mystery4 = fullName.substring(8);
        System.out.println("Mystery Value 4: " + mystery4);
        
        String mystery5 = fullName.substring(0, 7) + " \"Pau\" " + fullName.substring(8);
        System.out.println("Mystery Value 5: " + mystery5);
    }
}