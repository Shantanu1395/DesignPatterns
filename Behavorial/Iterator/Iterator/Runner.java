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
public class Runner {
    public static void main(String[] args) {
        PizzaHut p1=new PizzaHut();
        Dominoes p2=new Dominoes();
        MojoPizza p3=new MojoPizza();
        
        HouseParty party=new HouseParty(p1, p2, p3);
        party.showThePizza();
        
    }
}
