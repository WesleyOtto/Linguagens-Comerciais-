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
public class Funcao {
    int funcaoId; 
    String Nome;
    int NVSEG;
    
public Funcao(){}

    public Funcao(int funcaoId, String Nome, int NVSEG) {
        this.funcaoId = funcaoId;
        this.Nome = Nome;
        this.NVSEG = NVSEG;
    }

    public int getFuncaoId() {
        return funcaoId;
    }

    public void setFuncaoId(int funcaoId) {
        this.funcaoId = funcaoId;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNVSEG() {
        return NVSEG;
    }

    public void setNVSEG(int NVSEG) {
        this.NVSEG = NVSEG;
    }

           
    
}
