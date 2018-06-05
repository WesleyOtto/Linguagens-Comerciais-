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
public class Funcionario extends PessoaFisica{
    private int funcionarioId;
    private String senha;
    private String foto; 
    private Funcao funcao;  
   
    public Funcionario(){}

    public Funcionario(int funcionarioId, String senha, String foto, Funcao funcao) {
        this.funcionarioId = funcionarioId;
        this.senha = senha;
        this.foto = foto;
        this.funcao = funcao; 
    }

    public String getSenha() {
        return senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
    
  
}
