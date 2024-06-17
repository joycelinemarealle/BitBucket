package eshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Gui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        while (true) {
            System.out.println(
                    "1. Add product\n" +
                            "2. Show product");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Product name");
                String name = scanner.nextLine();

                System.out.println("Do you want to set the price?");
                boolean setPrice = scanner.nextLine().equalsIgnoreCase("yes");

                if (setPrice) {
                    System.out.println("Product price");
                    double price = Double.parseDouble(scanner.nextLine());
                    shop.addProduct(name, price);
                } else {
                    shop.addProduct(name);
                }

                displayProducts(shop.getProductsOnShow());
            } else if (input.equals("2")) {
                displayProducts(shop.getProductsOnShow());
                System.out.println("----------------------");
                shop.setAllVisible();
                System.out.println("----------------------");
                displayProducts(shop.getProductsOnShow());
            }

        }
    }

    static void displayProducts(ArrayList<Product> products) {
        for (Product p : products) {

            System.out.println(p.getName());

        }
    }
}
