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
public class MuteRemote extends RemoteButton{

    public MuteRemote(GenericDevice device) {
        super(device);
    }
    
    public void buttonNinePressed(){
        System.out.println("TV Muted");
    }
    
}
