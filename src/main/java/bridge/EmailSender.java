package bridge;

import java.util.Collection;

public class EmailSender extends NotificationSender{
    public EmailSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send(Target target, String message) {
        System.out.println("Sending Email");
        super.send(target, message);
    }

    @Override
    public void broadcastSend(Collection<Target> targets, String message) {
        System.out.println("Broadcasting Email");
        super.broadcastSend(targets, message);
    }
}
