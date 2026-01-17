import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Main
{
    public static void main(String[] args)
    {
        /*input.txt*/
        try (RandomAccessFile aFile = new RandomAccessFile("input.txt", "r");
             FileChannel inChannel = aFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(64);
            int bytesRead = inChannel.read(buffer);

            while (bytesRead != -1) {
                buffer.flip();

                while (buffer.hasRemaining()) {
                    System.out.print(StandardCharsets.UTF_8.decode(buffer).toString());
                }

                buffer.clear();
                bytesRead = inChannel.read(buffer);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*source.txt*/
        String sourceFile = "source.bin";
        String destFile = "copy.bin";
        int bufferSize = 1024;

        try (FileChannel sourceChannel = new FileInputStream(sourceFile).getChannel();
             FileChannel destChannel = new FileOutputStream(destFile).getChannel())
        {
            ByteBuffer buffer = ByteBuffer.allocate(bufferSize);
            int bytesRead;

            while ((bytesRead = sourceChannel.read(buffer)) != -1)
                buffer.flip();

            destChannel.write(buffer);
            buffer.clear();
            System.out.println("Файл успешно скопирован!");

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
         }

        /*ResourceManager*/
        ResourceManager manager = new ResourceManager();

        Thread thread1 = new Thread(manager::accessResources, "Поток-1");
        Thread thread2 = new Thread(manager::accessResources, "Поток-2");

        thread1.start();
        thread2.start();
    }
}
