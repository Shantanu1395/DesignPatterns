/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author sashant
 */
public class Runner {
    public static void main(String[] args) {
        EnemyTank trex = new EnemyTank();
        EnemyRobot robo1 = new EnemyRobot();
        EnemyAttacker roboAttacker = new EnemyRobotAdapter(robo1);
        
        System.out.println("Robot");
        robo1.reactToHuman("Shantanu");
        robo1.smashWithHands();
        robo1.walkForward();
        
        System.out.println("Enemy Tank");
        trex.driveForward();
        trex.assignDriver("Raju ");
        trex.fireWeapon();
        
        System.out.println("Robot Adapter");
        roboAttacker.assignDriver("Sarthak");
        roboAttacker.driveForward();
        roboAttacker.fireWeapon();
    }   
}
