package Collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Order implements Comparable <Order>{
    private String symbol;
    private double price;
    private  int quantity;
    private Side side;
    private Status status;
    private LocalDateTime dateTime;

    /*Return what you would like to order by */
    @Override
    public int compareTo(Order o) { //o is the other
        return dateTime.compareTo(o.dateTime);
    }

    //constructor
    public Order(String symbol, double price, int quantity, Side side) {
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
        this.side = side;
        this.dateTime = LocalDateTime.now();
        this.status = Status.Placed;

    }

    //setters and getters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }
}

enum Side {Buy, Sell};

enum Status {Placed, PartiallyFilled, Filled, Cancelled}
