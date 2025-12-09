public class Main
{
    public static void main(String[] args)
    {
        Notification[] notification =
                {
                      new EmailNotification("Peter", "peter@gmail.com"),
                      new EmailNotification("Michael", "michael@outlook.com")
                };

        for(Notification notification1: notification)
        {
            notification1.printInfo();
            notification1.send();
        }
    }
}