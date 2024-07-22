package gilts;

public class Gilt {
    private double coupon; // Interest (absolute: i.e. how much are they being paid?)
    private double principal; // Face value
    private int yearsRemaining; // Years remaining on the bond


    //constructor
    //create new object only if valid input
    public static Gilt create(double coupon, double principal, int yearsRemaining) {
        if (coupon > 0 && principal > 0 && yearsRemaining > 0) {
            return new Gilt(coupon, principal, yearsRemaining);
        }
//        else if (yearsRemaining == 0){
//            throw new AlreadyExpiredGiltException();
//        }
        else {
            throw new InvalidGiltInputException();
        }
//if coupon or principal or yearsRemainng not doubles or int then throw message
    }

    public Gilt(double coupon, double principal, int yearsRemaining) {
        this.coupon = coupon;
        this.principal = principal;
        this.yearsRemaining = yearsRemaining;
    }

    public Gilt(double coupon, int yearsRemaining) {
        this(coupon, 100, yearsRemaining);
    }

    //getters
    public double getCouponPercent() {
        return coupon / principal;
    }

    public double getCoupon() {
        return coupon;
    }

    public double getPrincipal() {
        return principal;
    }

    public int getYearsRemaining() {
        return yearsRemaining;
    }


//methods
    public boolean expired() {
        return this.yearsRemaining <= 0;
    }

    public double tick() {
        if (this.expired()) {
            throw new AlreadyExpiredGiltException(this);
        }
        this.yearsRemaining -= 1;
        if (this.yearsRemaining >= 1) {
            return this.coupon;
        } else {
            return this.coupon + this.principal;
        }
    }


}
