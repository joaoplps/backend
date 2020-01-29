package Objects;
/**
 * Porta pirvate!!!
 * Abre, Fecha, Senha (final), Chave:
 *
 * @author LPS
 */
public class Door {
    private final int iPass;
    private boolean bOpen;
    
    public Door (int pass) {
        iPass = pass;
        bOpen = false;
    }
    
    //Métodos:
    public boolean IsOpen () {
        return bOpen;
    }
    
    public void OpenDoor (int pass) {
        if (pass == iPass)
            bOpen = true;
    }
    
    public void CloseDoor () {
        if (bOpen)
            bOpen = false;
    }
}
