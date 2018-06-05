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
public class Produto {
    
    int idProduto;
    String nome;
    String codBarras;
    float preco;
    int quantidade;
    int quantMinima;
    PessoaJurid fornecedor;
    Funcionario funcionario;
    

public Produto(){}

    public Produto(int idProduto, String nome, String codBarras, float preco, int quantidade, int quantMinima, PessoaJurid fornecedor, Funcionario funcionario) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.codBarras = codBarras;
        this.preco = preco;
        this.quantidade = quantidade;
        this.quantMinima = quantMinima;
        this.fornecedor = fornecedor;
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantMinima() {
        return quantMinima;
    }

    public void setQuantMinima(int quantMinima) {
        this.quantMinima = quantMinima;
    }

    public PessoaJurid getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(PessoaJurid fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }


    
}
