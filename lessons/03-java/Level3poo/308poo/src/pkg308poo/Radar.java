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
    //Definindo vetor de String para placas multadas:
    String[] fined = new String[10];
    int i = 0;
    
    //Método construtor:
    public void Radar(){}
    
    //Método checkSpeed:
    public void checkSpeed(Car car0){

        
        //Teste de velocidade:
        if(car0.getdSpeed() <= 80.00){
            System.out.println("You are free to go Sir.\n\n");
        }
        else{
            System.out.println("You have been fined.\n\n");
            
            //Atribuição no vetor de String de placas multadas:
            fined[i] = car0.getsPlate();
            
            //Incremento para garantir o looping do vetor de dez posições:
            if(i < 10){
                i++;
            }
            else{
                i = 0;
            }
        }
    }
    
}
