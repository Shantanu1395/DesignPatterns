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
public class VegSandwich extends Sandwich{

    public VegSandwich() {
        System.out.println("Making Veg Sandwich");
    }
    
    @Override
    public void AddBread() {
        System.out.println("Add Brown Bread");
    }

    @Override
    public void AddSauce() {
        System.out.println("Add Mayonaise");
    }

    @Override
    public void AddStuffing() {
        System.out.println("Add Veggies");
    }

    @Override
    public boolean isGrilled() {
        return true;
    }
    
}
