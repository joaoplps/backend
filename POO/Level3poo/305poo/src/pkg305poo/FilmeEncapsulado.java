package pkg305poo;
/**
 * g. Crie novas classes chamadas FilmeEncapsulado e PessoaEncapsulada, que
 * devem possuir os mesmos atributos das classes(Filme e Pessoa) porém privados
 * e os métodos necessários para acessar estes atributos(getters e setters)
 * 
 * h. Crie um método construtor na classe PessoaEncapsulada e na classe
 * FilmeEncapsulado que recebam todos os atributos e façam as atribuições
 * necessárias
 * 
 * i. Crie um método construtor na classe FilmeEncapsulado que receba os
 * atributos(titulo, idade_minima, duracao, ano e genero ) e o atributo 
 * categoria de um objeto do tipo Pessoa e conforme atribua o preco(de acordo
 * com a tabela descrita abaixo) para o objeto do tipo FilmeEncapsulado que
 * está sendo construído
 * 
 *      Categoria   x    Preço
 *      cliente          $20,00
 *      premium          $15,00
 *      estudante        $10,00
 *      professor        $10,00
 *      default          $22,00
 * 
 * @author João Pedro LPS
 */
public class FilmeEncapsulado {
    //Atributos:
    private String sTitulo;
    private int iIdadeMinima;
    private double dDuracao;
    private int iAno;
    private String sGenero;
    private double dValor;

    //Encapsulamento:
    public String getsTitulo() {
        return sTitulo;
    }

    public void setsTitulo(String sTitulo) {
        this.sTitulo = sTitulo;
    }

    public int getiIdadeMinima() {
        return iIdadeMinima;
    }

    public void setiIdadeMinima(int iIdadeMinima) {
        this.iIdadeMinima = iIdadeMinima;
    }

    public double getdDuracao() {
        return dDuracao;
    }

    public void setdDuracao(double dDuracao) {
        this.dDuracao = dDuracao;
    }

    public int getiAno() {
        return iAno;
    }

    public void setiAno(int iAno) {
        this.iAno = iAno;
    }

    public String getsGenero() {
        return sGenero;
    }

    public void setsGenero(String sGenero) {
        this.sGenero = sGenero;
    }

    public double getdValor() {
        return dValor;
    }

    public void setdValor(double dValor) {
        this.dValor = dValor;
    }
    
    //Método Construtor:
    public FilmeEncapsulado(){
    }
    
    public FilmeEncapsulado(String sTitulo, int iIdadeMinima, double dDuracao, int iAno, String sGenero, double dValor){
        this.sTitulo = sTitulo;
        this.iIdadeMinima = iIdadeMinima;
        this.dDuracao = dDuracao;
        this.iAno = iAno;
        this.sGenero = sGenero;
        this.dValor = dValor;
        
    }
    
    public FilmeEncapsulado(String sTitulo, int iIdadeMinima, double dDuracao, int iAno, String sGenero, String sCategoria){
        this.sTitulo = sTitulo;
        this.iIdadeMinima = iIdadeMinima;
        this.dDuracao = dDuracao;
        this.iAno = iAno;
        this.sGenero = sGenero;
        
        switch(Pessoa.sCategoria){
            case "cliente": this.dValor = 20.00;    
            break;
                
            case "premium": this.dValor = 15.00;
            break;
            
            case "estudante": this.dValor = 10.00;
            break;
            
            case "professor": this.dValor = 10.00;
            break;
            
            default: this.dValor = 22.00;
        }
        
    }
    
}