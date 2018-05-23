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
public abstract class Sandwich {
   
    public void makeSandwich(){
        AddBread();
        AddSauce();
        AddStuffing();
        isGrilled();
    }
    
   public abstract void AddBread();
   public abstract void AddSauce();
   public abstract void AddStuffing();
   public abstract boolean isGrilled();
}
