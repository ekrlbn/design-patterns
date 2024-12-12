package bridge;

import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Target> targets;
        targets = List.of(
                new Target(new Byte[]{ 12, 13 ,54, 15 }),
                new Target(new Byte[]{ 93, 36 ,51, 15 }),
                new Target(new Byte[]{ 42, 114 ,14, 15 }),
                new Target(new Byte[]{ 63, 45 ,15, 94 })
        );

        Notification error = new ErrorNotification();
        Notification warning = new WarningNotification();

        NotificationSender emailSender = new EmailSender(error);
        NotificationSender sms = new SMSSender(warning);

        emailSender.send(targets.getFirst(), "Your credentials is wrong");
        sms.send(targets.getLast(), "Change your password");
        sms.broadcastSend(targets, "New user policy have been sent");
    }
}
