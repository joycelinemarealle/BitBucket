package gilts;

public class InvalidYieldPercentage extends GiltException{
    public InvalidYieldPercentage() { super ("Invalid Yield Percetange");
    }
    public InvalidYieldPercentage(GiltPricingEngine pricer) { super ("Invalid Yield Percetange");
    }
}
