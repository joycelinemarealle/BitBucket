import Bakery.Bakery;
import Bakery.Ingredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    @Test
    // ADDING INGREDIENT
    public  void addIngredientTest() {
        // INGREDIENT INSTANCE
        Ingredient ingredient = new Ingredient("sugar", 5.52, 1, "Kg", "Azam Supplier");
        // MANAGER INSTANCE
        Bakery manager = new Bakery();
        manager.addIngredient(ingredient);

        assertEquals(1, manager.getIngredients().size());
        assertTrue(manager.getIngredients().contains(ingredient));

    }

    // GETTING INFO ABOUT THE INGREDIENT
    @Test
    public  void getIngredientTest() {
        // INGREDIENT INSTANCE
        Ingredient  flour = new Ingredient("flour", 5.52, 1, "Kg", "Azam Supplier");

        // MANAGER
        Bakery manager = new Bakery();
        manager.addIngredient(flour);

        // check name of ingredient in system if equal to flour
        assertEquals("flour", manager.getIngredients().get(0).getName());
        assertEquals(5.52, manager.getIngredients().get(0).getPrice());
        assertEquals(1, manager.getIngredients().get(0).getQuantity());
        assertEquals("Kg", manager.getIngredients().get(0).getUnit());
        assertEquals("Azam Supplier", manager.getIngredients().get(0).getSupplierName());

    }

    @Test
    public void modifyIngredientTest(){
        Ingredient  flour = new Ingredient("flour", 5.52, 1, "Kg", "Azam Supplier");

        // MANAGER
       Bakery manager = new Bakery();
        manager.addIngredient(flour);

        flour.setName("eggs");
        flour.setPrice(3.25);
        flour.setQuantity(12);
        flour.setUnit("pcs");
        flour.setSupplierName("Natural Eggs Supplier");


        assertEquals("eggs", manager.getIngredients().get(0).getName());
        assertEquals(3.25, manager.getIngredients().get(0).getPrice());
        assertEquals(12, manager.getIngredients().get(0).getQuantity());
        assertEquals("pcs", manager.getIngredients().get(0).getUnit());
        assertEquals("Natural Eggs Supplier", manager.getIngredients().get(0).getSupplierName());

    }


}
