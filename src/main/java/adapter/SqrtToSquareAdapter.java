package adapter;

public class SqrtToSquareAdapter implements ClientInterface{
    private RootService rootService;
    public SqrtToSquareAdapter() {
        this.rootService = new RootService();
    }
    @Override
    public int square(int num) {
        double val = rootService.root(num);
        return (int)(val * val * val * val);
    }
}
