package command_pattern;

public class Stock {
    public String name;
    public double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Stock(String name, double value) {
        this.name = name;
        this.value = value;
    }


}
