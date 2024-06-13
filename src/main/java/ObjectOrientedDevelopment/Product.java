package ObjectOrientedDevelopment;

public class Product { //defined as private. These are data field
    private String name; //need to be private
    private double price;
    private int quantity;
// constructor always matches the class no void
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

    //new method that calculates the value
    public double value(){ //not taking in paremeter
        return this.price * this.quantity;
    }

    //new method setter. allows user to access price since private
    public void setPrice (double price){ //create method in my constructor file that can access price since data field is private
        if(price > 0) //user can only change if price is >0 .Private ensures that inputs can be controlled
            this.price = price;
    }
    @Override
    public String toString(){ //need to print out actual elements to not locations
        return " [name " + name + "price=" + price + "quantity=" + quantity +"]";
    }
    void print() {
        System.out.println(name + " " + price + " " + quantity);
    }
}


























