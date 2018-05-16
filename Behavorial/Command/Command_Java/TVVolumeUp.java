/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author shantanu1395
 */
public class TVVolumeUp implements Command{

    ElectronicDevice device;

    public TVVolumeUp(ElectronicDevice device) {
        this.device = device;
    }
    
    @Override
    public void execute() {
        this.device.volumeUp();
    }
    
    public void unexecute() {
        this.device.volumeDown();
    }
    
}
