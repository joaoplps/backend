package pkg505poo;

import DataStructure.Card;
import DataStructure.CardPack;
import Players.Player;
import Tables.Table;
import java.util.ArrayList;

/**
 * Data Structure & ArrayList!
 * 
 * Estrutura de dados em lista: vetor tratado diferente, dado
 * a imprevisibilidade do escopo (abstração de lista).
 * 
 * Syntax:
 * ArrayList <Integer> arrayId = new ArrayList <Integer> ();
 * 
 * See more for manage items in the list.
 * 
 * ***Dado que existe uma variável do tipo mesa que se chama
 * "mesa" no main, deve ser possível imprimir a mesa usando um
 * comando sout da seguinte forma:
 * 
 * System.out.println(mesa);
 * Este comando deve retornar o que tem a lista de cartas
 * referente a mão de cada um dos jogadores que estão jogando.
 * 
 * ***Faça no main do programa, um cenário onde uma mesa é criada,
 * recebe 4 jogadores, o jogo começa e logo em seguida é impresso
 * o estado da mesa antes do programa terminar.
 * 
 * ***Deve ser possível diferenciar cada jogador e ler todas as
 * cartas da mão de cada um.
 *
 * @author LPS
 */
public class Main {
    public static void main(String[] args) {
        Table table1 = new Table();
        table1.CanastraTable(4);
        
        Player pl1 = new Player();
        Player pl2 = new Player();
        Player pl3 = new Player();
        Player pl4 = new Player();
        
        table1.TableGetsPlayer(pl1, table1);
        table1.TableGetsPlayer(pl2, table1);
        table1.TableGetsPlayer(pl3, table1);
        table1.TableGetsPlayer(pl4, table1);
        
        table1.StartCanastraGame();
        
        System.out.println(table1);
    }
}
