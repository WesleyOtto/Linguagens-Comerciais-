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
public class Venda {
    
    int idVenda;
    PessoaFisica Cliente;
    String dataVenda;
    String horaVenda;
    String valor;
    Funcionario funcionario;
    ItensVenda itensVenda;

    public Venda(int idVenda, PessoaFisica Cliente, String dataVenda, String horaVenda, String valor, Funcionario funcionario, ItensVenda itensVenda ) {
        this.idVenda = idVenda;
        this.Cliente = Cliente;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.valor = valor;
        this.funcionario = funcionario;
        this.itensVenda = itensVenda;
    }
    
     public PessoaFisica getCliente() {
        return Cliente;
    }

    public void setCliente(PessoaFisica Cliente) {
        this.Cliente = Cliente;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ItensVenda getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ItensVenda itensVenda) {
        this.itensVenda = itensVenda;
    }
    
    
    
}
