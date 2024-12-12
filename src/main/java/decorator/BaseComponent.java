package decorator;

public class BaseComponent implements Component{
    @Override
    public void execute(String message) {
        System.out.println("It is base message: "+ message);
    }
}
