package model.Game;

import model.Cards.Card;
import model.Cards.CardValue;
import model.Cards.Nipes;
import java.util.ArrayList;
import java.util.Collections;

/**
 * -- 1a parte --
 * 
 * ***A modelagem do jogador se resume a sua mão, que é uma lista
 * de cartas inicialmente vazia. Um jogador deve ser capaz de
 * comprar de uma pilha de compra da mesa e descartar uma carta
 * de sua mão para a pilha de descarte da mesa.
 * 
 * ***O jogador deve sempre comprar da primeira carta do Baralho
 * (índice 0) e deve também sempre descartar para o topo da pilha
 * de descarte (índice 0).
 * 
 * 
 * -- 2a parte --
 * 
 * ***Modifique também a classe Jogador para que cada objeto jogador saiba em
 * qual time ele está A ou B. Este atributo deve ser inicializado no
 * construtor da classe Jogador.
 * 
 * ***Na canastra, para "baixar" cartas da mão e começar uma "canastra", um
 * Jogador deve ter 3 ou mais cartas da mão em ordem de valor e do mesmo naipe.
 * Existe também cartas coringas, mas esqueça-as agora.
 * 
 * ***Crie um método testarJogada no Jogador recebendo uma lista de int 
 * (jogada) que retorna um boolean. O retorno do método jogar deve ser true se
 * é possível fazer esta jogada e false caso contrário.
 * 
 * ***Crie também um método jogar, recebendo uma lista de int (jogada) que
 * retorna void. Este método deve chamar o testarJogada. Caso o retorno de
 * testarJogada seja true, a jogada é válida. Para isso, retire as cartas da
 * mão do jogador (o método jogar por enquanto não faz mais nada).
 * 
 * ***Verifique se a lista de posiçoes contém 3 ou mais cartas (usando o size).
 * Caso a lista tenha 2 ou menos cartas, retorne false.
 * 
 * ***Verifique se todas são do mesmo naipe, se elas não forem, a jogada é
 * inválida e o método deve retornar false.
 * 
 * ***Agora resta verificar se as cartas tem valores em sequência (2,3,4
 * ou 6,7,8 ou Valete, Rainha, Rei, Ás).
 * 
 * ***Obtenha as cartas jogadas utilizando os índices das cartas passados por
 * parâmetro, colocando-as em uma lista própria para Cartas.
 * 
 * ***Ordene as cartas da menor para a maior.
 * 
 * ***Em seguida percorra a lista de cartas começando da segunda até a última. A
 * cada iteração do laço for, verifique se a carta no índice atual tem como
 * diferença do valor de uma para outra igual a 1 (Ver Seção Comparable).
 * 
 * ***Se a diferença for qualquer valor que não 1, retorne false.
 * 
 * ***Se o o laço inteiro executar e não retornar false, é seguro assumir
 * que a jogada é válida, neste caso a função retorna true.
 *
 * @author LPS
 */
public class Player {
    public ArrayList<Card> hand;
    public TeamType team;
    private CanastraTable table;
    
    //Construtor do jogador:
    public Player(){
        hand = new ArrayList();
    }
    
    //I AM MY HAND Identificador
    @Override
    public String toString() {
        return hand.toString();
    }

    //Métodos de compra e descarte de cartas:
    public boolean DescartCard(int n, CanastraTable t){
        if (hand.size() < n)
            return false;

        t.descartPack.add(0, hand.remove(n));
        return true;
    }
    
    private void AnalizeState(){
        if(table == null)
            throw new IllegalStateException("The Player needs to be on a table to buy a Card.");
        
    }
    
    public void BuyCard(CanastraTable t){
        AnalizeState();
        
        hand.add(t.tablePack.remove(0)); //Coloca na mão, removendo a primeira carta da pilha;
    }
    
    public void BuyDescart(CanastraTable t){
        AnalizeState();
        
        hand.addAll(t.descartPack); //Coloca na mão;
        t.descartPack.clear();  //Remove do descarte;
    }
    
    private boolean TestPlay(ArrayList<Card> play){
        //Garante que a jogada tenha 3 ou mais cartas;
        if (play.size() < 3)
            return false;
          
        //Mesmo Nipe:
        Nipes n1 = play.get(0).nipe;   //Criando referência para o nipe;
        
        for (int i = 1; i < play.size(); i++)
            if (!n1.equals(play.get(i).nipe))
                return false;
        
        //Sequenciamento de valores:
        Collections.sort(play);  //Ordenação de ArrayList;
        
        //Garantindo jogada especial:
        int kingAS = 0;
        if (play.get(play.size()-1).value.equals(CardValue.REI) && play.get(0).value.equals(CardValue.AS))
            kingAS = 1;
        
        //Comparação de valores:
        Card c0 = play.get(0);   //Atribuir valor Card para utilizar compareTo;
        for (int i = 1 + kingAS; i < play.size(); i++){
            Card c = play.get(i);   //Ref. para carta do índice atual;
            if (c0.compareTo(c) != -1)
                return false;
        }
        
        return true;    //Caso todo o laço execute sem sair, é seguro assumir true;
    }
    
    private ArrayList<Card> CardByIndex(ArrayList<Integer> move) {
        ArrayList<Card> cards = new ArrayList();
        
        if(move == null)
            throw new IllegalArgumentException();
        
        for(Integer i : move)
            if(hand.size() > i && i > 0)
                cards.add(hand.get(i));
        
        return cards;
    }
    
    public boolean PlAY(ArrayList play){
        AnalizeState();
        ArrayList<Card> cards;
        
        //Tratamento de exceção:
        try {
            cards = CardByIndex(play);
        } catch(IllegalArgumentException e) {
            return false;
        }
        
        if (!TestPlay(play))
            return false;
            
        hand.removeAll(play);
        return true;
    }

    void IsOnTeam(TeamType tt) {
        team = tt;
    }
    
    void IsOnTable(CanastraTable t){
        table = t;
    }
    
    public TeamType getTeam(){
        return team;
    }
}
