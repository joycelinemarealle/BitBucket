package ObjectandClasses;

public class Trade { //date field are private
    private String id;
    private String symbol;
    private int quantity;
    private double price;

//constructor,getter, are all within the class
    // a constructor
    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;

    }

    //second constructor without price
    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = 0; //assign as 0 since not passing it into the class
    }

    // a getter
    public String getid() {  //no void because there is return //need to define type
        return this.id;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
            return this.price;
    }

    //setter for price
    public void setPrice(double price) {//void
        if ( price > 0)
            this.price = price;  //the price will be passed from user's interface
    }

    //setter for price
    public void setQuantity(int quantity) {//void
            this.quantity = quantity;  //the price will be passed from user's interface
    }
    @Override
    public String toString() {
        return "[ id = " + id + " , symbol = " + symbol + " , quantity =  " + quantity + " , price = $" + price + " ] ";
    }
}