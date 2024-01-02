/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterlevelproject;

import java.util.Random;

/**
 *
 * @author ishani anushka
 */
public class WaterLevelProject {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlRoom controlRoom=new ControlRoom();
	controlRoom.addWaterLevel(new Alarm());
	controlRoom.addWaterLevel(new Display());
        controlRoom.addWaterLevel(new Splitter());
	new waterTank(controlRoom).setVisible(true);
	
    }
}

    
    

