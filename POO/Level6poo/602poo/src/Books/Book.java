package Books;

import control.Characteristic.Comparable;

/**
 *
 * @author LPS
 */
public class Book extends Comparable {  //Extende qualidade comparável:
    public final Datasheet BDataS;
    public final Gender BGender;
    public final int iBYear;
    
    public Book(Datasheet ds, Gender gen, int y){
        BDataS = ds;
        BGender = gen;
        iBYear = y;
    }

    //Retorna a ficha técnica:
    @Override
    public Datasheet id() {
        return BDataS;
    }
}
