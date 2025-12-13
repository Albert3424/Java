package Exception;

public class InvalidAccountException extends Exception
{
    public InvalidAccountException(String error)
    {
        super(error);
    }
}
