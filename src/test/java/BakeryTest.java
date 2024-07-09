import Bakery.Bakery;
import Bakery.Recipe;
import org.junit.jupiter.api.BeforeEach;
import Bakery.Ingredient;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BakeryTest {
    Recipe cakeRecipe;
    Recipe chocolateMuffinsRecipe;

    Bakery bakery;
    Ingredient flour;
    Ingredient sugar;
    Ingredient eggs;
    Ingredient butter;
    Ingredient chocolate;



    @BeforeEach
    public void setup() {
        cakeRecipe = new Recipe("Cake", 1);
        chocolateMuffinsRecipe = new Recipe("Muffins", 10);
        bakery = new Bakery();


        flour = new Ingredient("flour", 5.52, 1, "Kg", "Azam Supplier");
        sugar = new Ingredient("sugar", 3.25, 1, "Kg", "Food Bazaar Supplier");
        eggs = new Ingredient("eggs", 4.75, 12, "pcs", " Nature Eggs Supplier");
        butter = new Ingredient("butter", 3.36, 1, "Kg", " Blueband Supplier");
       chocolate= new Ingredient("chocolate", 2.78, 1, "Kg", " Chocolate Supplier");

    }

    @Test
    public  void totalIngredientTest() {

        //add ingredient to the two recipes
        cakeRecipe.addIngredient(flour, 1.5);
        cakeRecipe.addIngredient(sugar, 2.0);
        cakeRecipe.addIngredient(butter, 1.0);
        cakeRecipe.addIngredient(eggs, 13.0);


        chocolateMuffinsRecipe.addIngredient(chocolate, 3.0);
        chocolateMuffinsRecipe.addIngredient(flour, 1.5);
        chocolateMuffinsRecipe.addIngredient(sugar, 2.5);


        //add recipes into recipe List
        bakery.addRecipe(cakeRecipe);
        bakery.addRecipe(chocolateMuffinsRecipe);

        //return hashmap with ingredient and quantity
       Map<Ingredient, Double> totalIngredient=  bakery.overallIngredientAmount(cakeRecipe, chocolateMuffinsRecipe);


        //assert
        assertEquals(3.0,totalIngredient.get(flour));
    }

    @Test

    public void  totalCostTestForBatch(){
//add ingredient to the two recipes
        cakeRecipe.addIngredient(flour, 1.5);
        cakeRecipe.addIngredient(sugar, 2.0);
        cakeRecipe.addIngredient(butter, 1.0);
        cakeRecipe.addIngredient(eggs, 13.0);


        chocolateMuffinsRecipe.addIngredient(chocolate, 3.0);
        chocolateMuffinsRecipe.addIngredient(flour, 1.5);
        chocolateMuffinsRecipe.addIngredient(sugar, 2.5);


        //add recipes into recipe List
        bakery.addRecipe(cakeRecipe);
        bakery.addRecipe(chocolateMuffinsRecipe);

        //return hashmap with ingredient and quantity
       //Map<Ingredient, Double>  totalIngredient = bakery.overallIngredientAmount(cakeRecipe, chocolateMuffinsRecipe);

    double totalCost = bakery.calculateTotalCostForBatch(cakeRecipe, chocolateMuffinsRecipe);
        //assert
        assertEquals(48.03, round(totalCost), 2);
    }
}