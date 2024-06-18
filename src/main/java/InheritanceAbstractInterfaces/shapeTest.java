package InheritanceAbstractInterfaces;

public class shapeTest {
    public static void main (String [] args){
       //instantiate circle objects
        Shape shape1 = new Circle(50, 50, 100);
        Circle circle = new Circle(50, 50, 100);

//instantiate rectangle objects
        Shape shape2 = new Rectangle(100, 150, 200, 150);
        Rectangle rectangle = new Rectangle(100, 150, 200, 150);

//Test circle methods for circumference and area
         double circumference = circle.circumference(); //need to capture it in the interface so double circumference
        double area = circle.area();

   //Test rectangle methods for circumference and area
   rectangle.circumference();
   rectangle.area();

        //use the to string method for circle
        System.out.println(circle);  //System.out.println(circle.toString); can simply call circle and it will return string


        //use the toString method for rectangle
        System.out.println(rectangle); //System.out.println(rectangle.toString); can simply call rectangle and it will return string



        //call methods from rectangle
//        rectangle.draw(5,10,2,5);
//
//        //call methods that draw circle
//        circle.draw(1,3,2.13);
    }

}
