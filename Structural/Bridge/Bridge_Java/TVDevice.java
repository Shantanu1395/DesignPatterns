/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge_Java;

/**
 *
 * @author shantanu1395
 */
public class TVDevice extends GenericDevice{

    public TVDevice(int newdeviceState,int newMaxSetting) {
        deviceState=newdeviceState;
        maxSetting=newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel Down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel Up");
        deviceState++;
    }
    
}
