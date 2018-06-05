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
public class ItensEntrada {
    
    int idProduto;
    Produto produto;
    int quantidade;
    float valorUnit;
    float valorTotal;
    
    public ItensEntrada(){}

    public ItensEntrada(int idProduto, Produto produto, int quantidade, float valorUnit, float valorTotal) {
        this.idProduto = idProduto;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnit = valorUnit;
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(float valorUnit) {
        this.valorUnit = valorUnit;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    
    
}
