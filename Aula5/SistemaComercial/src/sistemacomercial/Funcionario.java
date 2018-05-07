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
public class Funcionario {
    private Integer funcionarioid;
    private Float salario;
    private String cateiraDeTrabalho;
    private Float meta;
    private String horario;    
    
    
    public Funcionario(){
        //
    }
    
    public Funcionario(Integer funcionarioidFuncionario, Float salarioFuncionario, String cateiraDeTrabalhoFuncionario,Float metaFuncionario, String horarioFuncionario){
        funcionarioid = funcionarioidFuncionario;
        salario = salarioFuncionario;
        cateiraDeTrabalho = cateiraDeTrabalhoFuncionario;
        meta = metaFuncionario;
        horario = horarioFuncionario;
    }

    /**
     * @return the salario
     */
    public Float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    /**
     * @return the cateiraDeTrabalho
     */
    public String getCateiraDeTrabalho() {
        return cateiraDeTrabalho;
    }

    /**
     * @param cateiraDeTrabalho the cateiraDeTrabalho to set
     */
    public void setCateiraDeTrabalho(String cateiraDeTrabalho) {
        this.cateiraDeTrabalho = cateiraDeTrabalho;
    }

    /**
     * @return the meta
     */
    public Float getMeta() {
        return meta;
    }

    /**
     * @param meta the meta to set
     */
    public void setMeta(Float meta) {
        this.meta = meta;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the funcionarioid
     */
    public Integer getFuncionarioid() {
        return funcionarioid;
    }

    /**
     * @param funcionarioid the funcionarioid to set
     */
    public void setFuncionarioid(Integer funcionarioid) {
        this.funcionarioid = funcionarioid;
    }
}
