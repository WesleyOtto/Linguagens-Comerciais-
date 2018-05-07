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
public class Telefone {
    private Integer telefoneid;
    private String  numero;
    private String  ddd;
    private String  tipo;
    private String  ddi;
    
    public Telefone(){
        //
    }
    public Telefone(Integer telefoneid, String numero, String ddd, String tipo, String ddi) {
        this.telefoneid = telefoneid;
        this.numero = numero;
        this.ddd = ddd;
        this.tipo = tipo;
        this.ddi = ddi;
    }
    
    
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ddi
     */
    public String getDdi() {
        return ddi;
    }

    /**
     * @param ddi the ddi to set
     */
    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    /**
     * @return the telefoneid
     */
    public Integer getTelefoneid() {
        return telefoneid;
    }

    /**
     * @param telefoneid the telefoneid to set
     */
    public void setTelefoneid(Integer telefoneid) {
        this.telefoneid = telefoneid;
    }
}
