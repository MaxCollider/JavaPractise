public class App {
    public static void main(String[] args) {
        Singeton singeton = Singeton.getInstance();
        singeton.sendMessage("hi");
        System.out.println(singeton.getNumberOfSendMessages());
        Singeton s = Singeton.getInstance();
        s.sendMessage("Hello!");
        System.out.println(singeton.getNumberOfSendMessages());
    }

}
