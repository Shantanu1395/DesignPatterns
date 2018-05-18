/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author sashant
 */
public class SecurityCodeCheck {
    private int securityCode=12345;
    
    public int getSecurityCode(){
       return this.securityCode;
   }
   
   public boolean accountActive(int secCode){
       if(this.securityCode==secCode)
           return true;
       return false;
   }
    
}
