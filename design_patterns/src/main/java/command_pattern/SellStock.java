package command_pattern;

public class SellStock extends Stock implements Order {

    public SellStock(String name, double value) {
        super(name, value);
    }

    public void execute() {
        System.out.println("Stock Sold " + name + " : " + value);
    }

}
