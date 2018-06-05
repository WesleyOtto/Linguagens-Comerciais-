/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Guilherme
 */
public class connect{
    
    public connect()
    {}
    
    //Metodo de acesso ao banco de dados
    
    public Connection conectaBaseDados()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String strUrl = "jdbc:mysql://localhost:3306/notcontroleestoque";
            Connection conn = DriverManager.getConnection(strUrl,"root","root");
            return conn;
        }
        catch (Exception e)
        { 
            System.out.println("Erro ao realizar a conexão");
            e.printStackTrace();
            return null;
        }    
    }   
        
        
     
    
    
    //Metodo para fechamento do banco de dados
    public void desconectaBaseDados(Connection con){
        
        try{
            con.close();
        }
        catch (Exception e){
            System.out.println("Problemas ao fechar o banco!");
        }   
    }

        
    
    } 

 
