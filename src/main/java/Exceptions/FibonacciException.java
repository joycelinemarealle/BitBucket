package Exceptions;
public class FibonacciException extends RuntimeException{

    public FibonacciException (String message, int Integer){
        super(message); //call from RunTime Exception

    }
}

/*if it is  unchecked exception you extend  RunTimeException
*if it is checked then you extend Exception
* this case has no throwable base
*  public FibError (String message, Throwable baseException ){
        super(message, baseException);
    }*/