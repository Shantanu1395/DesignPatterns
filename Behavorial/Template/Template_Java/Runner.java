/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template_Java;

/**
 *
 * @author sashant
 */
public class Runner {
    public static void main(String[] args) {
        Sandwich veg=new VegSandwich();
        veg.makeSandwich();
        System.out.println("");
        Sandwich nonveg=new NonVegSandwich();
        nonveg.makeSandwich();
    }
}
