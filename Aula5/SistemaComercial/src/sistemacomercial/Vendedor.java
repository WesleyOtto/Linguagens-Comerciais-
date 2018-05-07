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
public class Vendedor {
    private Integer vendedorid;
    private Float comissao;
    
    public Vendedor(){
        //
    }

    public Vendedor(Integer vendedorid, Float comissao) {
        this.vendedorid = vendedorid;
        this.comissao = comissao;
    }
    
    /**
     * @return the comissao
     */
    public Float getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(Float comissao) {
        this.comissao = comissao;
    }

    /**
     * @return the vendedorid
     */
    public Integer getVendedorid() {
        return vendedorid;
    }

    /**
     * @param vendedorid the vendedorid to set
     */
    public void setVendedorid(Integer vendedorid) {
        this.vendedorid = vendedorid;
    }
}
