package TestDrivenDevelopment;

public class BankAccountMain {
    public static void main(String[] args) {
        depositTest();
        depositNegativeTest();
        withdrawTest();
        withdrawNegativeTest();
        zeroAmountTransferTest();
        balanceGreaterThanAmountTest();
        balanceLessThanAmountTest();
    }

    public static void depositTest() {
        BankAccount b = new BankAccount(100, "Alice");
        b.deposit(100);
        assert b.getBalance() == 200;
    }

    public static void depositNegativeTest() {
        BankAccount b = new BankAccount(100, "Alice");
        b.deposit(-100);
        assert b.getBalance() == 100;
    }

    public static void withdrawTest(){
        BankAccount b = new BankAccount(100, "Alice");
        b.withdraw(10);
        assert b.getBalance() == 90;
    }
    public static void withdrawNegativeTest(){
        BankAccount b = new BankAccount(100, "Alice");
        b.withdraw(- 10);
        assert b.getBalance() == 100;

    }

    public static void zeroAmountTransferTest(){
        BankAccount giver = new BankAccount(100, "Alice");
        BankAccount receiver = new BankAccount(200, "Joy");

        //test for transfer method since returns  false
        assert giver.transfer(receiver,0 ) == false;
        assert giver.getBalance() == 100;
        assert receiver.getBalance() == 200;

    }

    public static void balanceGreaterThanAmountTest(){
        BankAccount giver = new BankAccount(100, "Alice");
        BankAccount receiver = new BankAccount(200, "Joy");

        //test for transfer method since returns true
        assert giver.transfer(receiver,20 ) == true;
        assert giver.getBalance() == 80;
        assert receiver.getBalance() == 220;
    }

    public static void balanceLessThanAmountTest(){
        BankAccount giver = new BankAccount(100, "Alice");
        BankAccount receiver = new BankAccount(200, "Joy");
        assert giver.transfer(receiver,200 ) == false;
        assert giver.getBalance() == 100;
        assert receiver.getBalance() == 200;
    }
}