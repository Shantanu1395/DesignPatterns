/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite_Java;

/**
 *
 * @author shantanu1395
 */
public class Runner {
    public static void main(String[] args) {
        Leaf hardDrive=new Leaf(4000,"SDD");
        Leaf mouse=new Leaf(200,"Mouse");
        Leaf monitor=new Leaf(10000,"Monitor");
        Leaf Ram=new Leaf(3000,"Ram");
        Leaf CPU=new Leaf(12000,"CPU");
        
        Composite Peripheral=new Composite("Peripheral");
        Composite Cabinet=new Composite("Cabinet");
        Composite Motherbord=new Composite("Motherbord");
        Composite Computer=new Composite("Computer");
        
        Motherbord.addComponent(CPU);
        Motherbord.addComponent(Ram);
        
        Peripheral.addComponent(mouse);
        Peripheral.addComponent(monitor);
        
        Cabinet.addComponent(hardDrive);
        Cabinet.addComponent(Motherbord);
        
        Computer.addComponent(Peripheral);
        Computer.addComponent(Cabinet);
        
        Computer.showPrice();
    }
}
