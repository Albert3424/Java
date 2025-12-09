public abstract class Notification
{
    String recipient;

    public Notification(String recipient)
    {
        this.recipient = recipient;
    }

    abstract void send();

    void printInfo()
    {
        System.out.println(recipient);
    }
}
