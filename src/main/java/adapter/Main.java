package adapter;

public class Main {
    public static void main(String[] args) {
        CubeToSquareAdapter adapter1 = new CubeToSquareAdapter();
        Client client = new Client(adapter1);
        System.out.println(client.square(5));
        client.setClientInterface(new SqrtToSquareAdapter());
        System.out.println(client.square(6));

    }
}
