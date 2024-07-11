import Bakery.Bakery;
import Bakery.Ingredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {
    Ingredient sugar;
    Ingredient flour;
    Bakery bakery;

    @BeforeEach

    public void setup() {
        bakery = new Bakery();
        flour = new Ingredient("flour", 5.52, 1, "Kg", "Azam Supplier");
    }


    @Test
    // ADDING INGREDIENT
    public void addIngredientTest() {
        bakery.addIngredient(flour);

        assertEquals(1, bakery.getIngredients().size());
        assertTrue(bakery.getIngredients().contains(flour));

    }

    // GETTING INFO ABOUT THE INGREDIENT
    @Test
    public void getIngredientTest() {
        bakery.addIngredient(flour);

        // check name of ingredient in system if equal to flour
        assertEquals("flour", bakery.getIngredients().get(0).getName());
        assertEquals(5.52, bakery.getIngredients().get(0).getPrice());
        assertEquals(1, bakery.getIngredients().get(0).getQuantity());
        assertEquals("Kg", bakery.getIngredients().get(0).getUnit());
        assertEquals("Azam Supplier", bakery.getIngredients().get(0).getSupplierName());

    }

    @Test
    public void modifyIngredientTest() {

        // MANAGER
        bakery.addIngredient(flour);

        //set details of ingredients
        flour.setName("eggs");
        flour.setPrice(3.25);
        flour.setQuantity(12);
        flour.setUnit("pcs");
        flour.setSupplierName("Natural Eggs Supplier");

//assert to test
        assertEquals("eggs", bakery.getIngredients().get(0).getName());
        assertEquals(3.25, bakery.getIngredients().get(0).getPrice());
        assertEquals(12, bakery.getIngredients().get(0).getQuantity());
        assertEquals("pcs", bakery.getIngredients().get(0).getUnit());
        assertEquals("Natural Eggs Supplier", bakery.getIngredients().get(0).getSupplierName());

    }

    //Boundary test for low price

    @Test
    public void lowPriceTest() {
        bakery.addIngredient(flour);

        //set to low price
        flour.setPrice(2.0);
        assertEquals(2.0, flour.getPrice());

    }

    @Test
    public void highPriceTest() {
        bakery.addIngredient(flour);

        //set to low price
        flour.setPrice(1000.0);
        assertEquals(1000.0, flour.getPrice());

    }

    //Boundary test for Quantity
    @Test
    public void lowQuantityTest() {
        bakery.addIngredient(flour);

        //set to low quantity
        flour.setQuantity(1);
        assertEquals(1, flour.getQuantity());
    }

    @Test
    public void highQuantityTest() {
        bakery.addIngredient(flour);

        //set to low quantity
        flour.setQuantity(100);
        assertEquals(100, flour.getQuantity());

    }

    //Erroneous Test for Price
    @Test()
    public  void invalidPricesTest() {
        bakery.addIngredient(flour);

        // set price to negative
        flour.setPrice(-5.0);

        assertThrows(IllegalArgumentException.class, () -> flour.getPrice());
        //assertEquals(-5.0, flour.getPrice());
    }
//
    //Erroneous Test for Quantity
    @Test()
    public  void invalidQuantityTest() {
        bakery.addIngredient(flour);

        // set price to negative
        flour.setQuantity(-5);
        assertThrows(IllegalArgumentException.class, () -> flour.getQuantity());
        //assertEquals(-5.0, flour.getPrice());
    }
}
