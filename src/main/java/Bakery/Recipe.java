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
        if (this.quantityOutput <= 0) {
            throw new IllegalArgumentException();
        } else {
            return quantityOutput;
        }
//        return quantityOutput;
    }

    public void setQuantityOutput(int quantityOutput) {
      this.quantityOutput = quantityOutput;
    }

    public void addIngredient(Ingredient ingredient, Double quantity) {
        if (ingredient == null) {
            throw new IllegalArgumentException();
        } else {
            ingredients.put(ingredient, quantity);
        }
    }

    public double amountOfIngredient(Ingredient ingredient){
     return  ingredients.get(ingredient);
    }

    public double calculateQuantityOfIngredients(Ingredient ingredient, int newProduct){
        double originalQuantity = ingredients.get(ingredient);
        int originalProduct = this.quantityOutput;
       return newProduct * originalQuantity/ originalProduct;
    }

    public double calculateCostOfIngredient(Ingredient ingredient){
      double quantityInRecipe =   ingredients.get(ingredient);
      double priceOfIngredients = ingredient.getPrice();
      int quantityOfIngredient = ingredient.getQuantity();
        return  quantityInRecipe*priceOfIngredients/quantityOfIngredient;
    }
public double calculateUnitCost() {
    double totalCost = 0.0;
        for(Ingredient i : ingredients.keySet()){
            totalCost+= calculateCostOfIngredient(i);
        }
       double costPerUnit = totalCost/this.getQuantityOutput();
   return costPerUnit;
}

public  double calculatePrice(double profitMargin) {
        double price =  this.calculateUnitCost()*  (1 + profitMargin);
        return  price;
}

//    public double calculatePrice(Ingredient ingredient, int profitMargin){
//
//        double quantityInRecipe =   ingredients.get(ingredient);
//        double priceofIngredients = ingredient.getPrice();
//        int quantityOfIngredient = ingredient.getQuantity();
//
//        double costOfIngredient = quantityInRecipe*priceofIngredients/quantityOfIngredient;
//    }

}
