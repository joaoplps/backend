package Players;

import Cards.Card;
import Cards.CardValue;
import Cards.Nipes;
import Tables.Table;
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
    public ArrayList<Card> Hand;
    public TeamType Team;
    
    //Construtor do jogador:
    public Player(TeamType t){
        Hand = new ArrayList();
        Team = t;
    }
    
    //I AM MY HAND Identificador
    @Override
    public String toString() {
        String hand = "";
        
        if (!Hand.isEmpty()){
            for (Card c : Hand){
                hand += c.toString() + " ";
            }
            
            return hand;
        }
        
        return "A mão do jogador está vazia";
    }

    //Métodos de compra e descarte de cartas:
    public boolean DescartCard(int n, Table t){
        if (Hand.size() < n)
            return false;

        t.descartPack.add(0, Hand.remove(n));
        return true;
    }
    
    public void BuyCard(Table t){
        Card c = t.tablePack.remove(0); //Remove a primeira carta da pilha;
        Hand.add(c); //Coloca na mão;
    }
    
    public void BuyDescart(Table t){
        Hand.addAll(t.descartPack); //Coloca na mão;
        t.descartPack.clear();  //Remove do descarte;
    }
    
    private boolean TestPlay(ArrayList<Card> play){
        if (play.size() < 3) //Garante que a jogada tenha 3 ou mais cartas;
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
    
    public void PlAY(ArrayList play){
        if (TestPlay(play))
            Hand.removeAll(play);
    }
}
