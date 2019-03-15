package Tables;

import DataStructure.Card;
import DataStructure.CardPack;
import java.util.ArrayList;
import Players.Player;
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
    public ArrayList<Player> tablePlayers;
    
    //Criador de mesa de canastra:
    public Table(int iNpl){
        if (iNpl == 2 || iNpl == 4){
            tablePack = new ArrayList<>();
            tablePack.addAll(CardPack.canastra());
            descartPack = new ArrayList<>();
            
            if (iNpl == 2)
                tablePlayers = new ArrayList<>(2);
            
            else if (iNpl == 4)
                tablePlayers = new ArrayList<>(4);
        }
        
        else
            System.out.println("Essa mesa aceita apenas 2 ou 4 jogadores.");
    }
    
    //Identificador:
    @Override
    public String toString() {
        String hands = "Mesa de Canastra\n";

        int aux = 0;
        
        if (!tablePlayers.isEmpty())
            for (Player pl : tablePlayers){
                hands += "Jogador " + aux + ": " + pl.toString() + "\n";
                aux++;
            }
        
        return hands;
    }
    
    //Adicionar jogador:
    public void GetPlayer(Player p){
        tablePlayers.add(p);
    }
    
    //Teste de funcionamento:
    private boolean WillHappen(){
        final int n = tablePlayers.size();
        
        return n == 2 && n == 4;
    }
            
    private void Distribute(){
        //Dando as cartas:
        for (int i = 0; i < 11; i++)
            for (Player pl : tablePlayers)
                pl.BuyCard(this);
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
