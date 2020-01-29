package pkg101poo;
/**
 * Instruções:
 * 1. Crie um projeto java default no NetBeans;
 * 2. Veja se o arquivo é uma Classe, ou o Main.java;
 * 3. Coloque os arquivos dentro do diretório correto e execute.
 *
 * @author João Pedro LPS
 * Ex.14 - Main para classes Livro e Leitor:
 */
import java.util.Scanner;                               //Lib. Scanner: método consultor.
public class Main {
    public static void main(String[] args) {
        //Ex.13 - Livro e leitura utilizando duas classes, encapsulamento (get e set):
        Leitor leitor=new Leitor(); 
        leitor.setsNomeLeitor("João");
        leitor.setiQtdRead(300);
        
        Livro book=new Livro();
        book.setsTitle("D&D");
        book.setsAuth("Leandrovki");
        book.setiQtdPgs(250);
        
        book.VerifyRead(leitor);
        
        Livro book2=new Livro();
        book.setsTitle("R$");
        book.setsAuth("Economy");
        book.setiQtdPgs(1500);        
        
        book.VerifyRead(leitor);

    }
}
