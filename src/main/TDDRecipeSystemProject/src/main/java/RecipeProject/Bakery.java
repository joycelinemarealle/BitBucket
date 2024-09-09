package RecipeProject;

import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private List<Ingredient> ingredientsList;
    private List <Recipe> recipesList;

    public Bakery() {
        this.recipesList = new ArrayList<>();
        this.ingredientsList = new ArrayList<>();
    }

    public List<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredient> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public List<Recipe> getRecipesList() {
        return recipesList;
    }

    public void setRecipesList(List<Recipe> recipesList) {
        this.recipesList = recipesList;
    }

    public void addIngredient(Ingredient ingredient){
      ingredientsList.add(ingredient);

    }

    public void addRecipe(Recipe recipe){
        recipesList.add(recipe);

    }




}
