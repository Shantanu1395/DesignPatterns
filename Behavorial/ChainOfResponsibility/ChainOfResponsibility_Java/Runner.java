/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility_Java;

/**
 *
 * @author sashant
 */
public class Runner {
    public static void main(String[] args) {
        Chain c1=new Add();
        Chain c2=new Subtract();
        Chain c3=new Multiply();
        Chain c4=new Divide();
        
        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);
        
        Numbers num=new Numbers(4,2,"mul");
        c1.calculate(num);
        
    }
}
