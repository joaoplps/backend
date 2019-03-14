package Obstacle;

import Auto.AutoState;

/**
 *
 * @author LPS
 */
public enum Obstacle {
    JACU(0, "jacu", AutoState.SEM_INTENCOES, 0),
    ESTRADA(1, "estrada"),
    PEDESTRE(2, "pedestre");

    public final int iObstCod;
    public final String sObstId;
    public AutoState JacuState;
    public int iJacuVel;
    
    private Obstacle(int cod, String id){
        iObstCod = cod;
        sObstId = id;
    }
    
    private Obstacle(int cod, String id, AutoState state, int vel){
        iObstCod = cod;
        sObstId = id;
        JacuState = state;
        iJacuVel = vel;
    }
    
    @Override
    public String toString(){
        return sObstId;
    }
    
    //JACU:
    public void setJacuVel(int vel) {
        iJacuVel = vel;
    }
    
    public void setJacuState(AutoState state) {
        JacuState = state;
    }
}
