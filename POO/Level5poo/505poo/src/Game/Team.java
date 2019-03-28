package Game;

import java.util.ArrayList;

/**
 * -- 2a parte --
 * 
 * ***O método de registrarJogador deve ser passado da mesa para o Time. A mesa
 * só poderá começar agora se ela tiver 1 jogador em cada time ou 2 jogadores
 * em cada time.
 * 
 *
 * @author LPS
 */
public class Team {
    public ArrayList<Player> playerz;
    public final TeamType teamtype;
    
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
}
