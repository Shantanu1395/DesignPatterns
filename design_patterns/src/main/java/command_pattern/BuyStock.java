package command_pattern;

public class BuyStock extends Stock implements Order{

    public BuyStock(String name, double value) {
        super(name, value);
    }


    public void execute() {
        System.out.println("Stock Bought " + name + " : " + value);
    }
}
