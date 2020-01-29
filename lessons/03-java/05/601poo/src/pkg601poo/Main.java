package pkg601poo;

import Objects.Door;
import Objects.Light;
import Objects.Switch;
import Rooms.StudyRoom;

/**
 * Manipulação de Objetos.
 * 
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        //Manipulando Objetos do tipo Luz:
        Light lightA = new Light(0);
        Light lightB = new Light(1);
        
        //Implemento do Interruptor:
        Switch switchA = new Switch(lightA);
        switchA.TurnOn(); //Liga a luzA através do Switch;
        lightA.Destroy(); //Queima a luzA;
        
        System.out.println(lightA.IsOn()); //Retorna false pois uma lâmpada não pode estar acesa e queimada ao mesmo tempo;
        System.out.println(lightA.IsBusted());
        
        //Manipulando Objetos do tipo Porta:
        Door doorA = new Door(1234);
        Door doorB = new Door(4321);
        
        doorA.OpenDoor(1234); //Utiliza método que pede a senha para abrir a porta;
        System.out.println(doorA.IsOpen());
        
        //Construindo Sala de Estudos:
        StudyRoom studyA = new StudyRoom(1, 1234);
    }
}