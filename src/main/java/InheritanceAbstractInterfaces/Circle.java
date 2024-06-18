package InheritanceAbstractInterfaces;

import java.awt.*;

public class Circle extends Shape {

    private double radius;


//constructor
    public Circle (int x, int y, double radius){ //since Share takes in x,y need to pass
        super(x,y);
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return this.radius;
    }

    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //implement abstract methods
    @Override
    public double circumference() {    //since need values do not used void but define type and return method
        double circumferenceOfCircle = 2* Math.PI * radius;
       // System.out.println("\nThe circumference of the circle is " + circumferenceOfCircle + "cm");
        return circumferenceOfCircle;
    }
    @Override
    public double area() {    //since need values do not used void but define type and return method
        double areaOfCircle = Math.PI * radius * radius;
       // System.out.println("\nThe area of a circle is " + areaOfCircle + "cm2");
        return areaOfCircle;
    }

    //return values
    @Override
    public String toString (){
        return "\nA circle of radius cm " + radius + "has a circumference of " + circumference() + " and an area of " + area();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX(),getY(),(int)radius, (int)radius);

    }
}
