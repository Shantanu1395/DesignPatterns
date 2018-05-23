/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author sashant
 */
public abstract class GenericDevice {
    public int deviceState;
    public int maxSetting;
    public int volumeLevel=0;
    
    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();
    
    public void deviceFeedback(){
        if(this.deviceState>this.maxSetting || this.deviceState<0){
            System.out.println("On "+deviceState);
        }
    }
    
    public void buttonSevenPressed(){
        volumeLevel++;
        System.out.println("Volume:"+volumeLevel);
    }
    
    public void buttonEightPressed(){
        volumeLevel--;
        System.out.println("Volume:"+volumeLevel);
    }
    
}
