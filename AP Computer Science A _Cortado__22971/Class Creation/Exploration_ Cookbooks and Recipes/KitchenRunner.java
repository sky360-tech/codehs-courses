public class KitchenRunner
{
    public static void main(String[] args)
    {
        Recipe myRecipe = new Recipe("Pancakes", "Flour");
        Cookbook myCookbook = new Cookbook("Breakfast Foods", myRecipe);
        Cookbook myCookbook2 = new Cookbook("All I Need", myRecipe);
        Cookbook myCookbook3 = new Cookbook("I Live for Food", myRecipe);

        System.out.println("Original states:\n");
        System.out.println("++ Standalone Recipe ++\n" + myRecipe);
        System.out.println("\n" + myCookbook);
        System.out.println("\n" + myCookbook2);
        System.out.println("\n" + myCookbook3);

        myCookbook.updateRecipeIngredient("Sugar");

        System.out.println("\nAfter modification to cookbook:\n");
        System.out.println("++ Standalone Recipe ++\n" + myRecipe);
        System.out.println("\n" + myCookbook);
        System.out.println("\n" + myCookbook2);
        System.out.println("\n" + myCookbook3);
    }
}// reviewed: 2026-05-30
