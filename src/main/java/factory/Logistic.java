package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Logistic {
    private static int numberOfTransporter = 0;

    public List<Transport> loadGoods(int goods) {
        List<Transport> transports = new ArrayList<Transport>();
        while (goods > 0) {
            numberOfTransporter++;
            try {
                Transport transport = createTransport();
                transports.add(transport);
                transport.loadGoods(Math.min(transport.getCapacity(), goods));
                goods -= transport.getCapacity();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        return transports;
    }

    abstract public Transport createTransport();

}
