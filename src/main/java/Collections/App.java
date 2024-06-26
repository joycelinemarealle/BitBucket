package Collections;

import java.time.LocalDateTime;
import java.util.*;

public class App {
    public static void main(String[] args) {

        //create a map that stores the name and sortedSet of type Order
        Map<String, SortedSet<Order>> orders = new HashMap<>();
        while (true){
            System.out.println("Enter of the name of trader"); //put in loop
            Scanner scanner = new Scanner (System.in);
            String userNameInput =  scanner.nextLine();

            /*if username not in orders then create a new drawer to store this person
            * you need a drawer to store a user before adding to hashmap */
            orders.putIfAbsent(userNameInput, new TreeSet<>());

            /*Capture order details from user.
            Status and datetime does not come from user*/
            System.out.println("Enter the order  symbol");
            String symbolInput = scanner.nextLine();

            System.out.println("Enter the order quantity");
            double priceInput = scanner.nextInt();

            System.out.println("Enter the order quantity");
            int quantityInput = scanner.nextInt();

            System.out.println("Enter the order side ");
            String sideInput = scanner.nextLine();
            Side chosenSide = Side.Buy; //set to buy if not then set to sell
            if(sideInput.equalsIgnoreCase("sell")) {
                chosenSide = Side.Sell;
            }

            // add new order objects by adding user's order details
            Order order = new Order(symbolInput,priceInput,quantityInput,chosenSide);
            orders.get(userNameInput).add(order);  //name linked to order

            /* Want to compare to other keys not to myself
            get all of the keys which are NOT the userNameInput
             for each key get the SortedSet of orders from the orders map
              loop through each order
              // compare symbol has to be equal&&
                            // compare buy/sell cant be equal&&
                        // compare status &&
                        // compare price buy price has to be higher than selling price*/

            /**/
            for(String userName : orders.keySet()) {
                if(!userName.equalsIgnoreCase(userNameInput)){
                    for(Order otherOrder : orders.get(userName)) {
                        if(order.getSymbol().equalsIgnoreCase(otherOrder.getSymbol()) &&
                           !order.getSide().equals(otherOrder.getSide())  &&
                                //orders are not filled or cancelled . But it is not field since we initialized it
                           orders.getPrice() > otherOrder.getPrice()

                        ){
                            //create new trade
                        }
                    }
                }
            }

        }
    }
}


/*hash_map.keySet() returns a view of the keys in hashmap*/

 /* put in loop the questions of who is placing the order and ask
        what does this mean to switch usr mean buy to side??
        ask user for order details
        * capture that?? how since Order has 5 attributes
        * create a new object based on user input

        order buy or sell
        trade results
        hasha map has list of
        try match order from opp side
        give trade*/
