/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shantanu1395
 */

interface Pizza{
    public String getDescription();
    public double getCost();
}

class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 200;
    }

}

abstract class PizzaDecorator implements Pizza{
    
    Pizza tempPizza;
    
    PizzaDecorator(Pizza p){
       this.tempPizza = p;
    }
    
    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
    
} 

class Mozzerella extends PizzaDecorator{

    public Mozzerella(Pizza p) {
        super(p);
        System.out.println("Adding Dough");
        System.out.println("Adding Mozzerella");
    }
    
    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " Mozerella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 50;
    }
    
}


class TomatoSauce extends PizzaDecorator{

    public TomatoSauce(Pizza p) {
        super(p);
        System.out.println("Adding Tomato Sauce");
    }
    
    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " Tomato Sauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 35;
    }
    
}

class DecoratorRunner {
    public static void main(String[] args) {
        Pizza type1 = new TomatoSauce(new Mozzerella(new PlainPizza()));
        System.out.println("Ingredients:" + type1.getDescription());
        System.out.println("Price : "+type1.getCost());
    }
}
