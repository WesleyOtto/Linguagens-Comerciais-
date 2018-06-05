/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleestoque;

import java.sql.*;

/**
 *
 * @author Guilherme
 */
public class pessoaControle {

    public pessoaControle() {
        
    }
    
    //Metodo para inserção de pessoas
    public boolean insereDadosPessoa(Pessoa pessoa){
       
       try{
           //Montar instrução sql
           String strSQL = "";
           strSQL = "Insert into pessoa (nome, fone, email) values";
           strSQL = strSQL + "('" + pessoa.getNome() + "', ";
           strSQL = strSQL + "'" + pessoa.getFone() + "';";
           strSQL = strSQL + "'" +pessoa.getEmail() + "');";
            
           //Criando objeto da conexão
           connect conect = new connect();
           Connection con = conect.conectaBaseDados();
           if (con != null)
           {
               Statement stmt = (Statement)con.createStatement();
               
               //Executar a instrução sql
               
               stmt.execute(strSQL);
               conect.desconectaBaseDados(con);
             
             return true;
           }else{
               return false;
           }  
       }
       catch (Exception e){
           
           return false;
       }   
        
    }    
    
    //Metodo para exclusão de pessoas
    public boolean deletaDadosPessoa(Pessoa pessoa){
       
       try{
           //Montar instrução sql
           String strSQL = "";
           strSQL = "Delete from pessoa where pessoaId = ";
           strSQL = strSQL + "('" + pessoa.getPessoaId() + ";";
           
            
           //Criando objeto da conexão
           connect conect = new connect();
           Connection con = conect.conectaBaseDados();
           if (con != null)
           {
               Statement stmt = (Statement)con.createStatement();
               
               //Executar a instrução sql
               
               stmt.execute(strSQL);
               conect.desconectaBaseDados(con);
             
             return true;
           }else{
               return false;
           }  
       }
       catch (Exception e){
           
           return false;
       }   
        
    }    
    
    //Metodo para atualização dos dados de pessoas
    public boolean atualizaDadosPessoa(Pessoa pessoa){
       
       try{
           //Montar instrução sql
           String strSQL = "";
           strSQL = "update pessoa set Nome = '"+ pessoa.getNome()+ "', " ;
           strSQL = strSQL + "Fone = '" + pessoa.getFone()+ "', " ;
           strSQL = strSQL + "email= '" + pessoa.getEmail() + "', " ;
           strSQL = strSQL + "where pessoaId = " +pessoa.getPessoaId() + ";";
           
            
           //Criando objeto da conexão
           connect conect = new connect();
           Connection con = conect.conectaBaseDados();
           if (con != null)
           {
               Statement stmt = (Statement)con.createStatement();
               
               //Executar a instrução sql
               
               stmt.executeUpdate(strSQL);
               conect.desconectaBaseDados(con);
             
             return true;
           }else{
               return false;
           }  
       }
       catch (Exception e){
           
           return false;
       }   
        
    }    
    
    //Metodo para retornar somente a pessoa desejada
     public ResultSet buscaDadosPessoa(Pessoa pessoa){
       
       try{
           connect conexao = new connect();
           ResultSet rs = null;
           //Montar a instrução sql
           String strSQL = "";
           String strSql = "Select * from pessoa";
           strSQL = strSQL + "where pessoaId = " +pessoa.getPessoaId() + ";";
           
            
            //Realiza a conexao com o banco
           Connection con = conexao.conectaBaseDados();
           if (con != null)
           {
               Statement stmt = (Statement)con.createStatement();
               
               //Executar a instrução sql
               
               rs = stmt.executeQuery(strSql);
               conexao.desconectaBaseDados(con);
             
            }
           return rs;
       }
       catch (Exception e){
           
           return null;
       }   
        
    }   
     
    //Metodo para retornar todas as pessoas cadastras do banco de dados
     public boolean allDadosPessoa(Pessoa pessoa){
       
       try{
           //Montar instrução sql
           String strSQL = "";
           strSQL = "select * from pessoa;";
           
           
            
           //Criando objeto da conexão
           connect conect = new connect();
           Connection con = conect.conectaBaseDados();
           if (con != null)
           {
               Statement stmt = (Statement)con.createStatement();
               
               //Executar a instrução sql
               
               stmt.execute(strSQL);
               conect.desconectaBaseDados(con);
             
             return true;
           }else{
               return false;
           }  
       }
       catch (Exception e){
           
           return false;
       }   
        
    }    
    
    
}
