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
public class Endereco {
    
    String idEndereço;
    String bairro;
    int numero;
    String cidade; 
    String CEP;

    public Endereco (){}
    
    public Endereco(String idEndereço, String bairro, int numero, String cidade, String CEP) {
        this.idEndereço = idEndereço;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
   
            
}
