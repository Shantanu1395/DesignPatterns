/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Factory Pattern or Virtual Constructor Pattern
/**
 *
 * @author shantanu1395
 */

interface Mobile{
    String IPHONE="iphone";
    String SAMSUNG="samsung";
    String NOKIA="nokia";
    void display();
}

class iphone implements Mobile{
    int memory;
    int cost;
    String color;
    
    iphone(int memory,int cost,String color){
        this.memory=memory;
        this.cost=cost;
        this.color=color;
    }
    
    @Override
    public void display(){
        System.out.println(this.memory+" "+this.cost+" "+this.color);
    }
    
    
}

class Samsung implements Mobile{
    int memory;
    int cost;
    String color;
    
    Samsung(int memory,int cost,String color){
        this.memory=memory;
        this.cost=cost;
        this.color=color;
    }
    
    @Override
    public void display(){
        System.out.println(this.memory+" "+this.cost+" "+this.color);
    }
    
}

class Nokia implements Mobile{
    int memory;
    int cost;
    String color;
    
    Nokia(int memory,int cost,String color){
        this.memory=memory;
        this.cost=cost;
        this.color=color;
    }
    
    @Override
    public void display(){
        System.out.println(this.memory+" "+this.cost+" "+this.color);
    }
    
}

class MobileFactory{
    public Mobile createMobile(String type){
        if(type.equals(Mobile.IPHONE))
            return new iphone(32,60000,"Red");
        else if(type.equals(Mobile.NOKIA))
            return new iphone(64,18000,"Blue");   
        else if(type.equals(Mobile.SAMSUNG))
            return new iphone(128,24000,"Pearl black");
        return null;
    }
}

class Runner {
    public static void main(String[] args) {
        MobileFactory factory=new MobileFactory();
        Mobile x=factory.createMobile("iphone");
        x.display();
    }
}
