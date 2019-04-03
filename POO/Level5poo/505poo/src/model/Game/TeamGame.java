package model.Game;

import java.util.ArrayList;
import model.Cards.Card;

/**
 * -- 3a parte --
 * 
 * ***Os JogosBaixados devem registrar as jogadas feitas por jogadores do mesmo
 * time. Cada jogada, como visto no exercício 2, é uma lista de cartas
 * ordenadas da maior para a menor que são do mesmo naipe e tem diferença entre
 * valores de 1. Sendo assim, a classe JogosBaixados deve conter uma lista
 * dessas jogadas, podendo ser representada de duas formas:
 * 
 * - Uma lista de lista de cartas: ArrayList<ArrayList<Carta>> jogadas
 * - Uma lista de Jogada, uma classe auxiliar para abstrair um jogo válido já na mesa: ArrayList<Jogada>.
 *
 *
 * @author LPS
 */
public class TeamGame {
    public ArrayList<ArrayList<Card>> plays;
    
    TeamGame(){
        plays = new ArrayList();
    }
    
    public void GetMove(ArrayList<Card> play){
        plays.add(play);
    }
    
    @Override
    public String toString() {
        String id = "";
        return id;
    }
}
