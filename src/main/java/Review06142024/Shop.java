/* package Review06142024;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Shop {
    public static void main(String[] args) {
        static void displayProducts(ArrayList<Product> products, boolean )
    }
        Scanner scanner = new scanner (System.in);
        ArrayList <Product> products =new ArrayList<>();
        while(true){
            System.out.println(
                    "1. Add product"
            );
            String input = scanner.nextLine();
            if (input.equals("1")){
                System.out.println("Product name");
                String name = scanner.nextLine();

                System.out.println("do you want to set price");
                boolean setPrice = Boolean.parseBoolean(scanner.nextLine().equalsIgnoreCase("yes"));

                Product product;
                if(setPrice){
                    System.out.println("Product price");
                    double price = Double.parseDouble(scanner.nextLine()); //convert string to a double
                    Product product = new Product(name, price)
                } else{
                    product = new Product (name);
                }

                products.add(product);

                for (Product p:products){
                    System.out.println();
                }

            }
        }

    }
}
*/