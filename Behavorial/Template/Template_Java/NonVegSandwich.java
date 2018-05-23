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
public class NonVegSandwich extends Sandwich{

    public NonVegSandwich() {
        System.out.println("Making NonVeg Sandwich");
    }
    
    @Override
    public void AddBread() {
        System.out.println("Add White Bread");
    }

    @Override
    public void AddSauce() {
        System.out.println("Add Barbeque Sauce");
    }

    @Override
    public void AddStuffing() {
        System.out.println("Add chicken");
    }

    @Override
    public boolean isGrilled() {
        return true;
    }
    
}
