package singleton.singletonBefore;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public void writeToFile(String message) {
        String cwd = System.getProperty("user.dir");

        String filePath = cwd + "\\src\\main\\resources\\" + "output.txt"; // File path to write to

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            Thread.sleep(1000);
            fileWriter.write(message + System.lineSeparator());
            System.out.println(message + " appended to file.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            WriteTextFile writeTextFile = new WriteTextFile();
            writeTextFile.writeToFile("First thread writing");
        });

        Thread thread2 = new Thread(() -> {
            WriteTextFile writeTextFile = new WriteTextFile();
            writeTextFile.writeToFile("Second thread writing");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }
}
