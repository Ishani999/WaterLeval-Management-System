/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterlevelproject;

import java.util.ArrayList;

/**
 *
 * @author ishani anushka
 */
public class ControlRoom {
    private ArrayList<waterLevelObserver> observeList = new ArrayList<>();
    private int value;
    public void addWaterLevel(waterLevelObserver observer){
        observeList.add(observer);
        
        
    }
    public void notifyObjects(){
        for(waterLevelObserver ob:observeList){
            ob.update(value);
        }
        
    }
    
    public void setWaterLevel(int value){
        if(this.value!=value){
            this.value = value;
            notifyObjects();
        }
    }

    

    
}
