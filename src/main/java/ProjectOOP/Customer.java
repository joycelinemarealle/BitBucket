package ProjectOOP;

public class Customer {
    //attributes
    private String name;
    private String email;

    //constructor

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Getter and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
