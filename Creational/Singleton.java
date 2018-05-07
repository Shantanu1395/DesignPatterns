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
        Singleton s=Singleton.getInstance();
    }
}
