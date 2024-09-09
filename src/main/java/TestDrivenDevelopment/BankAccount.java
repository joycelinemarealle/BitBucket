package TestDrivenDevelopment;

public class BankAccount {


    public BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    private int balance;
    private String name;

    public int withdraw(int amount) {
        if ( amount > 0){
            balance -= amount;
            return amount;
        } else {
            return 0;
        }

    }

    public int deposit (int amount) {
        if (amount > 0 ) {
            balance += amount;
            return amount;
        } else{
            return 0;
        }

    }

    public boolean transfer(BankAccount receiver, int amount) {

        //if withdraw amount <-0 no transfer happens
        if ( amount <= 0){
            return false;

            //if balance > than withdraw amount then allow transfer
        } else if ( this.balance > amount ) {
            int toTransfer = this.withdraw(amount); //returns amount
            receiver.deposit(toTransfer);
            return true; //transfer completed

        }//if balance < than withdraw amount not transfer happens
       else if ( this.balance < amount){
           return false;

        } else{
           return false;
        }
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
//doing unit testing