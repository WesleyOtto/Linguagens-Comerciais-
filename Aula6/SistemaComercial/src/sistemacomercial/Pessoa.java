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
    public class Pessoa {
    private Integer pessoaid;
    private String nome;
    private String email;
    private String dataNascimento;
    
    public Pessoa(){
        //
    }
    
    public Pessoa(int idPessoa, String nomePessoa, String emailPessoa,String dataNascimentoPessoa){
        pessoaid = idPessoa;
        nome = nomePessoa;
        email = emailPessoa;
        dataNascimento = dataNascimentoPessoa;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String newVal){
        nome = newVal;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the pessoaid
     */
    public Integer getPessoaid() {
        return pessoaid;
    }

    /**
     * @param pessoaid the pessoaid to set
     */
    public void setPessoaid(Integer pessoaid) {
        this.pessoaid = pessoaid;
    }
    
}
