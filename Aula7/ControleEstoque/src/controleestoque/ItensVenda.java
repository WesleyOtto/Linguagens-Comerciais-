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
public class ItensVenda {
    
    int idItensVenda;
    int quantidade;    
    float valorUnidade;
    float ValorTotal;
    Produto produto;
    

    public ItensVenda(int idItensVenda, int quantidade, float valorUnidade, float ValorTotal, Produto produto) {
        this.idItensVenda = idItensVenda;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
        this.ValorTotal = ValorTotal;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(float valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    
}
