package gilts;

import java.util.ArrayList;
import java.util.List;

public class GiltPortfolio {
    private GiltPricingEngine pricingEngine;
    private List<Gilt> portfolio;
    private double balance;


    //constructor
    public GiltPortfolio(GiltPricingEngine pricingEngine, List<Gilt> portfolio, double balance) {
        this.pricingEngine = pricingEngine;
        this.portfolio = portfolio;
        this.balance = balance;
    }

    public GiltPortfolio(GiltPricingEngine pricingEngine, double balance) {
        this(pricingEngine, new ArrayList<>(), balance);
    }

    //getters
    public List<Gilt> getPortfolio() {
        return portfolio;
    }

    public double getBalance() {
        return balance;
    }


//methods
    public void buyGilt(Gilt g) {

    }

    public void sellGilt(Gilt g) {

    }

    public void tick() {

    }
}
