package Bakery;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private List<Ingredient> ingredients;
    private List<Recipe> recipes;

    public Bakery() {
        this.ingredients = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    public void calculateQuantityOfIngredients(Recipe recipe){
        recipe.getQuantityOutput()* recipes.()/
    }

    @Override
    public String toString() {
        return "IngredientManager{" +
                "ingredients=" + ingredients +
                '}';
    }
}

