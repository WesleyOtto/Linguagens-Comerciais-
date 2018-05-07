/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacomercial;

/**
 *
 * @author victo
 */
public class Setor {
    private Integer setorId;
    private String nome;
    
    public Setor(){
        //
    }

    public Setor(Integer setorId, String nome) {
        this.setorId = setorId;
        this.nome = nome;
    }

    /**
     * @return the setorId
     */
    public Integer getSetorId() {
        return setorId;
    }

    /**
     * @param setorId the setorId to set
     */
    public void setSetorId(Integer setorId) {
        this.setorId = setorId;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
