package InheritanceAbstractInterfaces;

import java.awt.*;

public class Rectangle extends Shape {
    double width;
    double height;


    //constructor
    public Rectangle(int x, int y, double width, double height) { //need to pass parameters of the parent class
        super(x, y);
        this.width = width;
        this.height = height;
    }

    //getter
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    //setter
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //need to implement abstract methods
    @Override
    public double circumference() {
        double circumferenceOfRectangle = (2 * width) + (2 * height);
      //System.out.println("\nis is the circumference of the rectangle " + circumferenceOfRectangle + "cm");
        return circumferenceOfRectangle;
    }


    @Override
    public double area() {
        double areaOfRectangle = width * height;
      //System.out.println("This is the area of the rectangle " + areaOfRectangle + "cm2");
        return areaOfRectangle;
    }
@Override
public String toString () {
return "The rectangle of width cm " + width + "and height cm " + height + "has the circumference in cm of " + circumference()+ "and area of in cm2" + area();
}

    @Override
    public void draw(Graphics g) { //
        g.setColor(getColor());//string "Red" to object so color is seen
        g.fillRect(getX(),getY(), (int)width,  (int)height); //cast to get it into int
    }

}