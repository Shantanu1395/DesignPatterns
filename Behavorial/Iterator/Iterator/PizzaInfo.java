/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author sashant
 */
public class PizzaInfo {
    String pizzaName;
    int toppings;
    double cost;

    public PizzaInfo(String pizzaName, int toppings, double cost) {
        this.pizzaName = pizzaName;
        this.toppings = toppings;
        this.cost = cost;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public int getToppings() {
        return toppings;
    }

    public double getCost() {
        return cost;
    }
}
