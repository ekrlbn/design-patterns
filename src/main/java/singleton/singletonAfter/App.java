package singleton.singletonAfter;

public class App {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            WriteTextFile writeTextFile = WriteTextFile.getInstance();
            writeTextFile.writeToFile("First thread writing");
        });

        Thread thread2 = new Thread(() -> {
            WriteTextFile writeTextFile = WriteTextFile.getInstance();
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
