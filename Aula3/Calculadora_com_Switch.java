package exemplo01;

/**
 *
 * @author Guilherme Cabrini
 */
import java.util.Scanner;

public class Calculadora_com_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);
        
        int valor1, valor2, op;
        float resultado;
        
        System.out.print("1. Soma \n");
        System.out.print("2. Subtração \n");
        System.out.print("3. Multiplicação  \n");
        System.out.print("4. Divisão  \n");
        System.out.print("Selecione o tipo de operação numérica:  ");
        op = num.nextInt();
        System.out.println();
        
        
            
        
        switch(op){
            
            case 1:
                
                System.out.print("Insira o primeiro valor:  ");
                valor1 = num.nextInt();
                System.out.println();
                System.out.print("Insira o segundo valor:  ");
                valor2 = num.nextInt();
                System.out.println();
                
                resultado = (float) valor1 + valor2;
                
                System.out.println("Resultado:   " + resultado);
                System.out.println();
                
                break;
            
            case 2:
                
                System.out.print("Insira o primeiro valor:  ");
                valor1 = num.nextInt();
                System.out.println();
                System.out.print("Insira o segundo valor:  ");
                valor2 = num.nextInt();
                System.out.println();
                
                resultado = (float) valor1 - valor2;
                
                System.out.println("Resultado:   " + resultado);
                System.out.println();
                
                break;
                
            case 3:
                
                System.out.print("Insira o primeiro valor:  ");
                valor1 = num.nextInt();
                System.out.println();
                System.out.print("Insira o segundo valor:  ");
                valor2 = num.nextInt();
                System.out.println();
                
                resultado = (float) valor1 * valor2;
                
                System.out.println("Resultado:   " + resultado);
                System.out.println();
                
                break;
                
            case 4:
                
                System.out.print("Insira o primeiro valor:  ");
                valor1 = num.nextInt();
                System.out.println();
                System.out.print("Insira o segundo valor:  ");
                valor2 = num.nextInt();
                System.out.println();
                
                resultado = (float) valor1 / valor2;
                
                System.out.println("Resultado:   " + resultado);
                System.out.println();
                
                break;
                
            
            
                
            default:
                
               
                System.out.println("Operação Inválida  ");
                System.out.println();
            
        }
        
        
    }
    
}
