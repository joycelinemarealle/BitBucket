package hellojava;

public class Variables {
    public static void main(String[] args){
        int number = 5;
        int result = number + 3;
             System.out.println("The result is:" + result);

             String toPrint = "Your result is 8"; //use String with capital S not small S
             System.out.println(toPrint);

             float decResult = number + 5.32f;
             System.out.println(decResult);

System.out.println("\nStart of the Extension");
boolean testing = true;
System.out.println(testing);

System.out.println("\nFixing code to run  exercise");
        Double d = 5.2; //use wrapper Double since can do more computations than primitive double
        int i = d.intValue(); //works because wrapped primitive double was used to initialize d
        System.out.println(i);

System.out.println("\nRounding off the decimal to whole number");
        double e = 5.2;
        int j = (int)Math.round(e);
        System.out.println(j);
    }
}
