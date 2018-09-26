package pkg202poo;
/**
 * Classe Superhero - Métodos Construtores "constróem" as variáveis inserindo
 * os dados no espaço da memória em si. Utilizado para atribuir ou retornar
 * seus valores sendo os mesmos privados para qualquer interação parecida fora
 * da classe que pertencem. Os métodos por sua vez, são publicos e são chamados
 * no arquivo Main.java para realizar a interação do programa com a classe e
 * seus atributos e métodos particulares.
 * 
 * @author João Pedro LPS
 */
public class Superhero {
    //Atributos privados:
    private String sName;
    private String sSecretID;
    private String[] sPowers;
    private String sLocal;
    private String sWeakness;
    private String[] sEnemies;
    
    //Métodos de atribuição das variáveis:    
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSecretID() {
        return sSecretID;
    }
    public void setsSecretID(String sSecretID) {
        this.sSecretID = sSecretID;
    }

    public String[] getsPowers() {
        return sPowers;
    }
    public void setsPowers(String[] sPowers) {
        this.sPowers = sPowers;
    }

    public String getsLocal() {
        return sLocal;
    }
    public void setsLocal(String sLocal) {
        this.sLocal = sLocal;
    }

    public String getsWeakness() {
        return sWeakness;
    }
    public void setsWeakness(String sWeakness) {
        this.sWeakness = sWeakness;
    }

    public String[] getsEnemies() {
        return sEnemies;
    }
    public void setsEnemies(String[] sEnemies) {
        this.sEnemies = sEnemies;
    }
    
    //Método Consultor: Decide (entre os parenteses) quais atributos serão 
    //recebidos (obrigatórios) quando o objeto for criado.
    public Superhero(){
        
    }
    public Superhero(String sName, String sSecretID, String[] sPowers, String sLocal, String sWeakness, String[] sEnemies){
        this.sName = sName;
        this.sSecretID = sSecretID;
        this.sPowers = sPowers;
        this.sLocal = sLocal;
        this.sWeakness = sWeakness;
        this.sEnemies = sEnemies;
    }
    
    @Override   //Notação: sobreescreve método já existente, neste caso para retornar
                //todas as informações sobre o objeto.
    public String toString(){
        String poderes = "";
        for(int i = 0; i < sPowers.length;i++){
            poderes =  poderes + " " + sPowers[i];
        }
        
        String inimigos = "";
        for(int i = 0; i < sPowers.length;i++){
            inimigos =  inimigos + " " + sEnemies[i];
        }
        
        return "Superhero "+sName+":\n\nSecret-ID: "+sSecretID+"\nPowers: "+poderes +"\nLocal: "+sLocal+"\nWeakness: "+sWeakness+"\nEnemies: "+inimigos;
    }
    
    
}
