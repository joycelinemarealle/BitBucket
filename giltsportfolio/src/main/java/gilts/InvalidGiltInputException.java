package gilts;

public class InvalidGiltInputException extends GiltException{
    public InvalidGiltInputException(){super ("invalid gilt input");}
    public InvalidGiltInputException(Gilt g){ super ("Invalid gilt Input" + g);}
}
