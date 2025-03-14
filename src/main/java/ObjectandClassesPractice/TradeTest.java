package ObjectandClassesPractice;
public class TradeTest {
    public static void main (String [] args){
        Trade trade1 = new Trade("T1", "APPL", 100, 15.25);
        Trade trade2 = new Trade("T2", "IBM", 50, 23.45);

        //call static method that changes price
        changePrice(trade1, -20);
        System.out.println("\nThe new price of trade1 is now " + trade1.getPrice());

        //price changes when only positive
        changePrice(trade1, 20);
        System.out.println("\nThe new price of trade1 is now " + trade1.getPrice());


        //create new object of trader
        Trader trader = new Trader ("Joe");//takes  String name
         trader.addTrade(trade1); //class.method
        System.out.println(trader.toString()); //prints out data field in trader
    }

//static method to get price
public static void changePrice(Trade trade, double price){
    trade.setPrice(price);
}
}
