package tradeproject;

import java.time.LocalDateTime;

public class Order implements Comparable<Order> {
    private String symbol;
    public String getSymbol() {
        return symbol;
    }

    private int quantity;
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private double price;
    public double getPrice() {
        return price;
    }

    private LocalDateTime dateTime;
    private Status status;
    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }

    private Side side;

    public Side getSide() {
        return side;
    }

    public Order(String symbol, int quantity, double price, Side side) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
        dateTime = LocalDateTime.now();
        status = Status.Placed;
    }

    @Override
    public int compareTo(Order o) {
        return dateTime.compareTo(o.dateTime);
    }
    @Override
    public String toString() {
        return "Order [symbol=" + symbol + ", quantity=" + quantity + ", price=" + price + ", dateTime=" + dateTime
                + ", status=" + status + ", side=" + side + "]";
    }
}
enum Side { Buy, Sell }
enum Status { Placed, PartiallyFilled, Filled, Cancelled }
