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
public class Contato {
    private Integer contatoid;
    private String  nome;
    private String  empresa;
    
    public Contato(){
        //
    }
    
    public Contato(int idContato, String nomeContato, String empresaContato){
        contatoid = idContato;
        nome = nomeContato;
        empresa = empresaContato;
    }
    
    /**
     * @return the nomeContato
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nomeContato to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the contatoid
     */
    public Integer getContatoid() {
        return contatoid;
    }

    /**
     * @param contatoid the contatoid to set
     */
    public void setContatoid(Integer contatoid) {
        this.contatoid = contatoid;
    }
    
}
