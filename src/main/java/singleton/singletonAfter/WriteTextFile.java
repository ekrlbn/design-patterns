package singleton.singletonAfter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

    private static WriteTextFile instance;

    private WriteTextFile() {}

    public static synchronized WriteTextFile getInstance() {
        if (instance == null) {
            instance = new WriteTextFile();
        };
        return instance;
    }

    public synchronized void writeToFile(String message) {
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

}
