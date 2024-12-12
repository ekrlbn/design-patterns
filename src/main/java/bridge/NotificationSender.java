package bridge;

import java.util.Collection;

public class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public void send(Target target, String message) {
        this.notification.send(target, message);
    }

    public void broadcastSend(Collection<Target> targets, String message) {

        for (Target target : targets) {
            this.notification.send(target, message);
        }
    }

}
