package command_pattern;

public class Main {

    public static void main(String[] args) {

        Broker broker = new Broker();
        BuyStock bs1 = new BuyStock("Airtel", 200);
        BuyStock bs2 = new BuyStock("Jio", 400);
        broker.takeOrder(bs1);
        broker.takeOrder(bs2);

        SellStock ss1 = new SellStock("Alphabet", 800);
        broker.takeOrder(ss1);

        broker.placeOrder();

    }

}
