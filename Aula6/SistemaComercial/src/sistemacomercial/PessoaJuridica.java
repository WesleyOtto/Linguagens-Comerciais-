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
public class PessoaJuridica {
    private Integer pessoajuridicaid;
    private String  nomeFantasia;
    private String  cnpj;
    private String  inscEstadual;
    private String  webSite;    
    
    public PessoaJuridica(){
    //
    }

    public PessoaJuridica(Integer pessoajuridicaid, String nomeFantasia, String cnpj, String inscEstadual, String webSite) {
        this.pessoajuridicaid = pessoajuridicaid;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.webSite = webSite;
    }
    
    
   
    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the inscEstadual
     */
    public String getInscEstadual() {
        return inscEstadual;
    }

    /**
     * @param inscEstadual the inscEstadual to set
     */
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    /**
     * @return the webSite
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * @param webSite the webSite to set
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    /**
     * @return the juridicaid
     */
    public Integer getPessoaJuridicaid() {
        return pessoajuridicaid;
    }

    /**
     * @param pessoajuridicaid the juridicaid to set
     */
    public void setPessoaJuridicaid(Integer pessoajuridicaid) {
        this.pessoajuridicaid = pessoajuridicaid;
    }
}
