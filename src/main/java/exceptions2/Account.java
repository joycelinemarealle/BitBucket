package exceptions2;

public class Account {
    private int dailyLimit = 250;
    private double balance;
    private String name;
    public Account(String name) {
        this.name = name;
    }
    public void credit(double amount) {
        this.balance += amount;
    }
    public void debit(double amount) throws NotEnoughFundsException {
        if(this.balance - amount < 0) {
            throw new NotEnoughFundsException("Not enough in your balance to debit " + amount);
        }
        this.balance -= amount;
    }
    public void transferTo(Account other, double amount) throws NotEnoughFundsException, HitDailyLimitException {
        if(balance - amount < 0) {
            throw new  NotEnoughFundsException("Not enough in your balance to transfer " + amount);
        }
        if(dailyLimit - amount < 0) {
            throw new HitDailyLimitException("Hit daily transfer limit");
        }
        other.credit(amount);
        balance -= amount;
        dailyLimit -= amount;
    }

    @Override
    public String toString(){
        return "Account[" + name + ", balance £" + balance + "]";
    }
}
