/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author sashant
 */
public class MojoPizza implements PizzaIterator{
    Hashtable<Integer,PizzaInfo> list;
    int key;
    
    public MojoPizza() {
        list=new Hashtable<>();
        key=0;
    }
    
    
    void addPizza(String pizza,int toppings,double cost){
        list.put(key++, new PizzaInfo(pizza, toppings, cost));
    }
    
    /*public Hashtable<Integer,PizzaInfo> getPizza(){
        return list;
    }*/

    @Override
    public Iterator createIterator() {
        return list.values().iterator();
    }
    
}
