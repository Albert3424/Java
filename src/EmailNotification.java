public class EmailNotification extends Notification
{
    String email;
    public EmailNotification(String recipient, String email)
    {
        super(recipient);
        this.email = email;
    }

    public void send()
    {
        System.out.println("Отправка email на: " + email);
    }
}
