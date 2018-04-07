/**
 *
 * @author  Bruno Borges
 *          Guilherme Cabrini  
 *          Wesley Otto 
 */

package not_sudoku;
import java.util.Scanner; 

public class Not_sudoku {
  
    public static int sudoku[][];
    
    //Usuario define o sudoku
    public static void defineSudoku(){
        
        int numero, linha, coluna;
        String repetir = "";
        
        do {
            Scanner dados = new Scanner(System.in); 
            System.out.println("Digite o valor a ser inserido:");

            numero = dados.nextInt(); 

            System.out.println("Digite a linha de insercao do numero:");
            linha = dados.nextInt(); 

            System.out.println("Digite a coluna de insercao do numero:");
            coluna = dados.nextInt(); 

            sudoku[linha][coluna] = numero; 
            
            System.out.println("Informar outro numero? (S/N)");
            repetir= dados.next(); 
            
        }while(repetir.equals("S") || repetir.equals("s"));   
    }
    
        
    public static void exibeSudoku(){
        
        for (int linha = 0; linha < sudoku.length; linha++) {
            for (int coluna = 0; coluna < sudoku[linha].length; coluna++){
               System.out.print(sudoku[linha][coluna] + "  ");
            }
            System.out.println("");
        }
    }
    
        
    public static void resolveSudoku(){
    
        //checar linha
        //checar coluna
        //checar quadrante
        /*
           1- Checo a minhas 
        
        
        */
                
              
    }
    
    public static void main(String[] args) {
        
        sudoku = new int[9][9];
    
        defineSudoku(); 
        exibeSudoku();
        resolveSudoku();
        
    }
    
}
