public class PasswordValidator implements Validator
{
    @Override
    public boolean isValid(String input)
    {
        return input.length() >= 8;
    }
}
