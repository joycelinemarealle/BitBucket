package Bakery;

import java.util.ArrayList;
import java.util.List;

public class IngredientManager {
    private List<Ingredient> ingredients;

    public IngredientManager() {
        this.ingredients = new ArrayList<>();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

//    public String getName( Ingredient ingredient ){
//        return ingredient.getName();
//    }
    public  Ingredient getName(String name) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                return ingredient;
            }
        }
        return null;
    }
}
