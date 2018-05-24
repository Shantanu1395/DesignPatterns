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
public class Add implements Chain{
    Chain c;

    @Override
    public void setNext(Chain c) {
        this.c=c;
    }

    @Override
    public void calculate(Numbers req) {
        if(req.getCalc().toLowerCase().equals("add")){
            System.out.println("Sum:"+(req.getNum1()+req.getNum2()));
        }else{
            c.calculate(req);
        }
    }    
}
