package pkg401poo;
/**
 * 2. Crie uma classe Prato, que deve possuir os atributos nome, categoria
 * (entrada, principal, sobremesa), ingredientes, chef e preço. Com exceção do
 * atributo preço que deve ser double, o restante deve ser do tipo String;
 * ● Atributos devem ser private (crie os métodos necessários para acessar os
 * atributos private);
 * ● Crie um método construtor padrão sem receber nenhum parâmetro e um que
 * receba todos os atributos;
 *
 * @author João Pedro LPS
 */
public class Prato {
    private String sName;
    private String sCategory;
    private String sIngredients;
    private String sCheff;
    private double dPrice;

    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCategory() {
        return sCategory;
    }
    public void setsCategory(String sCategory) {
        this.sCategory = sCategory;
    }

    public String getsIngredients() {
        return sIngredients;
    }
    public void setsIngredients(String sIngredients) {
        this.sIngredients = sIngredients;
    }

    public String getsCheff() {
        return sCheff;
    }
    public void setsCheff(String sCheff) {
        this.sCheff = sCheff;
    }

    public double getdPrice() {
        return dPrice;
    }
    public void setdPrice(double dPrice) {
        this.dPrice = dPrice;
    }

    public Prato(){}
    
    public Prato(String sName, String sCategory, String sIngredients, String sCheff, double dPrice){
        this.dPrice = dPrice;
        this.sCheff = sCheff;
        this.sIngredients = sIngredients;
        this.sCategory = sCategory;
        this.sName = sName;
    }
}
