/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shantanu1395
 */

//Runner Class

public class OperateRemote {
    public static void main(String[] args) {
        ElectronicDevice device = TVRemote.getDevice();
        TurnTVOn onCommand = new TurnTVOn(device);
        DeviceButtton onPressed = new DeviceButtton(onCommand);
        onPressed.press();
        
        //Turning TV off
        //----------------------
        TurnTVOff offCommand = new TurnTVOff(device);
        onPressed = new DeviceButtton(offCommand);
        onPressed.press();
        
        //Turn TV on
        //-----------------------
        TVVolumeUp volumeCommand = new TVVolumeUp(device);
        onPressed = new DeviceButtton(volumeCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();
        
        //Operating both Simulateously
        //------------------------
        Television tv = new Television();
        Radio radio = new Radio();
        List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
        devices.add(tv);
        devices.add(radio);
        TurnAllOff turnOffdevices = new TurnAllOff(devices);
        DeviceButtton turnOff = new DeviceButtton(turnOffdevices);
        turnOff.press();        
        turnOff.unpress();
    }
}
