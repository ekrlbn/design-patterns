package adapter;

public class CubeToSquareAdapter implements ClientInterface{

    private CubeService cubeService;

    public CubeToSquareAdapter() {
        this.cubeService = new CubeService();
    }

    @Override
    public int square(int num) {
        return cubeService.cube(num) / num;
    }
}
