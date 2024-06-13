package ObjectandClasses;

public class TradeTest {
    public static void main (String[] args){
        Trade trade1 = new Trade ("T1", "APPL", 100, 15.25);
        Trade trade2 = new Trade ("T2", "IBM", 50, 10.77); //???why not being printed out, why is there null
        Trade trade3 = new Trade ("T3", "TSL", 10, 20.22);


        //create a new array and insert objects
        Trade [] tradeArray = new Trade [3];
        tradeArray[0] = trade1;
        tradeArray[1] = trade2;
        tradeArray[2] = trade3;

        //Call static method to lists elements in array
//        createTradeArray( tradeArray); //need to also pass an array do need to define since already defined

        //Call static method that changes prices
        changePrice(trade1,20);
        System.out.println();

        //test to see if price changed
        System.out.println("\nChange price of T1 to $20");
//        createTradeArray(tradeArray);

        //testing the trader arithmetic
        //call the add trade that takes in the Trade trade
        Trader trader = new Trader("Joe") ; // it takes a paremeter String
        trader.addTrade(trade2); //passing a Trade objects trade1 through trader class .addTrade is a method /


        // Print the value in the trader's account somehow
        // You will have to add a method to the Trader class
        System.out.println(trader.toString()); //print out trader.toString  need to say toString to print out account amount
        trader.addTrade(trade3);
        System.out.println(trader.toString());;
    }

    //Create an array to take in all Trade objects
    public static void createTradeArray ( Trade trade){ //passing through tradearray of type Trade

    }

    //Call static method to change price
    public static void changePrice(Trade trade, double price){ //void since not returning anything
        trade.setPrice(price); //every trade in array can change price
    }
}

/*What this does is that it updates the balance of individual trading
* So, from trader.addmethod() pass the Trade object trade1, trade2 or trade3
* then it goes to my trade class sees the parameters defined
* The find the addTrade method in Trader ( trader.addTrade) then do what the method has to do is calculated value and add exisiting
* get.value from Account class
* then in Trader class what is String to String will be printed out . the name and print trader.toString*/
//new trade
// call add trade method
// let me print out need it in trader class so when i call add Trade it prints out

/*create a setter for price and put condition if (price>0) since price is private and need to access it
Create static method to change price using a setter
Create an array that stores the
insert objects to array
Static method that prints out element in array
create a new trade object and change price
Call function in main that calls static method change price
* */