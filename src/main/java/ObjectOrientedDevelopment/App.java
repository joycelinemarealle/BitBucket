package ObjectOrientedDevelopment;

public class App {
    public static void main(String[] args) {

        //initialize record to create objects
        //Product product = new Product();
        Product product1 = new Product("Plate", 3.5, 2);
        Product product2 = new Product("Oil", 0.5, 12);
        Product product3 = new Product("Shampoo", 10.78, 1);
        Product product4 = new Product("Glue", 0.5, 6);

        //Create empty array and store the objects in array
        Product[] productArray = new Product[4];
        productArray[0] = product1;
        productArray[1] = product2;
        productArray[2] = product3;
        productArray[3] = product4;

        //Call static method that prints out array
        createProductArray(productArray);

        //Call static method that changes values and print array
        System.out.println("-----------------------------");
        changePrice(product1,20);
        createProductArray(productArray);
    }
    //create a static method to return the array of records
    static void createProductArray(Product [] productArray){ //need to pass parameters in the static method. So need to pass Product record but it is array Type [] name. (Record called Product [] array then label
        for (int i = 0; i < productArray.length; i++){ //Loop to print out array
            System.out.println(productArray[i]); //print out the each productarray
        }
    }
    //create a static method to calculate total value of all items in data
    static void valueProductArray(Product [] productArray){ //need to pass parameters in the static method. So need to pass Product record but it is array Type [] name. (Record called Product [] array then label
        double sum =0;
        for (int i = 0; i < productArray.length; i++){ //Loop to print out array
           sum += productArray[i].value(); //value is a method is a method
        }
        System.out.println("\nThe total value of all items is : $ " +sum );
    }

    //static method that changes price
    public static void changePrice(Product product, double price){ //passing through every product, price
        product.setPrice(price); //every product. method that changes price, then pass through price
    }
}

/* 1 create a method in constructor file that calculates the value takes price * quantity
2 use this method in App class to calculate total value. array[i].value(). Value is a method that does the calculation
3 create method in my constructor file that can access price since data field is private
private data field useful since allows for more control in change of value
4 create a method in my App class that changes prices. It takes in product type Product, price type double. product.setPrice(price). define parameter since used them.
product. method to get price
* 5 for record need to define value calculation cant use a method for it
for recprd cant change??
*/

//Create an array to capture object
//but these objects are of different types?? How do create an array. Answer Record is they type and had different data typs int, double, String
