package day42_Exceptions;
class FadyException extends RuntimeException{

}
class NoBreakException extends RuntimeException{ //custom Unchecked exception

}

public class CustomExceptions {
    public static void main(String[] args) {
        throw new FadyException();
    }
}
