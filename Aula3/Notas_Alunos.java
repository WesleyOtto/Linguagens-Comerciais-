/*
 * Declare um array que irá guardar as notas de 50 alunos e depois calcule:
    - Quantidade de alunos aprovados, reprovados e em recuperação, sabendo que:
        * nota maior ou igual a 7, aprovado
        * nota maior ou igual a 5 e menor que 7, recuperação
        * nota menor que 5, reprovado
    - Quantidade de alunos nas notas de 0  a 10
 */
package exemplo01;

import java.util.Scanner;

/**
 * @date 23/03/2018
 * @author Bruno Borges Martim
 */
public class Notas_Alunos {

    public static void main(String[] args){
        Scanner numeros = new Scanner(System.in);
        int contador = 0;
        int nota;
        int[] notas_alunos = new int[15];

        do{
            System.out.print("Insira um valor para o indice: " + contador + " da collection: ");
            nota = numeros.nextInt();
            notas_alunos[contador] = nota;
             contador++;
        }while(contador < 15);
    }
}
