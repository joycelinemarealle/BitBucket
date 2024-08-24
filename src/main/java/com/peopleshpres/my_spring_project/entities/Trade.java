package com.peopleshpres.my_spring_project.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Trade implements Serializable {
    public enum Side {BUY, SELL}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticker;
    private Double price;
    private  Integer volume;
    private Side side;

    public Trade (){}

    public Trade (String ticker ,Double price, Integer volume, Side side){
        this.ticker = ticker;
        this.price = price;
        this.volume = volume;
        this.side = side;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicker(){
        return this.ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", ticker='" + ticker + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return Objects.equals(id, trade.id) && Objects.equals(ticker, trade.ticker) && Objects.equals(price, trade.price) && Objects.equals(volume, trade.volume) && side == trade.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ticker, price, volume, side);
    }
}
