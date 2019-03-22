package Tables;

import Cards.Card;
import Cards.CardPack;
import java.util.ArrayList;
import Players.Player;
import Players.Team;
import Players.TeamType;
import static java.lang.System.exit;
import java.util.HashMap;

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
    public final HashMap<TeamType, Team> teamMap;
    
    //Criador de mesa de canastra:
    public Table(int n){
        if (n == 2 || n == 4){    //Controla número de jogadores;
            //Cria e adiciona baralho de canastra na mesa:
            tablePack = new ArrayList<>();
            tablePack.addAll(CardPack.canastra());
            
            //Cria a pilha para descarte das cartas:
            descartPack = new ArrayList<>();
            
            //Registrando times:
            teamMap = new HashMap();
            for (TeamType t : TeamType.values())
                teamMap.put(t, new Team(t, n));
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
        final int nPl = ;
        return nPl == 2 || nPl == 4;
    }

    //Dando as cartas para os jogadores do time:
    private void Distribute(){
        for (Team t : teamMap.values())
            for (int i = 0; i < t.playerz.size(); i++){
                for (Player p : t.playerz)
                    p.BuyCard(this);
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
        Distribute();
    }
}
