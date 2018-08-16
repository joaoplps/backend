/*
 * PROBLEMA:
 * 	Mostrar os número de 1 a 30, substituindo os múltiplos de quatro pela palavra "pim".
*/
programa
{
	funcao inicio()
	{
		inteiro n, c=1, x			//Definir variável n=números, c=contador e x=múltiplo;
		escreva("Defina o múltiplo comum: ")
		leia(x)
		para(c=0; c<=29; c++)			//Contagem inteira de um a 30 (o zero vale uma posição);
		{
			n=c+1				//Fórmula da contagem definindo n a partir de c (aproveitar o contador);
			se (n % x == 0) 		//Se n for divisível pelo múltiplo, escreva "pim", se não escreva n;
			{
				escreva("pim")	
			}
			senao
			{
				escreva(n)
			}
		escreva(" ")				//A cada número ou palavra escrita, dá-se um espaço.
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
