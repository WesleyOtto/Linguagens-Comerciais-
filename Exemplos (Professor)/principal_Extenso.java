/**
 * 
 */

/**
 * @author curso
 *
 */

import java.util.Scanner;

import javax.swing.text.html.parser.Parser;

public class principal {

	/**
	 * 
	 */
	
	//Defini��o dos Arrays com as strings utilizadas para convers�o dos n�mreros em texto
	public static String ate19[] = {"zero", "um", "dois", "tr�s", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
	public static String dezena[] = {"zero", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
	public static String centena[] = {"zero", "cento e", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
	public static String milharS[] = {"centavo", "real ", "mil", "milh�o", "bilh�o", "trilh�o", "quatrilh�o"};
	public static String milharP[] = {"centavos", "reais ", "mil", "milh�es", "bilh�es", "trilh�es", "quatrilh�es"};
	
	public principal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero;
		String extenso;
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite o n�mero a ser escrito.");
		
		numero = valor.nextLine();
		
		extenso = converteNumeroExtenso(numero);
		
		System.out.println("O resultado da convers�o �:");
		System.out.println(extenso);
		valor.close();
	}
	
	//Criando a fun��o principal para separar os intervalos do n�mero
	public static String converteNumeroExtenso(String numero)
	{
		//Cria��o da vari�vel que ir� retornar o texto do n�mero
		String texto = "";
		int contador = 0;
		String parte= "";
		int posicaoInicial = 0;
		String valores[] = new String[10];
		
		//Rotina para remover o ponto final (.)
		//Falta implementar
		
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
}
