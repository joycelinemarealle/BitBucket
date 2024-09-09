package RecipeProject;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    private String name;
    private double price;
    private double quantity;
    private String unit;
    private String supplierName;


    public Ingredient(String name, double price,  double quantity,String unit , String supplierName) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit= unit;
        this.supplierName = supplierName;
    }

    public Ingredient(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }


}
