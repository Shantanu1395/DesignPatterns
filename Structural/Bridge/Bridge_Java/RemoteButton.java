/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author shantanu1395
 */
public abstract class RemoteButton {
    GenericDevice device;

    public RemoteButton(GenericDevice device) {
        this.device=device;
    }
    
    public void buttonFivePressed(){
        device.buttonFivePressed();
    }
    
    public void buttonSixPressed(){
        device.buttonSixPressed();
    }
    
    public void deviceFeedback(){
        device.deviceFeedback();
    }
    
    public abstract void buttonNinePressed();
}
