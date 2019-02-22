package pkg502poo;
/**
 *
 * @author LPS
 */
public class Strategy {
    //Atributos:
    public Interaction[] formats;
    
    public Strategy(Interaction format1){
        this.formats = new Interaction[1];
        formats[0] = format1;
    }
    
    public Strategy(Interaction format1, Interaction format2){
        this.formats = new Interaction[2];
        formats[0] = format1;
        formats[1] = format2;
    }
        
    public Strategy(Interaction format1, Interaction format2, Interaction format3){
        this.formats = new Interaction[3];
        formats[0] = format1;
        formats[1] = format2;
        formats[2] = format3;
    }
}