package hellojava;

public class Shop {
    record Sale (String item, float price, int quantity) {
    }
    public static void main(String[] args) {
        Sale sale1 = new Sale ( " flour ", 3.25f, 10); // always create  a new
        Sale sale2 = new Sale ( " juice ", 5.6f ,3 );
        System.out.println(sale1);
        System.out.println(sale2);
        float cost1 = (sale1.price * sale1.quantity);
        float cost2 = (sale2.price * sale1.quantity);
        float totalCost = cost1 + cost2; //definite type of value
        System.out.println("Item " + sale1.item + " Total cost : $ " + cost1);
        System.out.println( "Item " +sale2.item + " Total cost : $ " + cost2);


    }
}
