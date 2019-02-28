package pkg503poo;
/**
 * Enumerado direção, para representar o universo possível de
 * direções disponíveis compatíveis com o Gps.
 *
 * @author LPS
 */
public enum Direcao {
    FRENTE(0),
    DIREITA(1),
    PARADO(2),
    ESQUERDA(3);
    
    public final int iDirId;
    
    private Direcao (int id) {
        iDirId = id;
    }
}
