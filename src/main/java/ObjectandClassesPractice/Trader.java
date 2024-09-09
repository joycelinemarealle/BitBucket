package ObjectandClassesPractice;

public class Trader {
    String name;
    Account account ; //account of type Account


    //constructor
    //since I do not know value in account I only pass name and set value in account to zero assume  value in account
    public Trader (String name){
        this.name = name;
        this.account = new Account (0.0); //new object Account that holds double value. Set value = 0

    }

    //getter
    public String getName(){
        return this.name;
    }

    //getter
    public Account getAccount(){
        return this.account;
    }

    //setter
    //method that add trade
    // not static
    public void addTrade(Trade trade){ //to access the price + quantity pass Trade class
       double existingValue = account.getValue(); //class.method
       double value = trade.getPrice() * trade.getQuantity(); //class.method
       double totalValue = existingValue + value;

       //need to set new value
        account.setValue(totalValue);
    }

    @Override
    public String toString(){
        return  "[ Name " + name + "the balance of account " +  account.getValue() +" ]" ;
    }
}
