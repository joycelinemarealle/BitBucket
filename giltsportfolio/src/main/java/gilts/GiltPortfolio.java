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


//Buy Gilt method
    public void buyGilt(Gilt g)   {
        //get price
        double price = pricingEngine.getPrice(g);

        //if price >= than balance then add gilt in portfolio
        if ( this.balance >= price ){
            portfolio.add(g);
            balance -= price;
        } else {
            throw new CantAffordGiltException();
        }
    }

    //Sell Gilt Method
    public void sellGilt(Gilt g) {
        double price = pricingEngine.getPrice(g);
if ( portfolio.remove(g)){
    balance += price;
}
    }

    //Tick method
    public void tick() {
        //collect interest, check if gilt expired, remove from portfolio
        List <Gilt > expiredGilts = new ArrayList<>();
        //Loop through each gilt in portfolio and add interest to balance
        for (Gilt gilt : portfolio){
            this.balance += gilt.tick();
            //check if gilt expired and if year add to list for expired gilts
if (gilt.expired()){
    expiredGilts.add(gilt);
}
        }

        //Remove all expired Gilts from portfolio array list
        portfolio.removeAll(expiredGilts);

    }
}
