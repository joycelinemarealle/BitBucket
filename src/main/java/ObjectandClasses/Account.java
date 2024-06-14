package ObjectandClasses;

public class Account { //define the data field  as private. the value is price*quantity
    private double value;
    //public double value;


    //make a constructor
    public Account(double value) {
        this.value = value;  //this.value is from the class Account and value is from the constructor
    }

    //getter
    public double getValue() { //need type of return
        // no static or void because returning a value
        return this.value;
    }

    //setter
    public void setValue(double totalValue ) { //name has to match as that in the user interface
        this.value = totalValue; //total
    }


}




/* ?? pass trade so access all the private data fields
 * define constructory
 * setter contains what?
 * set getter*/