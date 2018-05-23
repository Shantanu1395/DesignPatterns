/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author sashant
 */
public class Dominoes implements PizzaIterator{
    PizzaInfo list[];
    int val;

    public Dominoes() {
        list=new PizzaInfo[3];
        val=0;
        addPizza("Farmhouse",3,150);
        addPizza("Peppy Paneer",4,400);
        addPizza("Veg Extravegenza",5,500);
    }
    
    void addPizza(String pizza,int toppings,double cost){
        list[val++]=new PizzaInfo(pizza, toppings, cost);
    }
    
    /*public PizzaInfo[] getPizza(){
        return list;
    }*/

    @Override
    public Iterator createIterator() {
        return Arrays.asList(list).iterator();
    }
}
;