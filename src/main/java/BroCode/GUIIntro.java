package BroCode;
import javax.swing.JOptionPane;
//Graphic user interface
public class GUIIntro {
    public static void main (String[] args){
        //GUI interactice
        //Initialization of value
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " +name);

        //initialize age
        // dialox returns a string need to convert from String to integer
       // int age = JOptionPane.showInternalConfirmDialog()
        // convert string to  integer
        //the message box gives answer in String
        //String age =JOptionPane.showInputDialog("Enter your age");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Age is " + age);

        //height double value
        // make sure using correct conversion converter. From String to double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm"));
        JOptionPane.showMessageDialog(null, "Height is" + height + " cm");
    }
}
