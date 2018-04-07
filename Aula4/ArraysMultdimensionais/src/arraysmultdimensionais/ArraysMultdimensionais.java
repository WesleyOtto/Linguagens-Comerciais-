package arraysmultdimensionais;

/**
 *
 * @author Wesley
 */
public class ArraysMultdimensionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int c [][] = { {1, 2}, {3, 4} }; 
        for (int linha = 0; linha < c.length; linha++){
            for (int coluna = 0; coluna < c[linha].length; coluna++){
                System.out.println(linha + ":" + coluna + " = ");
                System.out.println(c[linha][coluna]);
            
            }
            
        }
    }
    
}
