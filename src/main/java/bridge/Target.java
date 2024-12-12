package bridge;

public class Target {
    private static int ID = 0;
    private int id;
    private Byte[] address;

    public Target(Byte[] address) {
        if (address.length != 4) throw new IllegalArgumentException();
        id = ID;
        ID++;
        this.address = address;
    }

    public Byte[] getAddress() {
        return address;
    }

    public void setAddress(Byte[] address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
