package decorator;

public class Main {
    public static void main(String[] args) {
        BaseComponent component = new BaseComponent();
        Facebook facebook = new Facebook(component);
        Twitter twitter = new Twitter(facebook);
        twitter.execute("You have won 2 billion!");
    }
}
