 package hellojava;
// record is a class, another file
record Sale(String item, float price, int quantity) {
    public Sale { // conditions under record
        if (quantity <= 0) {
            System.out.println("Error. Quantity must be greater than 0");
        }
        else if (quantity > 10) {
            price = price * 0.80f;//apply 20% discount so price now 90%
            System.out.print("10% discount applied");
        }
        else if (quantity > 5) {
            price *= 0.90f;//apply 10% discount so price now 80%
            System.out.print("10% discount applied");

        }
    }
}
public class Shop {
    public static void main(String[] args) {
        Sale sale1 = new Sale(" flour ", 3.25f, 15); // always create  a new
        Sale sale2 = new Sale(" juice ", 5.6f, 3);

        System.out.println(" ");
        //print sale1 and sale2
        System.out.println(sale1);
        System.out.println(sale2);

        //Calculate costs
        System.out.println();
        float cost1 = (sale1.price * sale1.quantity);
        float cost2 = (sale2.price * sale1.quantity);
        float totalCost = cost1 + cost2; //definite type of value

        //Print results
        System.out.println("Item " + sale1.item + " Total cost : $ " + cost1);
        System.out.println("Item " + sale2.item + " Total cost : $ " + cost2);
    }
}
