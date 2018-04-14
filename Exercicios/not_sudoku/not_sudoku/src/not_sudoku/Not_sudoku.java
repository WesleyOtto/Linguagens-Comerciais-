    /**
 *
 * @author  Bruno Borges
 *          Guilherme Cabrini  
 *          Wesley Otto 
 */

package not_sudoku;
import java.util.Scanner; 

//Importes para leitura de arquivo 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


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
    
    public static void defineSudoku(String arquivo){
        String informacao = "";
        int linha = 0; 
        
        try
        {    
            FileReader arqSudoku = new FileReader(arquivo);
            BufferedReader lerArqSudoku = new BufferedReader(arqSudoku);
            
            // Armazena a primeira linha 
            informacao = lerArqSudoku.readLine();
            
            while(informacao != null){
                
                for(int cont = 0; cont < informacao.length(); cont++){
                    
                    // Essa linha converte char para String
                    String letra = informacao.charAt(cont) + "";
                    sudoku[linha][cont] = Integer.parseInt(letra);
                    
                }  
                linha ++;
                informacao = lerArqSudoku.readLine();
                
            }   
            arqSudoku.close();
        
        } catch (IOException e){
            
            System.err.printf("Erro na abertura do arquivo: %s. \n");
            e.getMessage();
        }
            
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
    
    
    }
    
    public static void main(String[] args) {
        
        sudoku = new int[9][9];
    
        defineSudoku("C:\\temp\\Sudoku.txt"); 
        exibeSudoku();
        resolveSudoku();
        
    }
    
}
