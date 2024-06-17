package eshop;

public class Product {
    private String name;
    private double price;
    private boolean isHidden;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.isHidden = true;
    }
    public Product(String name) {
        this(name, 0.0);
    }
    public String getName() {
        return name;
    }
    public void setPrice(double value) {
        price = value;
    }
    public void setIsHidden(boolean value) {
        isHidden = value;
    }
    public boolean getIsHidden() {
        return isHidden;
    }

}

