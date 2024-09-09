
import RecipeProject.Bakery;
import RecipeProject.Ingredient;
import RecipeProject.Recipe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecipeTest {
    @Test //Us1
    void storeRecipeTest() {
        Recipe recipe = new Recipe("Cake", 1);
        Ingredient butter = new Ingredient("Butter", 5.23, 1, "kg", "Azam");
        Ingredient sugar = new Ingredient("Sugar", 3.24, 1, "kg", "Sugarlimited");
        Bakery bakery = new Bakery();
        recipe.addIngredient(butter, 0.2);
        recipe.addIngredient(sugar, 0.2);

        //add to recipeList
        bakery.addRecipe(recipe);
        assertEquals("Cake", recipe.getName());
        assertTrue(recipe.getIngredients().containsKey(butter));
        assertEquals(0.2, recipe.getIngredients().get(butter));
        assertTrue(recipe.getIngredients().containsKey(sugar));
        assertEquals(0.2, recipe.getIngredients().get(sugar));

    }

    @Test //Us2
    void addIngredientTest() {
        Recipe recipe = new Recipe("Pancakes", 1);
        Ingredient flour = new Ingredient("Flour", 5.50, 1, "kg", "Azam");
        Ingredient eggs = new Ingredient("Eggs", 3.45, 12, "pcs", "Fresh Egss");
        Ingredient milk = new Ingredient("Milk", 2.99, 1, "liter", "Dairy Fresh");

        recipe.addIngredient(flour, 0.5);
       recipe.addIngredient(eggs, 2.0);
        recipe.addIngredient(milk, 0.3);


        assertEquals("Pancakes", recipe.getName());
        assertTrue(recipe.getIngredients().containsKey(flour));
        assertTrue(recipe.getIngredients().containsKey(eggs));
        assertTrue(recipe.getIngredients().containsKey(milk));
        assertEquals(0.5, recipe.getIngredients().get(flour));
        assertEquals(2.0, recipe.getIngredients().get(eggs));
        assertEquals(0.3, recipe.getIngredients().get(milk));

    }

    @Test //US3
    void ingredientQuantityAndOutputProductTest() {
        Recipe recipe = new Recipe("Cupcake", 1);
        Ingredient butter = new Ingredient("Butter", 5.23, 1,"kg", "Azam");
        recipe.addIngredient(butter, 0.5);
        Bakery bakery = new Bakery();

    }
    @Test
    void calculateIngredientQuantityPerProductTest() {
        Recipe recipe = new Recipe("Cupcake", 1);
        Ingredient butter = new Ingredient("Butter", 5.23, 1,"kg", "Azam");
        recipe.addIngredient(butter, 0.5);
        Bakery bakery = new Bakery();

        //calculate quantity for 12 cupcakes
        Double calculatedQuantity = recipe.calculateIngredientQuantity(butter, 10);
        assertEquals(1.0, calculatedQuantity);
    }

    @Test
    void calculateIngredientQuantityPerUnitProductTest(){
        Recipe recipe = new Recipe("Cupcake", 1);
        Ingredient butter = new Ingredient("Butter", 5.23, 1,"kg", "Azam");
        recipe.addIngredient(butter, 0.5);
        Bakery bakery = new Bakery();

        //calculate quantity for 12 cupcakes
        Double calculatedQuantity = recipe.calculateIngredientQuantity(butter, 1);
        assertEquals(1.0, calculatedQuantity);
    }
}
