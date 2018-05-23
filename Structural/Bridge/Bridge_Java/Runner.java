/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge_Java;

/**
 *
 * @author sashant
 */
public class Runner {
    public static void main(String[] args) {
        RemoteButton b1=new MuteRemote(new TVDevice(1,200));
        RemoteButton b2=new PauseRemote(new TVDevice(1,200));
        b1.buttonNinePressed();
        b2.buttonNinePressed();
        
    }
}
