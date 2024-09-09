/*package tradeproject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Trade implements Comparable<Trade> {
    @Override
    public String toString() {
        return "Trade [symbol=" + symbol + ", quantity=" + quantity + ", price=" + price + ", dateTime=" + dateTime
                + "]";
    }
    private String symbol;
    private int quantity;
    private double price;
    private LocalDateTime dateTime;
    public Trade(String symbol, int quantity, double price) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.dateTime = LocalDateTime.now();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
        result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trade other = (Trade) obj;
        if (symbol == null) {
            if (other.symbol != null)
                return false;
        } else if (!symbol.equals(other.symbol))
            return false;
        if (quantity != other.quantity)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (dateTime == null) {
            if (other.dateTime != null)
                return false;
        } else if (!dateTime.equals(other.dateTime))
            return false;
        return true;
    }
    @Override
    public int compareTo(Trade o) {
        return dateTime.compareTo(o.dateTime);
    }*/