package bridge;


public interface Notification {
    void send(Target target, String message);
}
