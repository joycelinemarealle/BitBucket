package Bakery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

//    // method to batcht(recipe) to batch
//    public void addProduct(Recipe recipe, int quantity) {
//        desiredOutput.put(recipe,quantity);
//    }

    public Map<Ingredient, Double> overallIngredientAmount(Recipe... recipes){
        Map <Ingredient,  Double> totalIngredient = new HashMap<>();
        for (Recipe recipe: recipes){
            for (Ingredient ingredient : recipe.getIngredients().keySet()){

                double ingredientAmount = recipe.getIngredients().get(ingredient);

                if(totalIngredient.containsKey(ingredient)){
                    //add the ingredientAmount
                    double v = ingredientAmount + totalIngredient.get(ingredient);
                    totalIngredient.put(ingredient,v);
                } else{
                    totalIngredient.putIfAbsent(ingredient,ingredientAmount);

                }
            }

           
        }
        return totalIngredient;
    }

    public double calculateCostOfIngredient(Ingredient ingredient, double quantityInMap){
        //double quantityInMap =   overallIngredientAmount().get(ingredient);
        double priceOfIngredients = ingredient.getPrice();
        int quantityOfIngredient = ingredient.getQuantity();
        return  quantityInMap*priceOfIngredients/quantityOfIngredient;
    }

    public double calculateTotalCostForBatch(Recipe... recipes) {
        double totalCost = 0.0;
        Map<Ingredient, Double>  totalIngredient = overallIngredientAmount(recipes);
        for (Ingredient i : totalIngredient.keySet()) {
            totalCost += calculateCostOfIngredient(i, totalIngredient.get(i));
        }
        return totalCost;
    }


    @Override
    public String toString() {
        return "IngredientManager{" +
                "ingredients=" + ingredients +
                '}';
    }

}

//
//    }
// method which takes a list of recipes
// sets up a Map<Ingredient, Double> for ingredients and quantity
// loops through each recipe passed in
//    gets lis of ingredients
//        puts each ingredient and its quantity into the map
//        if the map already contains the ingredient
//           add to the quantity
// return the map
// e.g. chocolate cake and coconut cup-cakes
// 1 chocolate cake requires -> 1 flour, 1 sugar, 250 butter, 200 milk, 500 chocolate
// 12 coconut cup-cakes requires -> 1 flour, 1 sugar, 200 butter, 400 coconut flakes
// therefore map contains -> flour 2, sugar 2, butter 450, milk 200, chocolate 500, coconut flakes 400

