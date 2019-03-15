package pkg602poo;

import Books.Book;
import Books.Datasheet;
import Books.Gender;

/**
 * HASH MAP!
 * 
 * Syntax: "HashMap<key, value>"
 * 
 * Crie um objeto Livro que tem um nome, autor, edição, gênero e
 * ano. Um livro só é igual ao outro se for do mesmo autor e tiver
 * o mesmo nome e edição.Faça uma classe Biblioteca que organiza
 * suas prateleiras por diversos índices: autor, gênero e ano. Faça
 * um método registrarLivro onde a biblioteca deve ficar ciente de
 * um novo livro em seus registros.O novo livro deve ser criado e
 * referenciado em todos os índices, esses representados por
 * hashmaps.Faça também um método apagarLivro que apaga o livro
 * dos registros da biblioteca (todos os índices).
 *
 * 
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        Datasheet ds0 = new Datasheet("Nome", 1, "Autor");
        Datasheet ds1 = new Datasheet("Nome", 1, "Autor");
        
        Book bk0 = new Book(ds1, Gender.HORROR, 1987);
        
        
        System.out.println(bk0.equals(ds0));
        System.out.println(ds0.equals(bk0));
        System.out.println(ds1.equals(ds0));
        System.out.println(bk0.equals(ds1));

    }
}
