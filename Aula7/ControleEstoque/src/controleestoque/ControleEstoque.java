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
public class ControleEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       connect con = new connect();
       
       
       if(con.conectaBaseDados() != null) {
           
           System.out.println("Base de dados conectada!");
       }
       
    }
    
}
