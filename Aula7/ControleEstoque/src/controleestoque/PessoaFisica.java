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
public class PessoaFisica extends Pessoa{
    
    private int PessoaFisicaId;
    private String CPF;
    private String RG;
    private int status; 
    
    
    public PessoaFisica(){}

    public PessoaFisica(int PessoaFisicaId, String CPF, String RG, int status) {
        this.PessoaFisicaId = PessoaFisicaId;
        this.CPF = CPF;
        this.RG = RG;
        this.status = status;
    }

       public String getCPF() {
        return CPF;
    }

    public String getRG() {
        return RG;
    }

    public int getStatus() {
        return status;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    //Metodo    
    public boolean validaCPF(){
        
        return true;
                
    }
    
}
