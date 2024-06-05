 //add the record within a record format as seen in shop2

package hellojava;
// record is a class, another file
 public class Shop {
     public static void main(String[] args) {
         InventoryItems item1 = new InventoryItems ("juice", 3.25);
         InventoryItems item2 = new InventoryItems ("milk", 4.25);

         System.out.println(item1 + " printing item1 values");
         System.out.println(item2 + " printing item2 values");
         System.out.println(item1.name());


         //Purchase values
         System.out.println();
         Purchase purchase1 = new Purchase (item1, 2); //item 1 includes name:juice price:3.25
         Purchase purchase2 = new Purchase (item2,15); //item2 record includes name: milk , price:4.25
         System.out.println(purchase1.quantity() + " printing purchase1 values ");

         //calculating cost = sale*price
         //initialize the cost1 since decimal use doubles
         //calls old prices so need to update to call new price which is the calculatePrice
         //double cost1 = item1.price() * purchase1.quantity();
        // double cost2 = item2.price() * purchase2.quantity();

         //calls old prices so need to update to call new price which is the calculatePrice
         //Check if discounted prices applied
         double cost1 = purchase1.calculatedPrice() ;
         double cost2 = purchase2.calculatedPrice();
         //need to call the functions that can calculate price and check if discount applies or not

         //print out the two costs
         //purchase1.item().name() since record purchase includes Inventorty item which includes item contains name and price
         System.out.println("Total cost is $ " + cost1 + " for " + purchase1.item().name());
         System.out.println("Total cost is $ " + cost2 + " for "+ purchase2.item().name());

     }

 }
 //price double since decimals, name string
 record InventoryItems (String name,double price) {
 }

 // adding new record refering to the old record.Make sure to call the placehold word for old record in this case item1 or item1
 record Purchase(InventoryItems item, int quantity) {
     //create a method in the record that defines quantity
     //ensure encapsulation, main method simplicity, readability, re-usability
     //purchase record should know if discount to be applied or not?
     public Purchase {
         if (quantity <= 0) {
             System.out.println("Error! Make sure quantity is greater than 0 ");
         }
     }

     //calculated cost of purchased item defined in Purchase record
     // define as a double since decimal will be involved
     public double calculatedPrice() {
         //new price depends on discount applied
         //price initialization as double
         //price comes from record Purchase which has record item that has name and price
         double price = item.price();
         if (quantity > 5) {
             price = price * 0.8; //apply 20% discount
             System.out.println("20% discount applied for " + item.name() + " new price " + item.price());
         } else if (quantity > 10) {
             price *= 0.9; //apply 10% discount
             System.out.println("10% disocunt aplied for " + item.name() + "new price is " + item.price());
         }
         return price * quantity;

     }

 }

 /*1. Encapsulation:
Think of a record (or class) like a box that holds related things together. When we put the discount logic inside the Purchase record, we are keeping everything related to a purchase (like item details and how much it costs) in one place. This makes it easier to understand and manage.

2.Single Responsibility Principle:
This is a fancy way of saying that each part of your code should do one specific thing. The Purchase record's job is to handle purchases. It makes sense for it to know about discounts and how they affect the cost, rather than putting that logic in the main method.

3. Reusability:
By putting the discount logic in the Purchase record, you can reuse this logic whenever you create a new purchase. You don’t have to rewrite the discount rules every time you calculate a cost. It’s like having a reusable tool that works the same way every time you use it.

4. Readability and Maintainability:
When you keep the main method simple, it’s easier to read and understand what the program does at a high level. The details of how costs are calculated are tucked away in the Purchase record, making the main method less cluttered.*/
//record Purchase2 (InventoryItems item2, int quantity) {} rmove redudancy and simply use item for this record. It does not matter item1 or item2
/*public class Shop {
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
 */


/* record Sale(String item, float price, int quantity) {
}
//define the condition outside of record
public int quantity { // conditions under record
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

        } */