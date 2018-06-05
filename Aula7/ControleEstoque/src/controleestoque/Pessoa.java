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
public class Pessoa  {
    int pessoaId;
    private String Fone;
    private String Nome;
    private String email;
    private Endereco Endereco;        
    
public Pessoa( ){
        //
    }

    public Pessoa(String Fone, String Nome, String email, Endereco Endereco, int pessoaId ){
        this.Fone = Fone;
        this.Nome = Nome;
        this.email = email;
        this.Endereco = Endereco;
        this.pessoaId = pessoaId;
    }

    public int getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    

    public String getFone() {
        return Fone;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }
    
   
    
}



