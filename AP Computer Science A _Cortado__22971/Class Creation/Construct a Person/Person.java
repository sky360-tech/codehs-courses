public class Person
{
    // Attributes of the Person class
    private String name;
    private int age;
    private double height;
    private String status; // "child" or "adult" based on age

    // Constructor
    public Person(String pName, int pAge, double pHeight)
    {
        name = pName;
        age = pAge;
        height = pHeight;
        // Determine and set the status (child/adult) based on the provided age
        status = determineStatus(pAge);
    }

    // Helper method to determine the status based on the age
    private String determineStatus(int ageValue)
    {
        if (ageValue < 18)
        {
            // If the age is less than 18, the person is considered a child
            return "child";
        }
        else
        {
            // Otherwise, the person is considered an adult
            return "adult";
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public int getAge()
    {
        return age;
    }

    // Sets age, and then pdates the status accordingly
    public void setAge(int newAge)
    {
        age = newAge;
        // Recalculate the status based on the new age
        status = determineStatus(newAge);
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double newHeight)
    {
        height = newHeight;
    }

    public String getStatus()
    {
        return status;
    }

    public String toString()
    {
        String info = "";
        info = info + "Name: " + name + "\n";
        info = info + "Age: " + age + "\n";
        info = info + "Height: " + height + " inches\n";
        info = info + "Status: " + status;
        return info;
    }
}