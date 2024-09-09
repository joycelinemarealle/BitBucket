package oop;
public class ProductClass {
    private String name;
    private double price;

    public ProductClass(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void setName(String value) {
        if(value.length() > 0)
            this.name = value;
    }
    public String name() {
        return this.name;
    }
    public double price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "[name=" + name +", price=" + price + "]";
    }
}
