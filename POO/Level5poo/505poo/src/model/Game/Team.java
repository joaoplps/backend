package model.Game;

import java.util.ArrayList;
import model.Cards.Card;

/**
 * -- 2a parte --
 * 
 * ***O método de registrarJogador deve ser passado da mesa para o Time. A mesa
 * só poderá começar agora se ela tiver 1 jogador em cada time ou 2 jogadores
 * em cada time.
 * 
 * 
 * -- 3a parte --
 * 
 * ***Faça com que cada Time tenha uma atributo para registrar os JogosBaixados.
 * 
 * ***Os JogosBaixados devem registrar as jogadas feitas por jogadores do mesmo
 * time.
 * 
 * ***Cada jogada, como visto no exercício 2, é uma lista de cartas
 * ordenadas da maior para a menor que são do mesmo naipe e tem diferença entre
 * valores de 1. Sendo assim, a classe JogosBaixados deve conter uma lista
 * dessas jogadas, podendo ser representada de duas formas:
 * 
 * - Uma lista de lista de cartas: ArrayList<ArrayList<Carta>> jogadas
 * - Uma lista de Jogada, uma classe auxiliar para abstrair um jogo válido já na mesa: ArrayList<Jogada>.
 *
 * @author LPS
 */
public class Team {
    public ArrayList<Player> playerz;
    public final TeamType teamtype;
    public ArrayList<Card> teamspace;
    
    Team(TeamType t){
        playerz = new ArrayList();
        teamtype = t;
    }

    //Adicionar jogador:
    public boolean RegisterPlayer(Player p){
        if(p == null)
            return false;
        playerz.add(p);
        p.IsOnTeam(teamtype);
        return true;
    }
    
    public Player getPlayer(int i){
        return playerz.get(i);
    }
    
    public int NumberOfPlayerz(){
        return playerz.size();
    }
}
