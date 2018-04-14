/*
Atividade:
    Implementar rotina para escrever valores numÃ©ricos por extenso,
        semelhante Ã  rotina de preenchimento de cheques.
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
    Criar uma collection para bilhÃ£o 1 bilhÃ£o, 2 bilhÃµes
--------------------------------------------------------------------
    1000 -> Mill
    1 [000] [000]   -> MilhÃ£o
    Um  Mil   0  

 */

package numextenso;
import java.util.Scanner;
import javax.swing.text.html.parser.Parser;

/**
 *
 * @author  Bruno Borges
 *          Guilherme Cabrini  
 *          Wesley Otto 
 * @date    06/04/2018 
 */

public class NumExtenso {
	//Definição dos Arrays com as strings utilizadas para conversão dos númreros em texto
	public static String ate19[] = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
	public static String dezena[] = {"zero", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
	public static String centena[] = {"zero", "cento e", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
	public static String milharS[] = {"centavo", "real ", "mil", "milhão", "bilhão", "trilhão", "quatrilhão"};
	public static String milharP[] = {"centavos", "reais ", "mil", "milhões", "bilhões", "trilhões", "quatrilhões"};
	
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero;
		String extenso;
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite o número a ser escrito.");
		
		numero = valor.nextLine();
                //remove o ponto
		numero = removePonto(numero);
                numero = procuraVirgula(numero);
		extenso = converteNumeroExtenso(numero);
		
		System.out.println("O resultado da conversão é:");
		System.out.println(extenso);
		valor.close();
	}
	
	//Criando a função principal para separar os intervalos do número
    public static String converteNumeroExtenso(String numero)
	{               
		//Criação da variável que irá retornar o texto do número
		String texto = "";
		int contador = 0;
		String parte= "";
		int posicaoInicial = 0;
		String valores[] = new String[10];
		
		for (int i=numero.length(); i > 0; i--)
		{       
			if (i >= 3)
			{
				posicaoInicial = i - 3;
			}
			else
			{
				posicaoInicial = 0;
			}
			
			parte = numero.substring(posicaoInicial, i);

			if (parte.substring(0, 1).equals(","))
			{
				if(Integer.parseInt(parte.substring(1,3)) != 0)
				{
					valores[contador] = converte(parte.substring(1,3));
				}
			}
			else
			{
				if(Integer.parseInt(parte) != 0)
				{
					valores[contador] = converte(parte);
				}
			}
			contador ++;
			i = i - 2;
		}
		
		for (contador = 0; contador < valores.length; contador++)
		{
			if (valores[contador] != null)
			{
				if (texto.trim().length() != 0 && contador <2)
				{
					texto = "e " + texto;
				}
				else
				{
					if (texto.trim().length() != 0 && contador >= 1)
					{
						texto = ", " + texto;
					}
				}
				if (contador > 2 && valores[2] == null && valores[1] == null)
				{
					texto = " de reais " + texto;
				}
				else if (contador == 2 &&  valores[1] == null)
				{
					texto = "reais " + texto;
				}
				
				if (valores[contador].trim() == "um")
				{
					texto = milharS[contador] + texto;
				}
				else
				{
					texto = milharP[contador] + texto;
				}
				texto = valores[contador] + " " + texto;
				
			}
		}
		return texto;
	}

    public static String converte(String valor)
	{
		String dados = "";
		
		if(valor.length() == 3)
		{
			dados = centena[Integer.parseInt(valor.substring(0,1))];
			valor = valor.substring(1,3);
		}
		if (Integer.parseInt(valor) <= 19 && Integer.parseInt(valor) > 0)
		{
			if (dados.length() == 0)
			{
				dados = ate19[Integer.parseInt(valor)];
			}
			else
			{
				dados = dados + " " + ate19[Integer.parseInt(valor)];
			}
		}
		else if (Integer.parseInt(valor) > 19)
		{
			if (dados.length() == 0)
			{
				dados = dezena[Integer.parseInt(valor.substring(0,1))];
				if (Integer.parseInt(valor.substring(1,2)) > 0)
				{
					dados = dados + " e " + ate19[Integer.parseInt(valor.substring(1,2))];
				}
			}
			else
			{
				dados = dados + " e " + dezena[Integer.parseInt(valor.substring(0,1))];
				if (Integer.parseInt(valor.substring(1,2)) > 0)
				{
					dados = dados + " e " + ate19[Integer.parseInt(valor.substring(1,2))];
				}
			}	
		}
		if (dados.equals("cento e"))
		{
			dados = "cem";
		}
		return dados;
	}
    
     
    // Este método remove o Ponto 
    public static String removePonto(String texto){
        String temp = "";
        for(int i = 0; i < texto.length(); i++){
            if(texto.substring(i, i+1).equals(".")){
            }else{
                temp = temp + texto.subSequence(i, i+1);
            }
        }
        return temp;
    }
    
    // Verifica se existe virgula, caso não tenha adiciona-se  
    public static String procuraVirgula (String texto){
        String temp = "";
        for(int i = 0; i < texto.length(); i++){
            if(texto.substring(i, i+1).equals(",")) return texto; 
        }   
         temp = texto + ",00"; 
        
        return temp;
    }
    
}

                