package Exceptions;

public class Calc {
    public static void main(String[] args) {
        try {

            System.out.println(divide(20, 0));

        } catch(CalcError e) {
            System.out.println(e.getMessage());
            if(e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    static int divide(int a, int b) throws CalcError {
        try {
            return a / b;
        } catch(ArithmeticException e) {
            throw new CalcError("Could not calculate", e);
        }
    }

}
class CalcError extends Exception {
    public CalcError(String message) {
        super(message);
    }
    public CalcError(String message, Throwable baseException) {
        super(message, baseException);
    }
}
