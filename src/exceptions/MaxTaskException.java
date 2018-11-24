package exceptions;

public class MaxTaskException extends TaskException{

    public MaxTaskException(){
    }

    public MaxTaskException(String msg){
        super(msg);
    }
}
