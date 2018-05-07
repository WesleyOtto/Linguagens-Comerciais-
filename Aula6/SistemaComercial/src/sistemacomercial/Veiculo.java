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
public class Veiculo {
    private Integer veiculoid;
    private String  modelo;
    private String  kilometragem;
    private Integer ano;
    private String  renavan;
    private PessoaFisica    motorista;
    private String  combustivel;
    
    public Veiculo(){
        //
    }

    public Veiculo(Integer veiculoid, String modelo, String kilometragem, Integer ano, String renavan, PessoaFisica motorista, String combustivel) {
        this.veiculoid = veiculoid;
        this.modelo = modelo;
        this.kilometragem = kilometragem;
        this.ano = ano;
        this.renavan = renavan;
        this.motorista = motorista;
        this.combustivel = combustivel;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the kilometragem
     */
    public String getKilometragem() {
        return kilometragem;
    }

    /**
     * @param kilometragem the kilometragem to set
     */
    public void setKilometragem(String kilometragem) {
        this.kilometragem = kilometragem;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    /**
     * @return the renavan
     */
    public String getRenavan() {
        return renavan;
    }

    /**
     * @param renavan the renavan to set
     */
    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    /**
     * @return the motorista
     */
    public PessoaFisica getMotorista() {
        return motorista;
    }

    /**
     * @param motorista the motorista to set
     */
    public void setMotorista(PessoaFisica motorista) {
        this.motorista = motorista;
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the veiculoid
     */
    public Integer getVeiculoid() {
        return veiculoid;
    }

    /**
     * @param veiculoid the veiculoid to set
     */
    public void setVeiculoid(Integer veiculoid) {
        this.veiculoid = veiculoid;
    }
}
