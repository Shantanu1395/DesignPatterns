/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author shantanu1395
 */
public class Runner {
    public static void main(String[] args) {
        BankAccountFacade b=new BankAccountFacade(131216, 12345);
        b.depositCash(1000);
        b.withdrawCash(100);
        b.withdrawCash(200);
        
    }
}
