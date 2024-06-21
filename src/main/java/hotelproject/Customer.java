package hotelproject;

public class Customer {
    private String name;
    //private int id ;


    public Customer(String name) {
        this.name = name;
        //this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
