package gilts;

public class MallonGiltPricingEngine implements GiltPricingEngine {
    private double twoYear, fiveYear, tenYear, twentyYear;

    //only create object if input valid

     public static MallonGiltPricingEngine create (double twoYear, double fiveYear, double tenYear, double twentyYear){
        if (twoYear <= 0 || fiveYear <=0 || tenYear<=0 || twentyYear <=0 ) {
            throw new InvalidYieldPercentage();
        }
            return new MallonGiltPricingEngine(twoYear, fiveYear, tenYear, twentyYear);
    }
    public MallonGiltPricingEngine(double twoYear, double fiveYear, double tenYear, double twentyYear) {
        this.twoYear = twoYear;
        this.fiveYear = fiveYear;
        this.tenYear = tenYear;
        this.twentyYear = twentyYear;
    }

    @Override
    public double getPrice(Gilt g) {
        //price depends on the yield percentage which depends on years remaining
        double price = ((2 * g.getYearsRemaining() * g.getCoupon()) - (g.getYearsRemaining() * g.getPrincipal() * this.getYield(g) / 100) +
                (2 * g.getPrincipal())) / (g.getYearsRemaining() * this.getYield(g) / 100 + 2);
        return price;
    }

    public double getYield(Gilt g) {
        double yieldpercetange;
        if (g.getYearsRemaining() == 1 || g.getYearsRemaining() == 2) {
            yieldpercetange = this.twoYear;

        } else if (g.getYearsRemaining() >= 3 && g.getYearsRemaining() <= 5) {
            yieldpercetange = this.fiveYear;
        } else if (g.getYearsRemaining() >= 6 && g.getYearsRemaining() <= 10) {
            yieldpercetange = this.tenYear;
        } else {
            yieldpercetange = this.twentyYear;
        }
        return yieldpercetange;

    }

}
