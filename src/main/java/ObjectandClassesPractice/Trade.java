package ObjectandClassesPractice;

public class Trade { //data field
    String id;
    String symbol;
    int quantity;
    double price;


    //constructor
    //same name as class
    public Trade (String id, String symbol, int quantity, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;

    }

    //second constructor if price not known
    public Trade (String id, String symbol, int quantity){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = 0.0;
    }
    //getters
    public String getId(){
        return this.id;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }

    //setters
    public void setPrice(double price){
        if(price > 0) {
            this.price = price;
        }

    }

    @Override
    public String toString(){
        return "[ id=" + id + " symbol=" + symbol + "quantity= " + quantity + " price = " + price + " ]";
    }

}
