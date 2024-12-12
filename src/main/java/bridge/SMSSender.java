package bridge;

import java.util.Collection;

public class SMSSender extends NotificationSender{
    public SMSSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send(Target target, String message) {
        System.out.println("Sending SMS");
        super.send(target, message);
    }

    @Override
    public void broadcastSend(Collection<Target> targets, String message) {
        System.out.println("Broadcasting SMS");
        super.broadcastSend(targets, message);
    }
}
