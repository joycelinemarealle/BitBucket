import Bakery.Bakery;
import Bakery.Ingredient;
import Bakery.Recipe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecipeTest {


    @Test

    public void addRecipeTest(){
        Recipe recipe = new Recipe( "Cake", 1);
        Bakery bakery = new Bakery();
        Ingredient flour = new Ingredient("flour", 5.52, 1, "Kg", "Azam Supplier");
        Ingredient sugar = new Ingredient("sugar", 3.25, 1, "Kg", "Food Bazaar Supplier");
        Ingredient eggs = new Ingredient("eggs", 4.75, 12, "pcs", " Nature Eggs Supplier");
        Ingredient butter = new Ingredient("butter", 3.36, 1, "Kg", " Blueband Supplier");


        //add ingredients to recipe
        recipe.addIngredient(flour,0.25);
        recipe.addIngredient(sugar, 0.5);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);

        //add recipe to bakery
        bakery.addRecipe(recipe);

        assertTrue(bakery.getRecipes().contains(recipe));
    }
    @Test

    public void addIngredientTest(){
        Recipe recipe = new Recipe( "Cake", 1);
        Bakery manager = new Bakery();
        Ingredient flour = new Ingredient("flour", 5.52, 1, "Kg", "Azam Supplier");
        Ingredient sugar = new Ingredient("sugar", 3.25, 1, "Kg", "Food Bazaar Supplier");
        Ingredient eggs = new Ingredient("eggs", 4.75, 12, "pcs", " Nature Eggs Supplier");
        Ingredient butter = new Ingredient("butter", 3.36, 1, "Kg", " Blueband Supplier");


        //add ingredients to recipe
        recipe.addIngredient(flour,0.25);
        recipe.addIngredient(sugar, 0.5);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);

        assertTrue(recipe.getIngredients().containsKey(flour));
        assertTrue(recipe.getIngredients().containsKey(sugar));
        assertTrue(recipe.getIngredients().containsKey(eggs));
        assertTrue(recipe.getIngredients().containsKey(butter));
        assertEquals(0.25,recipe.getIngredients().get(flour));
        assertEquals(0.5,recipe.getIngredients().get(sugar));
        assertEquals(12.0,recipe.getIngredients().get(eggs));
        assertEquals(1.0,recipe.getIngredients().get(butter));

    }




}
