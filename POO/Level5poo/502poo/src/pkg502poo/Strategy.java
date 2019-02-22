package pkg502poo;
/**
 *
 * @author LPS
 */
public class Strategy {
    //Atributos:
    public Interaction[] formats;
    
    //Construtores para estratégias:
    public Strategy(Interaction[] interaction){
        formats = interaction;
    }
    
    public Strategy(Interaction strategy1) {
        this.formats = new Interaction[1];
        formats[0] = strategy1;
    }
        
    public Strategy(Interaction strategy1, Interaction strategy2){
        this.formats = new Interaction[2];
        formats[0] = strategy1;
        formats[1] = strategy2;
    }
    
    @Override
    public boolean equals(Object outro) {
        if(!(outro instanceof Strategy))
            return false;
        
        Strategy outra_estrategia = (Strategy) outro;
        if(formats.length != outra_estrategia.formats.length)
            return false;
        
        for(int i = 0; i < formats.length; ++i)
            if(!formats[i].equals(outra_estrategia.formats[i]))
                return false;
        return true;
    }

}