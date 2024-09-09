package RecipeProject;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IngredientTest {


    @Test
    void addIngredientTest() {
        Ingredient butter = new Ingredient("Butter", 20.22, 1, "lb", "Azam");
        Bakery bakery = new Bakery();
        bakery.addIngredient(butter);
        assertTrue(bakery.getIngredientsList().contains(butter));
    }

    @Test
    void getnameTest(){
        Ingredient ingredient = new Ingredient("Butter");
        ingredient.getName();
        assertEquals("Butter", ingredient.getName());
    }

    @Test
    void getPriceTest(){
        Ingredient ingredient = new Ingredient("Butter", 20.22, 1, "lb", "Azam");
        assertEquals(20.22,ingredient.getPrice());

    }

    @Test
    void getQuantityTest(){
        Ingredient ingredient = new Ingredient("Butter", 20.22, 1, "lb", "Azam");
        assertEquals("1 lb",ingredient.getQuantity());
    }

    @Test
    void getSupplierName(){
        Ingredient ingredient = new Ingredient("Butter", 20.22, 1, "lb", "Azam");
        assertEquals("Azam",ingredient.getSupplierName());
    }

    @Test
    void setNameTest(){
        Ingredient ingredient = new Ingredient("Butter", 20.22, 1, "lb", "Azam");
        ingredient.setName("Sugar");
        assertEquals("Sugar", ingredient.getName());

    }

    @Test
    void setPriceTest(){
        Ingredient ingredient = new Ingredient("Butter", 20.22, 1, "lb", "Azam");
       ingredient.setPrice(21.05);
       assertEquals(21.05, ingredient.getPrice());
    }

    @Test
    void setQuantityTest(){
        Ingredient ingredient = new Ingredient("Butter", 20.22, 1, "lb", "Azam");
        ingredient.setQuantity(2);
        assertEquals(2, ingredient.getQuantity());
    }

    @Test
    void setSupplierName(){
        Ingredient ingredient = new Ingredient("Butter", 20.22, 1, "lb", "Azam");
        ingredient.setSupplierName("Bhakresa");
        assertEquals("Bhakresa", ingredient.getSupplierName());
    }


}
