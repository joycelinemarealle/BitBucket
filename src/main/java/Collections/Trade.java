package Collections;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Trade implements Comparable<Trade>{
    private String symbol;
    private int quantity;
    private double price;
    LocalDateTime dateTime;

    //Hashcode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return quantity == trade.quantity && Double.compare(price, trade.price) == 0 && Objects.equals(symbol, trade.symbol) && Objects.equals(dateTime, trade.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, quantity, price, dateTime);
    }

    //Comparable
    @Override
    public int compareTo(Trade o) {
        return dateTime.compareTo(o.dateTime);
    }
}
