public class GroceryItem
{
    private String name;
    private String category;

    public GroceryItem(String itemName, String itemCategory)
    {
        name = itemName;
        category = itemCategory;
    }

    public String getName()
    {
        return name;
    }

    public String getCategory()
    {
        return category;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setCategory(String newCategory)
    {
        category = newCategory;
    }

    public String toString()
    {
        return name + " (" + category + ")";
    }
}