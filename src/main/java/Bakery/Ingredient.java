package Bakery;

public class Ingredient {
    private String name;
    private double price;
    private int quantity;
    private String unit;
    private String supplierName;

    public Ingredient(String name, double price, int quantity, String unit, String supplierName) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
