package hotelproject;

public class RoomService {
    private int numberofPerson;
    private  int pricePerMeal;

    public RoomService(int numberofPerson, int pricePerMeal) {
        this.numberofPerson = numberofPerson;
        this.pricePerMeal = pricePerMeal;
    }

    public int getNumberofPerson() {
        return numberofPerson;
    }

    public void setNumberofPerson(int numberofPerson) {
        this.numberofPerson = numberofPerson;
    }

    public int getPricePerMeal() {
        return pricePerMeal;
    }

    public void setPricePerMeal(int pricePerMeal) {
        this.pricePerMeal = pricePerMeal;
    }


}
