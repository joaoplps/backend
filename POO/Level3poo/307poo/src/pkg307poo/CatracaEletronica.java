package pkg307poo;
/**
 * Classe CatracaEletronica
 * 
 * @author João Pedro LPS
 */
public class CatracaEletronica {
    //Método LiberarPassagem:
    public void LiberarPassagem(Cartao card0){
        //Transformar em minúsculas:
        String cat = card0.getsCategoria();
        cat = cat.toLowerCase();
        
        //Variável de apoio:
        double dProcedimento;
        
        //Testes para definição da taxa:        
        switch (cat){
            case "estudante": dProcedimento = 2.00;
            break;
            
            case "professor": dProcedimento = 3.00;
            break;
            
            case "idoso": dProcedimento = 0.00;
            break;
            
            default: dProcedimento = 3.50;
        }
        
        //Aplicação do Desconto:
        card0.setdCredito(card0.getdCredito() - dProcedimento);
        
        //Mensagem:
        System.out.println("\nSALDO: $"+card0.getdCredito()+"\nBoa viagem!\n");
        
    }
    
}
