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
public class Subtract implements Chain {
    Chain c;
    
    @Override
    public void setNext(Chain c) {
        this.c=c;
    }

    public void calculate(Numbers req) {
        if(req.getCalc().toLowerCase().equals("sub")){
            System.out.println("Difference:"+(req.getNum1()-req.getNum2()));
        }else{
            c.calculate(req);
        }
    }
    
}
