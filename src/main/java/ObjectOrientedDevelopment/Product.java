package ObjectOrientedDevelopment;

public class Product { //defined as private. These are data field
    private String name; //need to be private
    private double price;
    private int quantity;

    //define constructor that takes in data field. This is a method that holds data field and can call it
    public Product(String name, double price, int  quantity) {
        this.name = name; //this refers to data field above
        this.price = price;
        this.quantity = quantity;
    }

    //define getter that return the data field
    public String getName() {
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    @Override
    public String toString(){
        return " [name " + name + "price=" + price + "quantity=" + quantity +"]";
    }
    void print() {
        System.out.println(name + " " + price + " " + quantity);
    }
}


























