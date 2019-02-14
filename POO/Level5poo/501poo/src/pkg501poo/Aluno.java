/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg501poo;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa {
    private int iInteresse;
    private boolean bDuvida;
    private boolean bVontadeBanheiro;

    public int getiInteresse() {
        return iInteresse;
    }

    public void setiInteresse(int iInteresse) {
        this.iInteresse = iInteresse;
    }

    public boolean isbDuvida() {
        return bDuvida;
    }

    public void setbDuvida(boolean bDuvida) {
        this.bDuvida = bDuvida;
    }

    public boolean isbVontadeBanheiro() {
        return bVontadeBanheiro;
    }

    public void setbVontadeBanheiro(boolean bVontadeBanheiro) {
        this.bVontadeBanheiro = bVontadeBanheiro;
    }
    
    
}
