package exceptions;

public class TooManyTaskException extends TaskException{

    public TooManyTaskException (String msg){
        super(msg);
    }
}
