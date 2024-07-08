package Bakery;

import java.util.HashMap;
import java.util.Map;

public class Recipe {
    private String name;
    private Map<Ingredient , Double> ingredients;
    private int quantityOutput;


    public Recipe(String name ,int quantityOutput) {
        this.name = name;
        this.ingredients = new HashMap<>();
        this.quantityOutput = quantityOutput;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Ingredient, Double> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Ingredient, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantityOutput() {
        return quantityOutput;
    }

    public void setQuantityOutput(int quantityOutput) {
        this.quantityOutput = quantityOutput;
    }

    public void addIngredient(Ingredient ingredient, Double quantity) {
        ingredients.put(ingredient, quantity);
    }
}
