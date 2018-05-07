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
public class Endereco {
    private Integer enderecoid;
    private String  cep;
    private String  cidade;
    private String  estado;
    private String  pais;
    private String  referencia;
    private String  complemento;
    
    public Endereco(){
        //
    }
    
    public Endereco(int idEndereco, String  cepEndereco, String cidadeEndereco,String  estadoEndereco, String  paisEndereco, String  referenciaEndereco, String  complementoEndereco ){
        enderecoid = idEndereco;
        cep = cepEndereco;
        cidade = cidadeEndereco;
        estado = estadoEndereco;
        pais = paisEndereco;
        referencia = referenciaEndereco;
        complemento = complementoEndereco;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the enderecoid
     */
    public Integer getEnderecoid() {
        return enderecoid;
    }

    /**
     * @param enderecoid the enderecoid to set
     */
    public void setEnderecoid(Integer enderecoid) {
        this.enderecoid = enderecoid;
    }
}
