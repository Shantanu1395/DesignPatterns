/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import java.util.List;

/**
 *
 * @author sashant
 */
public class TurnAllOff implements Command{
    List<ElectronicDevice> devices;

    public TurnAllOff(List<ElectronicDevice> devices) {
        this.devices = devices;
    }
    
    @Override
    public void execute() {
        for (ElectronicDevice device : devices) {
            device.off();
        }
    }
    
    @Override
    public void unexecute() {
        for (ElectronicDevice device : devices) {
            device.on();
        }
    }
    
}
