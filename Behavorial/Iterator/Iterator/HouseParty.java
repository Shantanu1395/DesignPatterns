/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.Iterator;

/**
 *
 * @author sashant
 */
public class HouseParty {
    //PizzaHut p1;
    //Dominoes p2;
    //MojoPizza p3;
    
    PizzaHut pizzahut ;
    Dominoes dominoes ;
    MojoPizza mojo ;
    
    public HouseParty(PizzaHut p1,Dominoes p2,MojoPizza p3) {
        this.pizzahut = p1;
        this.dominoes = p2;
        this.mojo = p3;
    }
    
    public void showThePizza(){
        Iterator i1=pizzahut.createIterator();
        Iterator i2=dominoes.createIterator();
        Iterator i3=mojo.createIterator();
        
        System.out.println("PizzaHut");
        printPizza(i1);
        
        System.out.println("Dominoes");
        printPizza(i2);
        
        System.out.println("MojoPizza");
        printPizza(i3);
        
    }
    
    private void printPizza(Iterator i) {
        while(i.hasNext()){
            PizzaInfo temp=(PizzaInfo)i.next();
            System.out.println(temp.pizzaName);
            System.out.println(temp.toppings);
            System.out.println(temp.cost);
        }
    }
    
    //Not this way
    /*public void showThePizza(){
        System.out.println("PizzaHut Pizza");
        ArrayList pizza1=p1.getPizza();
        
        for (int i = 0; i < pizza1.size(); i++) {
            PizzaInfo p=(PizzaInfo)pizza1.get(i);
            System.out.println(p.pizzaName);
            System.out.println(p.toppings);
            System.out.println(p.cost);
        }
        
        System.out.println("Dominoes Pizza");
        PizzaInfo pizza2[]=p2.getPizza();
        for (int i = 0; i < pizza2.length; i++) {
            PizzaInfo p=(PizzaInfo)pizza2[i];
            System.out.println(p.pizzaName);
            System.out.println(p.toppings);
            System.out.println(p.cost);
        }
        
        System.out.println("Mojo Pizza");
        Hashtable<Integer,PizzaInfo> pizza3=p3.getPizza();
        Enumeration<Integer> e=pizza3.keys();
        while(e.hasMoreElements()){
            PizzaInfo temp=pizza3.get(e.nextElement());
            System.out.println(temp.pizzaName);
            System.out.println(temp.toppings);
            System.out.println(temp.cost);
        }
        
    }*/

    
    
}
