package InheritanceAbstractInterfaces;

public abstract class Shape {

    //data fields
    private int x;
    private int y;
    private String color;


    //add constructor 1
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "Red"; //specify initial color
    }

    //add constructor 2
    public Shape(int x, int y, String color) {

        this.x = x;
        this.y = y;
        this.color = color;
    }

    //getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getColor() {
        return this.color;
    }

    //Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

//create abstract method of circumference
     public abstract double circumference(); //since need values do not used void
    //create method for area
   public  abstract double  area(); //since need values do not used void

   //To print
    @Override
    public String toString() {
        return " x is " + x + " y is " + y +" color is " + color;
    }
}
