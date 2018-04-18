 /**
 * Programa solucionador de sudokus de até nível médio, testado pelo site
 * https://www.geniol.com.br/logica/sudoku/
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
    
    //Metodo para chegar se posso colocar o numero teste na posição
    public static boolean checkNumero(int linha, int coluna, int teste){
        int auxLinha, auxColuna;
        
        if(sudoku[linha][coluna] == teste) return true;
        
        //Checa se o numero é o numero do sudoku
        if(sudoku[linha][coluna] != 0) return false;
        
         //Testo numero na linha 
        for (int i = 0; i < 9 ; i++){
            if(sudoku[linha][i] == teste) return false; 
        }
        
         // Testo numero na coluna 
        for (int j = 0; j < 9; j++){
            if(sudoku[j][coluna] == teste) return false; 
        }
        
        // Testo numero no quadrante 
        
        auxLinha = linha / 3;
        auxColuna = coluna / 3;

        for (int l = auxLinha * 3; l < (auxLinha + 1) * 3; l++)
          for (int c = auxColuna * 3; c < (auxColuna + 1) * 3; c++)
            if (sudoku[l][c] == teste) return false;
                 
    return true;
    }    
    
    // Verifica se o numero se encontra uma unica vez na linha, e insere
    public static boolean TesteLinhaNumero(int linha, int teste){
        int checkTeste = 0; int auxColuna = 0, coluna = 0;    
        
        while(coluna < 9 ){
            
            if(checkNumero(linha, coluna, teste)){
                checkTeste ++;
                auxColuna = coluna;
            }
            coluna++; 
        }
    
        if(checkTeste == 1){
            sudoku[linha][auxColuna] = teste;
            return false;
        }
        
        return true; 
    }
        
   // Resolve a linha    
    public static boolean linhaResolve(int linha){
        int teste = 1; 
        boolean inseriu = false;
        
        while(teste < 10){
            inseriu = TesteLinhaNumero(linha, teste);
            teste++;
        }
        
 
       return inseriu ;
    }
    
    // Verifica se o numero se encontra uma unica vez na coluna e insere
    
    public static boolean TesteColunaNumero(int coluna, int teste){
        int checkTestec = 0; int auxLinha = 0, linha = 0;    
        
        while(linha < 9 ){
            
            if(checkNumero(linha, coluna, teste)){
                checkTestec ++;
                auxLinha = linha;
            }
            linha++; 
        }
    
        if(checkTestec == 1){
            sudoku[auxLinha][coluna] = teste;
            return false;
        }
        
        return true; 
    }
    
    // resolve a coluna
    public static boolean colunaResolve(int coluna){
        
        int teste = 1; 
        
        boolean inseriu = false;
        
        while(teste < 10){
            inseriu = TesteColunaNumero(coluna, teste);
            teste++;
        }
        
 
       return inseriu ;
    
    }
    
    public static boolean campoVazio(){
         for (int linha = 0; linha < sudoku.length; linha++) {
            for (int coluna = 0; coluna < sudoku[linha].length; coluna++){
                if(sudoku[linha][coluna] == 0) return true;
            }
            
        }
    
        return false;
    }
            
    public static void resolveSudoku(){
    
        boolean linhaInput = false, colunaInput = false;
     
        
        do{
            int linha = 0;
            int coluna = 0;
           
             
            while(linha <= 8 ){
                linhaInput = linhaResolve(linha);
                linha ++;
            }
            
           
           
            while(coluna <= 8 ){
               colunaInput = colunaResolve(coluna);
               coluna ++;
               
            }
           
         // Enquanto existir insercao deu um numero eu continuo fazendo ou se existir campo vazio 
           
        }while(linhaInput || colunaInput || campoVazio()); 
        
       
            
    }
    
    
    public static void main(String[] args) {
        
        sudoku = new int[9][9];
    
        defineSudoku("C:\\temp\\Sudoku2.txt"); 
        System.out.println("Sudokuu");
        exibeSudoku();
        System.out.println("-------");
        System.out.println("Resolucao");
        resolveSudoku();
        exibeSudoku();
        
    }
    
}
