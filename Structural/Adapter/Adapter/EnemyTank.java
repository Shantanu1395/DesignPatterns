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
//First class
public class EnemyTank implements EnemyAttacker{

    Random generator = new Random();
    
    @Override
    public void fireWeapon() {
        
        int damage = generator.nextInt(10)+1;
        System.out.println("Enemy tank has "+ damage +" damage.");
        
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5)+1;
        System.out.println("Enemy tank has "+ movement +" movement.");
    }

    @Override
    public void assignDriver(String name) {
        System.out.println("Enemy Tank has "+ name + "as driver");
    }
    
}
