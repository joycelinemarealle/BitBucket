package gilts;

public class MallonGiltPricingEngine implements GiltPricingEngine {
    private double twoYear, fiveYear, tenYear, twentyYear;
    public MallonGiltPricingEngine(double twoYear, double fiveYear, double tenYear, double twentyYear) {
        this.twoYear = twoYear;
        this.fiveYear = fiveYear;
        this.tenYear = tenYear;
        this.twentyYear = twentyYear;
    }
    @Override
    public double getPrice(Gilt g) {
        return 0.0;
    }

    public double getYield(Gilt g) {
        return 0.0;
    }

}
