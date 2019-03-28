package Cards;
/** 
 * -- 1a parte --
 * 
 * ***A Carta é composta por dois atributos imutáveis e públicos,
 * um Naipe e um Valor.
 * 
 * **Implementação de interface do java: Comparable; Sobrescreve
 * o método compareTo() esplanando as características da abstração
 * da diferença.
 * 
 * --2a parte --
 * 
 * Para fazer com que uma carta seja comparável a outra, use a interface da
 * biblioteca padrão do Java Comparable<>.
 * 
 * ***Para isso, diga que a classe Carta implements Comparable<Carta>. Esta
 * interface exigirá a definição de um método compareTo que retorna um inteiro
 * que representa a diferença inteira entre este objeto e outro objeto da
 * classe Carta passado por parâmetro.
 * 
 * ***Implemente essa função como sendo a diferença do valor da carta atual
 * com o valor da carta passada por parâmetro.
 *
 * @author LPS
 */
public class Card implements Comparable<Card> {
    public final Nipes nipe;
    public final CardValue value;
    
    //Construtor friendly, pois somente o baralho cria as cartas:
    Card (Nipes n, CardValue v){
        nipe = n;
        value = v;
    }
    
    //Identificador:
    @Override
    public String toString() {
        return value + " de " + nipe;
    }
    
    //Comparador com outra carta:
    @Override
    public boolean equals(Object o){
        //Tratamento de exceção:
        if (o == null)
            return false;
        
        if (o instanceof Card){
            Card c = (Card) o;
            return c.nipe == nipe && c.value == value;
        }
        
        else{
            return false;
        }
    }

    //Implementação da interface:
    @Override
    public int compareTo(Card o) {
        //Tratamento de exceções:
        if(o == null)
            throw new IllegalArgumentException("A Card can't be compared to null.");
        
        return value.iCardValue - o.value.iCardValue;
    }    
}
