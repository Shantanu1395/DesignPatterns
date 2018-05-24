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
public class Numbers {
    int a,b;
    String s;

    public Numbers(int a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }
    
    String getCalc(){
        return s;
    }
    
    int getNum1(){
        return a;
    }
    
    int getNum2(){
        return b;
    }

    
}
