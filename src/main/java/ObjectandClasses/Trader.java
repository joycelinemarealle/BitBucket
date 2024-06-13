package ObjectandClasses;

public class Trader { //no need of main
    private Account account;  //type of account is Account
    private String name;

    //add constructor
    public Trader(String name) { //only name since initial account is zero
        this.name = name;
        this.account = new Account(0); //since objecct cant say = 0
    }

     public void addTrade(Trade trade) { //need to pass the array trade of type Trade

        double existingValue = account.getValue();  //existing value of account
        //calculate value by calling trade classes. we use getPrice(
        double totalValue = existingValue + (trade.getPrice() * trade.getQuantity()); //adding to previous class
        account.setValue(totalValue); //pass the value of totalValue into the setter

         //account.value += trade.getPrice() * trade.getQuantity();
    }

    //get account values
    public Account getAccount(){
        return this.account;
    }

    public String toString() {
        return "Trader: " + name + " has the current balance: " + account.getValue();
    }
}

//we use getter when not passing any value , not changing anything
//we use setter if need to change. eg user changes the price
//overide + method

// get current value of account
// calculate total value of trade
// add the two things above together
// set the value of the account to this new total

//account// ??? do i pass through Account and Trade to access the private data field??
//?? where do i define the value calculation??
//  ???how do i add it to account object
//Trade.setPrice(price)


/* value is price * quantity
add value to existing value of Account object
* */
