import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        long totalBytes = 0;
        long zeroBytes = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.bin"))) {

            int currentByte;
            while ((currentByte = bis.read()) != -1) {
                totalBytes++;
                if (currentByte == 0) {
                    zeroBytes++;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("stats.txt"))) {

            writer.write("Total bytes: " + totalBytes);
            writer.newLine();
            writer.write("Zero bytes: " + zeroBytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
