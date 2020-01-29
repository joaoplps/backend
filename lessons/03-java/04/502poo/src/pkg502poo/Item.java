package pkg502poo;
/**
 *
 * @author LPS
 */
public enum Item implements Interactive {
    //Objetos constantes (enumerados):
    COGUMELOVERMELHO("Cogumelo Vermelho", true, false, true, true, new IncrementalState(State.GRANDE)), //Objetos dependentes do estado;
    FLORDEFOGO("Flor de Fogo", true, true, true, true, new IncrementalState(State.PODEROSO)),
    YOSHI("Yoshi", false, true, true, false, new StateIndependent()), //Objeto Independe do estado iState(int e);
    PENA("Pena", true, true, true, true, new IncrementalState(State.VOADOR)),
    MOEDA("Moeda", false, false, true, true, null); //A moeda terá um objeto vazio (não implementa PowerUp);
    
    //Atributos constantes:
    public final String sName;
    public final boolean bNewVisual, bNewControl;
    public final boolean bBox, bWorld;
    public final PowerUp incrementow;
    
    //Construtor privado (sem acesso fora da classe):
    private Item(String sName, boolean bNewVisual, boolean bNewControl, boolean bBox, boolean bWorld, PowerUp incrementow){
        this.sName = sName;
        this.bNewVisual = bNewVisual;
        this.bNewControl = bNewControl;
        this.bBox = bBox;
        this.bWorld = bWorld;
        this.incrementow = incrementow;
    }

    @Override
    public void Interact(Character c) {
        incrementow.ApllyEffect(c);
    }
    
}