package Rooms;

import Objects.Door;
import Objects.Light;

/**
 *
 * @author LPS
 */
public class StudyRoom {
    public final Light light0, light1;
    public final Door doorFront, doorBack;
    
    //Construtor:
    public StudyRoom () {
        light0 = new Light(1);
        light1 = new Light(1);
        doorFront = new Door(1234);
        doorBack = new Door(1234);

    }

    public Light FirstLight () {
        return light0;
    }
    
    public Light SecondLight () {
        return light1;
    }
    
    public Door FirstDoor () {
        return doorFront;
    }
    
    public Door SecondDoor () {
        return doorBack;
    }
}
