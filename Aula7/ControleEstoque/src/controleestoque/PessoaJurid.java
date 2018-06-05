/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

/**
 *
 * @author wesle
 */
public class PessoaJurid extends Pessoa{
   
    private int PessoaJuridicaId;
    private String razaoSocial;
    private String CNPJ;
    private String InscricaoEstadual;

    public PessoaJurid(int PessoaJuridicaId, String razaoSocial, String CNPJ, String InscricaoEstadual) {
        this.PessoaJuridicaId = PessoaJuridicaId;
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.InscricaoEstadual = InscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getInscricaoEstadual() {
        return InscricaoEstadual;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setInscricaoEstadual(String InscricaoEstadual) {
        this.InscricaoEstadual = InscricaoEstadual;
    }
    
    
     //Metodo    
    public boolean validaCNPJ(){
        
        return true;
                
    }
}
