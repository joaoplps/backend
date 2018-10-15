package pkg305poo;
/**
 * Ex.: Utilizando os conteúdos aprendidos em aula, faça um programa em Java que
 * tenha as seguintes características:
 * 
 * a. Uma classe principal(Pode ser nomeada como:AtividadePOO ou nome de sua
 * preferência), onde deve constar o método principal do programa( public static
 * void main(String[] args)...)
 * 
 * d. No método principal(na classe principal), crie um objeto da classe Filme
 * e atribua valores para todos os atributos
 * 
 * e. No método principal, crie um objeto da classe Pessoa e atribua valores
 * para todos os atributos
 * 
 * j. No método principal, crie um objeto da classe FilmeEncapsulado utilizando
 * o construtor criado no passo i da atividade
 * 
 * @author João Pedro LPS
 */
public class Main {
    public static void main(String[] args) {
        //Criação de Objeto Filme com valores atribuidos:
        Filme filme1;
        filme1 = new Filme("Titanic", 16, 180.00, 1998, "Drama", 22.00);
        
        //Criação de Objeto Pessoa com valores atribuidos:
        Pessoa pessoa1;
        pessoa1 = new Pessoa("Jhonny", 30, "estudante");
        
        //Chamado do método PermiteAssistir:
        filme1.PermiteAssistir(pessoa1);
        
        //Criado do método FilmeEncapsulado:
        FilmeEncapsulado filme2;
        filme2 = new FilmeEncapsulado("Inception", 16, 120.00, 2005, "Ação", "estudante");
        
        
        
    }
}
