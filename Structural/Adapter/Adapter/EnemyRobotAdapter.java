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
public class EnemyRobotAdapter implements EnemyAttacker{
    EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String name) {
        robot.reactToHuman(name);
    }
    
    
    
}
