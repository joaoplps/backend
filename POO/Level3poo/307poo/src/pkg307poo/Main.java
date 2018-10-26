package pkg307poo;
/**
 * IFSC CTI INFORMÁTICA
 * Orientação a Objetos
 * 
 * Classe Principal
 *
 * @author João Pedro LPS
 */
public class Main {
    public static void main(String[] args) {
        //Criação de Objeto via Método Construtor:
        Cartao card0 = new Cartao("Eric Wilson", "Professor", 90.00);
        
        //Criação de Objeto para invocar método:
        CatracaEletronica roleta1 = new CatracaEletronica();
        
        //Invocação de Métodos público criado:
        roleta1.LiberarPassagem(card0);
        
    }
    
}
