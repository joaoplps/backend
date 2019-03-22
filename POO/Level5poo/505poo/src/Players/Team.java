package Players;

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
    
    public Team(TeamType t, int q){
        playerz = new ArrayList(q);
        teamtype = t;
    }
  
    //Identifica os jogadores pela sua mão:
    @Override
    public String toString(){
        String hands = "";

        int aux = 0;

        if (!playerz.isEmpty())
            for (Player pl : playerz){
                hands += "Jogador " + aux + ": " + pl.toString() + "\n";
                aux++;
            }
        
        return hands;
    }
    
    //Adicionar jogador:
    public void RegisterPlayer(Player p){
        playerz.add(p);
    }
}
