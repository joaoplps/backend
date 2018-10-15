package pkg305poo;
/**
 * c. Uma classe Filme(titulo: String, idade_minima: int duracao: double, ano:
 * int, genero e preco: double) atributos públicos
 * 
 * f. A classe  Filme deve conter um método chamado permite_assitir(Pessoa p)
 * que vai receber um objeto pertencente a Classe Pessoa e conforme o atributo
 * idade_minima do objeto filme que invocou(chamou) o método vai verificar o
 * atributo idade do objeto(do tipo Pessoa) se a idade for menor que a idade
 * minima irá imprimir uma mensagem dizendo (“Não é permitido assistir este
 * filme!”), senão imprime uma mensagem dizendo: (“É permitido assistir este
 * filme!”), faça a chamada desse método na classe principal (a que possui o
 * método principal-main)
 * 
 * @author João Pedro LPS
 */
public class Filme {
    //Atributos:
    public String sTitulo;
    public int iIdadeMinima;
    public double dDuracao;
    public int iAno;
    public String sGenero;
    public double dValor;
    
    //Método Construtor:
    public Filme(){
    }
    
    public Filme(String sTitulo, int iIdadeMinima, double dDuracao, int iAno, String sGenero, double dValor){
        this.sTitulo = sTitulo;
        this.iIdadeMinima = iIdadeMinima;
        this.dDuracao = dDuracao;
        this.iAno = iAno;
        this.sGenero = sGenero;
        this.dValor = dValor;
        
    }
    
    public void PermiteAssistir(Pessoa pessoa1){
        if(pessoa1.iIdade >= iIdadeMinima){
            System.out.println("Permitido");
        }
        else{
            System.out.println("Censurado");
        }
        
    }
    
}