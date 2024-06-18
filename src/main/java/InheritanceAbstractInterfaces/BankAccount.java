package InheritanceAbstractInterfaces;

import java.awt.*;

public class BankAccount implements DrawableInterface{

    //define data field
    private double balance;
    private int accountNumber;


    //constructor
    public BankAccount ( double balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //getter
    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    //setters

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //toString method
    public String toString(){
        return "The bank account number of " + accountNumber + "has a balance of " + balance;

    } //if at file no need to say getAccountNumber . No need to use this.accountNumber or when not passing parameter also called accountNumber

    @Override
    public void draw(Graphics g) {
        g.drawString("Balance: " + balance , 100, 100); //because x and y not defined as attributes like shapes so put in number
        g.drawString("Account number " + accountNumber, 200,150 );
    }

    //draw method



}
