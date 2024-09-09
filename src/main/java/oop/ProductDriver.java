package oop;

public class ProductDriver {
    public static void main(String[] args) {
        ProductClass pokemonGold = new ProductClass("Pokemon Gold", 9.99);

        String myToString = pokemonGold.toString();

        System.out.println(myToString);

        System.out.println(pokemonGold.name());
        System.out.println(pokemonGold.price());

        // String gameName = pokemonGold.name();
        // double gamePrice = pokemonGold.price();

        // pokemonGold.name();
    }
}
