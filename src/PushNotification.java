public class PushNotification extends Notification
{
    int deviceID;
    public PushNotification(String recipient, int deviceID)
    {
        super(recipient);
        this.deviceID = deviceID;
    }

    public void send()
    {
        System.out.println("Push на устройство: " + deviceID);
    }
}
