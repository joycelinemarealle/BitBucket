package eshop;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String name) {
        Product p = new Product(name);
        products.add(p);
    }
    public void addProduct(String name, double price) {
        Product p = new Product(name, price);
        products.add(p);
    }
    public void setAllVisible() {
        for(Product p : products) {
            p.setIsHidden(false);
        }
    }
    public ArrayList<Product> getProductsOnShow() {
        ArrayList<Product> visibleProducts = new ArrayList<>();
        for(Product p : products) {
            if(!p.getIsHidden()) {
                visibleProducts.add(p);
            }
        }
        return visibleProducts;
    }
    public void buyProduct(String name) {
        Product productToDelete = null;
        for(Product p : products) {
            if(!p.getName().equalsIgnoreCase(name)) {
                productToDelete = p;
            }
        }
        products.remove(productToDelete);
    }
}
