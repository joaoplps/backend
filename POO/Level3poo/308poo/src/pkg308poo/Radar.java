package pkg308poo;
/**
 * ● Crie uma Classe Radar, terá um método verificar_velocidade
 * (Carro carro).
 * ● O método verifica_velocidade(Carro carro), deverá verificar a
 * velocidade do objeto passado, e indicar se ele está ou não dentro
 * do limite de velocidade para determinado tipo de rodovia.
 * ● Caso o carro não estar dentro do limite de velocidade, registre
 * em um Array a placas de carro que ultrapassaram o limite de
 * velocidade. O array pode ser chamado placas_multados, e ter o
 * amanho 10.
 *
 * @author LPS
 */
public class Radar {
    //Método construtor:
    public void Radar(){}
    
    //Método checkSpeed:
    public void checkSpeed(Car car0){
        String[] fined;
        fined = new String[10];
        
        double maxSpeed = car0.getdSpeed();
        
        if(maxSpeed <= 80.00){
            System.out.println("You are free to go Sir.\n\n");
        }
        else{
            System.out.println("You have been fined.\n\n");
            fined[0] = car0.getsPlate();
        }
    }
    
}
