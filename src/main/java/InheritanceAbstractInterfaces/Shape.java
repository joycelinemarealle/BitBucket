package InheritanceAbstractInterfaces;

import java.awt.*;

public abstract class Shape implements DrawableInterface { //add implement here since circle and rectangles will get access to it

    //data fields
    private int x;
    private int y;
    private Color color; //can have type Color instead of String than having to decode


    //add constructor 1
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.BLUE; //specify initial color
    }

    //add constructor 2
    public Shape(int x, int y, Color color) {

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

    public Color getColor() {
        return this.color;
    }

    //Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color) {
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

//    //override methods found in interface
//    @Override
//   public  abstract void draw(Graphics g);
}
