package Tables;

import Cards.Card;
import Cards.CardPack;
import java.util.ArrayList;
import Players.Player;
import Players.Team;
import Players.TeamType;
import static java.lang.System.exit;

/**
 * ***A modelagem da Mesa deve conter três listas. A primeira é
 * uma lista de cartas que representa o baralho de compra. A
 * segunda é uma lista de cartas que representa a pilha de
 * descarte. A terceira lista é uma lista de jogadores que deve
 * comportar 2 ou 4 jogadores.
 * 
 * ***Quando uma mesa é criada, ela cria suas próprias listas e
 * aguarda jogadores para entrarem na Mesa através de um método
 * recebeJogador. Todas as listas, com exceção da lista de cartas
 * do baralho de compra devem começar vazias. A lista de cartas
 * de compra deve começar com 2 cópias de cada carta possível
 * (2 baralhos de jogo padrões).
 * 
 * ***A Mesa deve ter um método comecarJogo onde ela notifica
 * todos seus jogadores (2 ou 4) para que cada um deles compre
 * 11 cartas. Caso a mesa não tenha 2 ou 4 jogadores, ela não
 * começa e deve imprimir na tela "número inválido de jogadores".
 *
 * @author LPS
 */
public class Table {
    public ArrayList<Card> tablePack;
    public ArrayList<Card> descartPack;
    public Team TeamA, TeamB;
    
    //Criador de mesa de canastra:
    public Table(int iNpl){
        if (iNpl == 2 || iNpl == 4){    //Controla número de jogadores;
            //Cria e adiciona baralho de canastra na mesa:
            tablePack = new ArrayList<>();
            tablePack.addAll(CardPack.canastra());
            
            //Cria a pilha para descarte das cartas:
            descartPack = new ArrayList<>();
            
            //Registrando times:
            switch (iNpl){
                case 2:
                    TeamA = new Team(2);
                    TeamB = new Team(2);  
                    break;
                case 4:
                    TeamA = new Team(4);
                    TeamB = new Team(4);
                    break;
            }
        }
        
        else
            System.out.println("Essa mesa aceita apenas 2 ou 4 jogadores.");
    }
    
    //Identificador: 
    @Override
    public String toString() {
        String showme = "Mesa de Canastra\n Time A:\n" + TeamA.toString() + "\nTime B:\n" + TeamB.toString();
        return showme;
    }

    
    //Teste de funcionamento:
    private boolean WillHappen(){
        final int n = TeamA.playerz.size() + TeamB.playerz.size();
        
        return n != 2 && n != 4;
    }

    //Dando as cartas para os jogadores do time:
    private void Distribute(Team a, Team b){
        for (int i = 0; i < 11; i++){
            for (Player pl : a.playerz)
                pl.BuyCard(this);
            
            for (Player pl : b.playerz)
                pl.BuyCard(this);
        }
    }
    
    public void StartGame(){
        if (WillHappen()){
            System.out.println("Número inválido de jogadores.");
            exit(1); //Stop program with error (1)
        }
        
        if (tablePack.size() != 104){
            System.out.println("As configurações do baralho não são compatíveis com o jogo de canastra");
            exit(1); //Stop program with error (1)
        }
        
        //In da GAME:
        Distribute(TeamA, TeamB);
    }
}
