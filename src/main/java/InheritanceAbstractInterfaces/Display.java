package InheritanceAbstractInterfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;


public class Display {
    private static JPanel canvas;

    public static void main(String[] a) {
        initGUI();
    }

    private static void drawAllShapes(Graphics g) {
        //TODO: Implement me

        //Create a list than captures object
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(150, 200, 20));
        shapes.add(new Circle(100, 100, 150));
        shapes.add(new Rectangle(100, 150, 200, 150));
        shapes.add(new Rectangle(50, 60, 70, 80));

        //Loop to insert the objects in the list
        for (Shape element: shapes) { //for each loop Type temporary holder for element : name of list/array
            element.draw(g); //call temporary holder.method
            System.out.println("Added shape " + element);
        }

        //Draw bank account
        BankAccount bankAccount = new BankAccount(1000, 245);
        bankAccount.draw(g);
    }

    private static void initGUI() {
        JFrame frame = new JFrame("Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new JPanel() {
            public void paintComponent(Graphics g) {
                drawAllShapes(g);
            }
        };
        canvas.setPreferredSize(new Dimension(500, 500));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
}

// loop through shapes
//      for each one call draw

//Draw circle
//Shape circle = new Circle(150, 200, 200);
// circle.draw(g);

//Draw rectangle
//Shape rectangle = new Rectangle(100, 150, 200, 150);
// rectangle.draw(g);
