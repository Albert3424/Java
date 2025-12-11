package Validator;

public class EmailValidator implements Validator
{
    @Override
    public boolean isValid(String input)
    {
        int s = input.indexOf('@');
        return s > 0 && input.indexOf('.', s) > s;
    }
}
