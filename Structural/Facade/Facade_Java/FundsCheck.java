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
public class FundsCheck {
    private double cashInAccount=1000;
    
    public double getBalance(){
        return this.cashInAccount;
    }
    
    public void decreaseCash(double cashWithdrawn){
        if(hasMoney(cashWithdrawn))
            this.cashInAccount-=cashWithdrawn;
        else
            System.out.println("Insufficient Balance");
    } 
    
    public void increaseCash(double cashAdded){
        this.cashInAccount+=cashAdded;
    }
    
    public boolean hasMoney(double cashwithdraw){
        return this.cashInAccount-cashwithdraw>=0;
    }
    
}
