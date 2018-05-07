/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern;

import java.util.ArrayList;

/**
 *
 * @author shantanu1395
 */

interface Observer{
    void update(int stock1,int stock2,int stock3);
}

interface Subject{
    void register(Observer o);
    void deregister(Observer o);
    void notifyAllObservers();
}

class ConcreteSubject implements Subject{
    
    ArrayList<Observer> observers;
    int stock1,stock2,stock3;
    
    ConcreteSubject(){
        observers=new ArrayList<>();
    }
    
    @Override
    public void register(Observer o) {
        observers.add(o);
        System.out.println("Observer Added!!!");
    }

    @Override
    public void deregister(Observer o) {
        int index=observers.indexOf(o);
        System.out.println("Object "+(index+1)+" Deregistered");
        observers.remove(index);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o:observers){
            o.update(stock1, stock2, stock3);
        }
    }
    
    public void updateStock1(int val){
        stock1=val;
        notifyAllObservers();
    }
    
    public void updateStock2(int val){
        stock2=val;
        notifyAllObservers();
    }
    
    public void updateStock3(int val){
        stock3=val;
        notifyAllObservers();
    }

}

class ConcreteObserver implements Observer{
    public int stock1,stock2,stock3;
    public static int observerGlobalcount;
    public int observerId;
    public Subject subject;

    public ConcreteObserver(Subject s) {
        this.subject=s;
        this.observerId=++observerGlobalcount;
        System.out.println("New Observer:"+this.observerId);
        subject.register(this);
    }
        
    @Override
    public void update(int stock1, int stock2, int stock3) {
        this.stock1=stock1;
        this.stock2=stock2;
        this.stock3=stock3;
        printPrices();
    }
    
    public void printPrices(){
        System.out.println("ObserverId:"+observerId);
        System.out.println("Stock1:"+stock1);
        System.out.println("Stock2:"+stock2);
        System.out.println("Stock3:"+stock3);
    }
}

public class ObserverPattern {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteSubject s=new ConcreteSubject();
        
        ConcreteObserver o1=new ConcreteObserver(s);
        s.updateStock1(100);
        s.updateStock2(150);
        s.updateStock3(200);
        
        ConcreteObserver o2=new ConcreteObserver(s);
        s.updateStock1(65);
        s.updateStock2(36);
        s.updateStock3(85);
        
        s.deregister(o2);
        s.notifyAllObservers();
        
    }
    
}
