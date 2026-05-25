public class Food

{

    private String name;

    private int calories;

    public Food(String foodName, int numCalories)

    {

        name = foodName;

        calories = numCalories;

    }

    public void setCalories(int numCalories)

    {

        calories = numCalories;

    }

    public int getCalories()

    {

        return calories;

    }

    public void setName(String foodName)

    {

        name = foodName;

    }

    public String getName()

    {

        return name;

    }

    public String toString()

    {

        return name + " have " + calories + " calories.";

    }

}