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
public class AccountNumberChecker {
   public int accountNumber=131216;
   
   public int getAccountNumber(){
       return this.accountNumber;
   }
   
   public boolean accountActive(int accnum){
       if(this.accountNumber==accnum)
           return true;
       return false;
   }
   
}
