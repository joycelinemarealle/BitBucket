/*package Review06142024;

public class Product { //primarry constructor
    private String name;
    private double price;
    private boolean isHidden;

    public Product(String name, double price){
        this.name = name;
        this.price= price;
        this.isHidden = true; //hids if price not known for product

    }
    //if not know price can have product with just in name. Product with name but no price
public Product (String name){
        this.name=name;
        this.price = 0.0; //set this as zero since do not know price. Need to get products.
    //good practice so others to know you intentionally set to zero
}

//second way of delcaring price 0. the namebleow gets passed throug constructor then equal to name in constructor
//public Product(String name){
     //   this(name, price:0.0);
//}

//getter aces
    public String getName(){
        return name;
    }

    //setter mno return, but pass parameters so need to say this.price = price of setter
    public void setPrice(double value){
        this.price = value;
    }
    //field that product only displayed in shop if wanted to . so setter or method?
    public void setIsHidden(boolean value){
        isHidden = value;  //prevent product from shown if price not known
    }
    public boolean getIsHidden(){
        return isHidden;
    }
}
*/