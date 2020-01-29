package Rooms;

import Objects.Door;
import Objects.Light;
import Objects.Switch;

/**
 * Sala de Estudos:
 *
 * @author LPS
 */
public class StudyRoom {
    public final Light light0, light1;
    public final Switch switch0, switch1;
    public final Door doorFront, doorBack;
    
    //Construtor:
    public StudyRoom (int c, int pass) {
        light0 = new Light(c);
        light1 = new Light(c);
        switch0 = new Switch(light0);
        switch1 = new Switch(light1);
        doorFront = new Door(pass);
        doorBack = new Door(pass);
    }
    
    
}