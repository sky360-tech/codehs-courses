public class Chef
{
    private String chef;
    private String restaurant;
    private Meal bestMeal;
    public Chef(String c, String r, Meal bM)
    {
    chef = c;
    restaurant = r;
    bestMeal = bM;
    }
    public String getName()
    {
    return chef;
    }
    public String getRestaurant()
    {
    return restaurant;
    }
    public Meal getMeal()
    {
    return bestMeal;
    }
    public String getMealName()
    {
    return bestMeal.gettheName();
    }
    public String getMealCourse()
    {
    return bestMeal.getCourse();
    }
    public int getMealServings()
    {
    return bestMeal.getNumberOfServings();
    }
    public String toString()
    {
    return chef + " works at " + restaurant + " and is best known for " + bestMeal;
    }
}