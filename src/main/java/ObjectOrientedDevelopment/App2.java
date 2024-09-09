package ObjectOrientedDevelopment;

public class App2 {
    public static void main(String[] args) {

        //initialize record to create objects
        //Product product = new Product();
        Product2 product1 = new Product2("Plate", 3.5, 2);
        Product2 product2 = new Product2("Oil", 0.5, 12);
        Product2 product3 = new Product2("Shampoo", 10.78, 1);
        Product2 product4 = new Product2("Glue", 0.5, 6);

        //Create empty array and store the objects in array
        Product2[] productArray = new Product2[4];
        productArray[0] = product1;
        productArray[1] = product2;
        productArray[2] = product3;
        productArray[3] = product4;

        //Call static method that prints out array
        createProductArray(productArray);

        //Call static method that calculate value
        valueProductArray(productArray);
    }
    //create a static method to return the array of records
    static void createProductArray(Product2 [] productArray){ //need to pass parameters in the static method. So need to pass Product record but it is array Type [] name. (Record called Product [] array then label
        for (int i = 0; i < productArray.length; i++){ //Loop to print out array
            System.out.println(productArray[i]); //print out the each productarray
        }
    }
    //create a static method to calculate total value of all items in data
    static void valueProductArray(Product2 [] productArray){ //need to pass parameters in the static method. So need to pass Product record but it is array Type [] name. (Record called Product [] array then label
        double sum =0;
        for (int i = 0; i < productArray.length; i++){ //Loop to print out array
            double value = productArray[i].price() * productArray[i].quantity();  //looping array so refere to array nameofarray.colname
            sum += value;
            //System.out.println(sum + " " + value); //prints every calculation
        }
        System.out.println("\nThe total value of all items is : $ " +sum );
    }
}


//Create an array to capture object
//but these objects are of different types?? How do create an array. Answer Record is they type and had different data typs int, double, String
