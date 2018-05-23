/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sashant
 */
public class PizzaHut implements PizzaIterator{
    ArrayList<PizzaInfo> list;

    public PizzaHut() {
        list=new ArrayList<>();
        addPizza("Stuffed Crust",3,100);
        addPizza("BaseCrunch",2,200);
        addPizza("CheeseOverload",1,300);
    }
    
    void addPizza(String pizza,int toppings,double cost){
        list.add(new PizzaInfo(pizza, toppings, cost));
    }
    
    /*public ArrayList<PizzaInfo> getPizza(){
        return list;
    }*/

    @Override
    public Iterator createIterator() {
        return list.iterator();
    }
    
}
