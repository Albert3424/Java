public class Main
{
    public static void main(String[] args)
    {
        ResourceManager manager = new ResourceManager();

        Thread thread1 = new Thread(manager::accessResources, "Поток-1");
        Thread thread2 = new Thread(manager::accessResources, "Поток-2");

        thread1.start();
        thread2.start();
    }
}
