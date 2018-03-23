/*
 * Estrutura de dados que consiste em itens de dados do mesmo tipo
 * Também chamado de subscrito
 * Deve ser inteiro e positivo ou expressão de inteiro
 * Primeiro elemento tem o índice 0 (zero)
 * Sempre a variável utilizada no índice tem que ser do tipo int.
 */
package exemplo01;

import java.util.Scanner;
/**
 *
 * @author Bruno Borges Martim
 */
public class Collection {
    public static void main(String[] args){
        /*
        Exemplos:
            c[10] = 2;
            ou
            a = 1; b = 4;
            c[a+b] = 2;
        */
        
        /* Exemplo 01
        int c[] = new int [12];
        // ou
        int d[];
        d = new int[12];
        */
        
        /* Exemplo 02
        int contador;
        contador = 0;
        int dados[] = {1,2,3,4,5};
        for (contador = 0; contador < dados.length; contador++){
            System.out.println(dados[contador]);
        }
        */
        
        /*
            Defina um array de tamanho 15 e implemente um laço 
                para incluir dados
        */
        Scanner numeros = new Scanner(System.in);
        int contador = 0;
        int number;
        int dados[] = new int[15];
        
        do{
            System.out.print("Insira um valor para o indice: " + contador + " da collection: ");
            number = numeros.nextInt();
            dados[contador] = number;
            contador++;
        }while(contador < 15);
    }
}
