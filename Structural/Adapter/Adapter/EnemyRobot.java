/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.util.Random;

/**
 *
 * @author sashant
 */
//Other class
public class EnemyRobot {
    Random generator = new Random();
    
    public void smashWithHands(){
        int damage = generator.nextInt(10)+1;
        System.out.println("Enemy Robot has "+ damage +" damage with hands.");
    }
    
    public void walkForward(){
        int movement = generator.nextInt(5)+1;
        System.out.println("Enemy Robot has "+ movement +" movement.");
    }
    
    public void reactToHuman(String name){
        System.out.println("Enemy Robot interacts with "+name);
    }
    
}
