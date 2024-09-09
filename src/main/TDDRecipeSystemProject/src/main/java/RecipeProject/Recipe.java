package RecipeProject;

import java.util.HashMap;
import java.util.Map;

public class Recipe {
    private String name;
    private int outputQuantity; //quantity of the output products eg 12 cupcakes
    private Map<Ingredient, Double> ingredients; //ingredient and its quantity(key and value)


    public Recipe(String name,  int outputQuantity) {
        this.name = name;
        this.outputQuantity = outputQuantity;
        this.ingredients = new HashMap<>();
    }
    public int getOutputQuantity() {
        return outputQuantity;
    }

    public void setOutputQuantity(int outputQuantity) {
        this.outputQuantity = outputQuantity;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Ingredient, Double> getIngredients() {
        return this.ingredients;
    }

    public void setIngredient(Map<Ingredient, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient, Double quantity) {
        ingredients.put(ingredient,quantity);
    }

    public Double calculateIngredientQuantity(Ingredient ingredient, int numberOfProducts){
        if (!ingredients.containsKey(ingredient)){
            return null;
        }
        //Get value( quantity)  from key (ingredient)
        Double basequantity = ingredients.get(ingredient);

        double totalQuantity = numberOfProducts * basequantity/this.outputQuantity;
        return totalQuantity;

    }

}
