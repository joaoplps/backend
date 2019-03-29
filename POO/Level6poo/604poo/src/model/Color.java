package model;

/**
 *
 * @author LPs
 */
public enum Color {
    //Opções de cor para os jogadores / exércitos:
    VERMELHO,
    VERDE,
    AZUL,
    AMARELO;
    
    public static Color colorByIndex(int i){
        if(i < 0 || i >= Color.values().length)
            throw new IllegalArgumentException("Color Index is invalid.");
                
        return Color.values()[i];
    }
}
