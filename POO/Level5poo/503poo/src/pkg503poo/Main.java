package pkg503poo;

import Auto.Automovel;
import static Auto.Camera.CAMF;
import Obstacle.Obstacle;
import static pkg503poo.Interface.informInt;
/**
 *
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        //Início, carro parado:
        System.out.println(Automovel.CARRO.CarDir.sDirId);
        
        //Criação de instante:
        int camcod = informInt("Escolha uma camera (0 - frontal, 1 - direita ou 2 - esquerda): ");
        
        int obst = informInt("Insira uma obstáculo (0 - estrada, 1 - jacu ou 2 - pedestre): ");
        
    }
}
