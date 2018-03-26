/*
Atividade:
    Implementar rotina para escrever valores numéricos por extenso,
        semelhante à rotina de preenchimento de cheques.
Exemplo:
    R$: 0,01 -> Um centavo
    R$: 0,02 -> Dois centavos
    R$: 1,00 -> Um Real
    R$: 10,00 -> Dez Reais
    R$: 11,00 -> Onze Reais
    R$: 21,00 -> Vinte e Um Reais

Dica:
    Criar uma collection das dezenas 10, 20, 30, ..., 90
    Criar uma collection das dezenas 11,12,13,...,19
    .
    .
    .
    Criar uma collection para bilhão 1 bilhão, 2 bilhões
--------------------------------------------------------------------
    1000 -> Mill
    1 [000] [000]   -> Milhão
    Um  Mil   0  

 */
package Exemplos_Aulas;

/**
 * @date 23/03/2018
 * @author Bruno Borges Martim
 */
public class Extenso {
    
    public static String ate19[] = {"zero", "um", "dois", "três",
                                    "quatro", "cinco", "seis", "sete",
                                    "oite", "nove", "dez","onze", "doze",
                                    "treze", "quatorze", "quinze", "dezesseis",
                                    "dezessete", "dezoito", "dezenove"};
    
    public static String dezenas[] = {"Zero","Dez","Vinte","Trinta","Quarenta",
                                        "Cinquenta","Sessenta","Setenta",
                                        "Oitenta", "Noventa"};
    
    public static String centenas[] = {"Zero","Cento e", "Duzentos", "Trezentos",
                                        "Quatrocentos", "Quinhentos","Seissentos",
                                        "Setessentos","Oitossentos","Novessentos"};
    
    public static String milhar_singular[] = {"Zero","Mil", "Milhão","Bilhão",
                                                "Trilhão","Quatrilhão"};
    
    public static String milhar_plural[] = {"Zero","Mil", "Milhões","Bilhões",
                                                "Trilhões","Quatrilhões"};
    
    /**
     * @autor Bruno Borges Martim
     * @date 23/03/2018
     * @param args
     */
    public static void main(String[] args){
        
    }
    
    public static String convertNumeroExtenso(String numero){
        numero = ajustaNumero(numero); // Normaliza o número
        return "";
    }
    
    public static String ajustaNumero(String numero){
        String temp = "";
        //Inclui valor decimal (0,00) caso não seja informado pelo usuário
        
        //Remover a vírgula do número.
        temp = removeTexto(temp,",");
        //Remover os pontos do número
        temp = removeTexto(temp,".");
        /* 
            O número 1.000,00 deve ser entregue dessa forma: 1000
            O número 10,01 deve ser entregue 10,01
        */
        return temp;
    }
    
    public static String removeTexto(String texto, String textoPesquisado){
        String temp = "";
        for(int i = 0; i < texto.length(); i++){
            if(texto.substring(i, i+1).equals(textoPesquisado)){
                // Não faz nada
            }else{
                temp = temp + texto.subSequence(i, i+1);
            }
        }
        return temp;
    }
}
