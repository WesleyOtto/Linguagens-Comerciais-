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
public class PessoaFisica extends pessoa {
    private Integer pessoaFisicaid;
    private String cpf;
    private String rg;
    private String sexo;
    
    public PessoaFisica(){
        //
    }
    
    public PessoaFisica(Integer idpessoaFisica, String cpfPessoaFisica, String rgPessoaFisica,String sexoPessoaFisica){
        pessoaFisicaid = idpessoaFisica;
        cpf = cpfPessoaFisica;
        rg = rgPessoaFisica;
        sexo = sexoPessoaFisica;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the pessoaFisicaid
     */
    public Integer getPessoaFisicaid() {
        return pessoaFisicaid;
    }

    /**
     * @param pessoaFisicaid the pessoaFisicaid to set
     */
    public void setPessoaFisicaid(Integer pessoaFisicaid) {
        this.pessoaFisicaid = pessoaFisicaid;
    }
}
