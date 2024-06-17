package InheritanceAbstractInterfaces;

public class shapeTest {
    public static void main (String [] args){
       //instantiate circle objects
        Shape shape1 = new Circle(1,3,2.13);
        Circle circle = new Circle(1,3,2.13);

//instantiate rectangle objects
        Shape shape2 = new Rectangle(5,10,2,5);
        Rectangle rectangle = new Rectangle(5,10,2,5);

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

    }

}
