

public class Singeton {
    private int numberOfCustomers;
    private String lastMessage;
    private int numberOfSendMessages;

    private static Singeton singeton;

    private Singeton(){
        numberOfCustomers = 0;
        lastMessage = "nill";
        numberOfSendMessages = 0;
    }

    public static Singeton getInstance() {
        if (singeton == null) {
            singeton = new Singeton();
        }
        return singeton;
    }

    public void sendMessage(String message) {
        lastMessage = message;
        numberOfSendMessages++;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public int getNumberOfSendMessages() {
        return numberOfSendMessages;
    }

    public void connectToDataBase(){
        numberOfCustomers++;
    }
}
