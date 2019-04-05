package model.player;

/**
 *
 * @author LPS
 */
public enum Color {
    //Opções de cor para os jogadores / exércitos:
    RED("Vermelho"),
    GREEN("Verde"),
    BLUE("Azul"),
    YELLOW("Amarelo");
    
    public final String name;
    
    private Color(String n){
        name = n;
    }
    
    public static Color colorByIndex(int i){
        if(i < 0 || i >= Color.values().length)
            throw new IllegalArgumentException("Color Index is invalid.");
                
        return Color.values()[i];
    }
}
