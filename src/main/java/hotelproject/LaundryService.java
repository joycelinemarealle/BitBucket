package hotelproject;

public class LaundryService {
    private int numberOfItems;
    private int pricePerItem;

    public LaundryService(int numberOfItems, int pricePerItem) {
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
