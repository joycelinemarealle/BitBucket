package exceptions2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Name?");
        String name = s.nextLine();

        Account a = new Account(name);
        Account o = new Account("2345345");
        do {
            System.out.println(a);
            System.out.println(o);
            System.out.println("Debit/Credit/Transfer?");
            String action = s.nextLine();
            System.out.println("How much?");
            double amount = Double.parseDouble(s.nextLine());
            if(action.equals("Debit")){
                try {
                    a.debit(amount);
                } catch(NotEnoughFundsException exception) {
                    System.err.println(exception.getMessage());
                }
            } else if(action.equals("Credit")) {

                a.credit(amount);

            } else {

                try {
                    a.transferTo(o, amount);
                } catch (NotEnoughFundsException e) {
                    System.err.println(e.getMessage());
                } catch (HitDailyLimitException e) {
                    System.err.println(e.getMessage());
                }
            }
        }while(true);
    }
}
