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
public class Entrada {
    
    int idEntrada;
    PessoaJurid Fornecedor;
    String dataEntrada;
    String horaEntrada;
    float valor;
    String status;
    ItensEntrada itensEntrada;
    Funcionario funcionario;

    public Entrada(){}
    
    public Entrada(int idEntrada, PessoaJurid Fornecedor, String dataEntrada, String horaEntrada, float valor, String status, ItensEntrada itensEntrada, Funcionario funcionario) {
        this.idEntrada = idEntrada;
        this.Fornecedor = Fornecedor;
        this.dataEntrada = dataEntrada;
        this.horaEntrada = horaEntrada;
        this.valor = valor;
        this.status = status;
        this.itensEntrada = itensEntrada;
        this.funcionario = funcionario;
    }

    public PessoaJurid getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(PessoaJurid Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ItensEntrada getItensEntrada() {
        return itensEntrada;
    }

    public void setItensEntrada(ItensEntrada itensEntrada) {
        this.itensEntrada = itensEntrada;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
   
    
}
