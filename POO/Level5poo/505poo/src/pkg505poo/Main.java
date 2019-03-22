package pkg505poo;

import Cards.Card;
import Cards.CardPack;
import Players.Player;
import Players.Team;
import Players.TeamType;
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
        Table table1 = new Table(4);
        
        Player PA1 = new Player(TeamType.A);
        table1.TeamA.RegisterPlayer(PA1);
        Player PA2 = new Player(TeamType.A);
        table1.TeamA.RegisterPlayer(PA2);

        Player PB1 = new Player(TeamType.B);
        table1.TeamB.RegisterPlayer(PB1);
        Player PB2 = new Player(TeamType.B);
        table1.TeamB.RegisterPlayer(PB2);
        
        table1.StartGame();
        
        System.out.println(table1);
        
        
    }
}
