import Bakery.Ingredient;
import Bakery.IngredientManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {
    @Test
    // ADDING INGREDIENT
    public  void addIngredientTest() {
        // INGREDIENT INSTANCE
        Ingredient ingredient = new Ingredient("sugar", 5.52, 1, "Kg", "Azam Supplier");
        // MANAGER INSTANCE
        IngredientManager manager = new IngredientManager();
        manager.addIngredient(ingredient);

        assertTrue(manager.getIngredients().contains(ingredient));

    }

    // GETTING INFO ABOUT THE INGREDIENT
    @Test
    public  void getIngredientTest() {
        // INGREDIENT INSTANCE
        Ingredient sugar = new Ingredient("sugar", 5.52, 1, "Kg", "Azam Supplier");
        // MANAGER INSTANCE
        IngredientManager manager = new IngredientManager();
        manager.addIngredient(sugar);

        Ingredient retrieveIngredients = manager.getName("bread");
        assertNull(retrieveIngredients);

         assertEquals("sugar", retrieveIngredients.getName() );
         assertEquals(5.2, retrieveIngredients.getPrice());
         assertEquals(1, retrieveIngredients.getQuantity());
         assertEquals("kg", retrieveIngredients.getUnit());
         assertEquals("Azam Supplier",retrieveIngredients.getSupplierName());

    }


}
