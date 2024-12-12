package factory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logistic logistic = new LandLogistic();
        List<Transport> transportList = logistic.loadGoods(2352);
        System.out.println(transportList.size());
    }
}
