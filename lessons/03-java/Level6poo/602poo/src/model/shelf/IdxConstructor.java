package model.shelf;

import java.util.ArrayList;

/**
 *
 * @author jp
 */
public class IdxConstructor {
    private static Index createToIdxType(IdxType it){
        switch(it) {
            case YEAR:
                return new IdxByYear();
            case AUTHOR:
                return new IdxByAuthor();
            case GENDER:
                return new IdxByGender();
        }
        
        throw new UnsupportedOperationException("Constructor for this kind has not been created yet.");
    }
    
    private IdxConstructor(){}
    
    public static ArrayList<Index> createIndexes() {
        ArrayList<Index> indexes = new ArrayList<>();
        for(IdxType i : IdxType.values())
            indexes.add(createToIdxType(i));
        return indexes;
    }
}
