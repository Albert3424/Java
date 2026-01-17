import java.util.concurrent.locks.ReentrantLock;

public class ResourceManager {
    private final ReentrantLock resourceA = new ReentrantLock();
    private final ReentrantLock resourceB = new ReentrantLock();

    public void accessResources() {
        String threadName = Thread.currentThread().getName();

        while (true) {
            boolean lockAGotten = false;
            boolean lockBGotten = false;

            try {
                System.out.println(threadName + ": пытаюсь взять ResourceA...");
                lockAGotten = resourceA.tryLock();

                if (lockAGotten) {
                    System.out.println(threadName + ": захватил ResourceA");

                    System.out.println(threadName + ": пытаюсь взять ResourceB...");
                    lockBGotten = resourceB.tryLock();

                    if (lockBGotten) {
                        System.out.println(threadName + ": захватил ResourceB. Работаю...");
                        Thread.sleep(500);
                        System.out.println(threadName + ": работа закончена.");
                        return;
                    } else {
                        System.out.println(threadName + ": не смог взять ResourceB, отпускаю ResourceA и пробую снова...");
                    }
                } else {
                    System.out.println(threadName + ": не смог взять ResourceA, жду...");
                }
            } catch (InterruptedException e) {
                System.out.println(threadName + ": был прерван.");
                Thread.currentThread().interrupt();
                return;
            } finally {
                if (lockBGotten) {
                    resourceB.unlock();
                    System.out.println(threadName + ": освободил ResourceB");
                }
                if (lockAGotten) {
                    resourceA.unlock();
                    System.out.println(threadName + ": освободил ResourceA");
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
