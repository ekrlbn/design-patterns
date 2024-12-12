package bridge;

public class ErrorNotification implements Notification{

    private String addressToString(Byte[] address){
        StringBuilder result = new StringBuilder();
        for (Byte aByte : address) {
            result.append(aByte.toString());
            result.append(".");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

    @Override
    public void send(Target target, String message) {
        System.out.println("Address: " + addressToString(target.getAddress()) + " ErrorMessage: " + message);
    }
}
