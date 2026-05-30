public class Recipe
{
    private String name;
    private String ingredient;

    public Recipe(String recipeName, String recipeIngredient)
    {
        name = recipeName;
        ingredient = recipeIngredient;
    }

    public void setIngredient(String newIngredient)
    {
        ingredient = newIngredient;
    }

    public String getName()
    {
        return name;
    }

    public String getIngredient()
    {
        return ingredient;
    }

    public String toString()
    {
        return "Recipe: " + name + "\nIngredient: " + ingredient;
    }
}// reviewed: 2026-05-30
