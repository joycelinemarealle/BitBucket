import Bakery.Bakery;
import Bakery.Ingredient;
import Bakery.Recipe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {
    Recipe recipe;
    Bakery bakery;
    Ingredient flour;
    Ingredient sugar;
    Ingredient eggs;
    Ingredient butter;

    @BeforeEach
    public void setup() {
        recipe = new Recipe( "Cake", 1);
        bakery = new Bakery();
        flour = new Ingredient("flour", 5.52, 1, "Kg", "Azam Supplier");
       sugar = new Ingredient("sugar", 3.25, 1, "Kg", "Food Bazaar Supplier");
        eggs = new Ingredient("eggs", 4.75, 12, "pcs", " Nature Eggs Supplier");
        butter = new Ingredient("butter", 3.36, 1, "Kg", " Blueband Supplier");

    }

    @Test

    public void addRecipeTest(){
        //add ingredients to recipe
        recipe.addIngredient(flour,2.0);
        recipe.addIngredient(sugar, 1.0);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);

        //add recipe to bakery
        bakery.addRecipe(recipe);

        assertTrue(bakery.getRecipes().contains(recipe));
    }
    @Test

    public void addIngredientTest(){

        //add ingredients to recipe
        recipe.addIngredient(flour,2.0);
        recipe.addIngredient(sugar, 1.0);
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


    @Test
    public void ingredientAmountAndPtOutputProductTest(){
        //add ingredients to recipe
        recipe.addIngredient(flour,2.0);
        recipe.addIngredient(sugar, 1.0);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);

        //set new output for 2 cakes
        recipe.setQuantityOutput(2);

        //test if outputProduct changed
        assertEquals(2, recipe.getQuantityOutput());

    }

    @Test
    public void ingredientAmountPerRecipeTest() {
        //add ingredients to recipe
        recipe.addIngredient(flour, 2.0);
        recipe.addIngredient(sugar, 1.0);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);

        //Test a few ingredient to see if it works
        //testing ingredient amount
        assertEquals(2.0, recipe.amountOfIngredient(flour));
        assertEquals(1.0, recipe.amountOfIngredient(sugar));
        assertEquals(12.0, recipe.amountOfIngredient(eggs));
        assertEquals(1.0, recipe.amountOfIngredient(butter));

    }

    @Test
    public void calculateIngredientAmount(){

        //add ingredients to recipe
        recipe.addIngredient(flour, 2.0);
        recipe.addIngredient(sugar, 1.0);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);


        //test to see quantity is updated
        assertEquals(20.0,  recipe.calculateQuantityOfIngredients(flour, 10));
    }

    @Test
    public void calculateCostPerUnitProductTest() {
        //add ingredients to recipe
        recipe.addIngredient(flour, 2.0);
        recipe.addIngredient(sugar, 1.0);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);

     double costPerUnit = recipe.calculateUnitCost();
      assertEquals(22.4, costPerUnit);
    }


    @Test
     public void calculatePriceForProfitMargin(){

//add ingredients to recipe
        recipe.addIngredient(flour, 2.0);
        recipe.addIngredient(sugar, 1.0);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);

        // calculating the cost per unit with our profit margin
        double  pricePerUnitProduct= recipe.calculatePrice(0.50); // profit margin
        assertEquals(33.60, round(pricePerUnitProduct), 2);

    }

    // recipe: BoundaryTest for recipe  min quantityOutput
    @Test
    public  void minimumOutputTest() {
        //add ingredients to recipe
        recipe.addIngredient(flour, 2.0);
        recipe.addIngredient(sugar, 1.0);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);


        // setting the min quantityOutput
        recipe.setQuantityOutput(1);
        assertEquals(1,recipe.getQuantityOutput());

    }

    // recipe: ErroneousTest for  negative quantityOutput in our recipe
    @Test()
    public  void negativeQuantityOutput() {
        //add ingredients to recipe
        recipe.addIngredient(flour, 2.0);
        recipe.addIngredient(sugar, 1.0);
        recipe.addIngredient(eggs, 12.0);
        recipe.addIngredient(butter, 1.0);

        // setting the quantityOutput
        recipe.setQuantityOutput(-1);
        assertThrows(IllegalArgumentException.class, () -> recipe.getQuantityOutput());

    }

//    // recipe: ErroneousTest for null test in our recipe
//    @Test()
//    public  void nullRecipeTest() {
//        //add ingredients to recipe
//        recipe.addIngredient(flour, 2.0);
//        recipe.addIngredient(sugar, 1.0);
//        recipe.addIngredient(eggs, 12.0);
//        recipe.addIngredient(butter, 1.0);
//        recipe.addIngredient(null,0.0);
//
//        assertThrows(IllegalArgumentException.class, () -> recipe.addIngredient(null,0.0));
//
//    }
//



}
