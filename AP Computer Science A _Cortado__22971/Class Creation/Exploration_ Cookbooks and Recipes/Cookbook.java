public class Cookbook
{
    private String name;
    private Recipe recipe;

    public Cookbook(String bookName, Recipe inputRecipe)
    {
        name = bookName;
        // Create a copy instead of storing the shared reference
        recipe = new Recipe(inputRecipe.getName(), inputRecipe.getIngredient());
    }

    public void updateRecipeIngredient(String newIngredient)
    {
        recipe.setIngredient(newIngredient);
    }

    public void setBookName(String newName)
    {
        name = newName;
    }

    public Recipe getRecipe()
    {
        return recipe;
    }

    public String getBookName()
    {
        return name;
    }

    public String toString()
    {
        return "== " + name + " Cookbook Recipe ==\n" + recipe.toString();
    }
}// reviewed: 2026-05-30
