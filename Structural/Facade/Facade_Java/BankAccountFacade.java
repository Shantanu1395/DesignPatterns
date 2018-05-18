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
public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;
    
    AccountNumberChecker acccheck;
    SecurityCodeCheck codecheck;
    FundsCheck fundcheck;
    WelcomeBank bankWelcome;

    public BankAccountFacade(int account,int security) {
        this.accountNumber=account;
        this.securityCode=security;
        
        acccheck=new AccountNumberChecker() ;
        codecheck=new SecurityCodeCheck();
        fundcheck=new FundsCheck();
        bankWelcome=new WelcomeBank();
    }
    
    public void depositCash(double cash){
        if(acccheck.accountActive(this.accountNumber) && codecheck.getSecurityCode()==this.securityCode){
            fundcheck.increaseCash(cash);
            System.out.println("Balance Now:"+fundcheck.getBalance());
        }else{
            System.out.println("Details Mismatch");
        }
    }
    
    public void withdrawCash(int amount){    
        if(acccheck.accountActive(this.accountNumber) && codecheck.getSecurityCode()==this.securityCode){
            fundcheck.decreaseCash(amount);
            System.out.println("Balance Now:"+fundcheck.getBalance());
        }else{
            System.out.println("Details Mismatch");
        }
    }
    }
    
    
    
    

