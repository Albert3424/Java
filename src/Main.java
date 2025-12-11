public class Main
{
    public static void main(String[] args)
    {
        Validator email = new EmailValidator();
        Validator password = new PasswordValidator();

        System.out.println(email.isValid("q@gmail.com"));
        System.out.println(email.isValid("@gmail"));
        System.out.println(password.isValid("12345678"));
        System.out.println(password.isValid("123"));
    }
}