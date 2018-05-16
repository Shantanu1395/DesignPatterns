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

//Receiver
public class Radio implements ElectronicDevice{
    
    private int volume = 0;
    
    @Override
    public void on() {
        System.out.println("Radio On");
    }

    @Override
    public void off() {
        System.out.println("Radio Off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Radio Volume :"+volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Radio Volume :"+volume);
    }
}
