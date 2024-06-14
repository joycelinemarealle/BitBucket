package ObjectandClassesPractice;

public class Account {
    double value;

    //constructor
    public Account(double value) {
        this.value = value;

    }
    //getter //type of return
    public double getValue() {
        return this.value;
    }

    //setter void since no return
    public void setValue(double value) {
        this.value = value;
    }
}

