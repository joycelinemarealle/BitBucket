package hotelproject;

public class Breakfast{
    private int numberofPersons;
    private int priceBreakfast;

    public Breakfast(int numberofPersons, int priceBreakfast) {
        this.numberofPersons = numberofPersons;
        this.priceBreakfast = priceBreakfast;


    }

    public int getNumberofPersons() {
        return numberofPersons;
    }
    public int getPriceBreakfast() {
        return priceBreakfast;
    }

    public void setNumberofPersons(int numberofPersons) {
        this.numberofPersons = numberofPersons;
    }

    public void setPriceBreakfast(int priceBreakfast) {
        this.priceBreakfast = priceBreakfast;
    }
}
