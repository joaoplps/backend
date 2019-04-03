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
 * @author LPS
 */
public class Team {
    public ArrayList<Player> playerz;
    public final TeamType teamtype;
    public TeamGame teamgame;
    
    Team(TeamType t){
        playerz = new ArrayList();
        teamtype = t;
        teamgame = new TeamGame();
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
    
    @Override
    public String toString() {
        String id = "";
        return id;
    }
}
