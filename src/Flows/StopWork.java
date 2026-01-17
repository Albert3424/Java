package Flows;

public class StopWork implements Runnable
{
    private volatile boolean isRunning = true;

    @Override
    public void run() {
        System.out.println("Поток запущен...");
        while (isRunning) {
            System.out.println("Работаю...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("Поток остановлен");
    }

    public void stop() {
        this.isRunning = false;
    }
}
