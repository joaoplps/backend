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
public class Professor extends Pessoa {
    private String sDisciplina;
    private String[] sConhecimento;

    public String getsDisciplina() {
        return sDisciplina;
    }

    public void setsDisciplina(String sDisciplina) {
        this.sDisciplina = sDisciplina;
    }

    public String[] getsConhecimento() {
        return sConhecimento;
    }

    public void setsConhecimento(String[] sConhecimento) {
        this.sConhecimento = sConhecimento;
    }
    
    
}
