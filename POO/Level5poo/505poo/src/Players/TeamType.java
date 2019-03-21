package Players;

/**
 * -- 2a parte --
 * 
 * ***Refatore sua classe Mesa. Ao invés de conter uma lista de jogadores, a mesa
 * deve possuir dois objetos de uma nova classe, Time.
 * 
 * ***A classe Time deve ser composta por uma lista de jogadores que constituem
 * o time e um indicador de que time ele é A ou B, que pode ser um EnumTime.
 * 
 *
 * @author LPS
 */
public enum TeamType {
    A("A"), B("B");
    
    private final String teamRef;
    
    private TeamType(String t){
        teamRef = t;
    }

}
