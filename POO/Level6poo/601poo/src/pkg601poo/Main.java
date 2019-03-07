package pkg601poo;

import Objects.Door;
import Objects.Light;
import Rooms.StudyRoom;

/**
 * Manipulação de Objetos.
 * 
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        //Manipulando Objetos do tipo Luz:
        Light light0 = new Light(0);
        Light light1 = new Light(1);
        
        light0.TurnOn(); //Liga a luz0;
        light0.Destroy(); //Queima a luz0;
        
        System.out.println(light0.IsOn()); //Retorna false pois uma lâmpada não pode estar acesa e queimada ao mesmo tempo;
        System.out.println(light0.IsBusted());
        
        //Manipulando Objetos do tipo Porta:
        Door door0 = new Door(1234);
        Door door1 = new Door(4321);
        
        door0.OpenDoor(1234); //Utiliza método que pede a senha para abrir a porta;
        System.out.println(door0.IsOpen());
        
        //Construindo Sala de Estudos:
        StudyRoom study0 = new StudyRoom();
    }
}
