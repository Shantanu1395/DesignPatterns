/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern;

/**
 *
 * @author shantanu1395
 */
//Volatile-Thread would not locally cache the value of the variable

class Singleton{
    private static volatile Singleton i;
    private Singleton(){
        System.out.println("Creating instance");
    }
    public static Singleton getInstance(){
        synchronized(Singleton.class){
            if(i==null){
             i=new Singleton();
            }
        }
        return i;
    }
}

class Runner {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        System.out.println(s1.hashCode());
        Singleton s2=Singleton.getInstance();
        System.out.println(s2.hashCode());
    }
}
