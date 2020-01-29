/*
 * PROBLEMA:
 * 	Calcular e mostrar os dez primeiros termos da tabuada de um número lido.
*/
programa
{
	funcao inicio()
	{
		real n, r					//Variáveis n=número, r=resultado e t=tabuada;
		escreva("Digite um número: ")
		leia(n)
		para(inteiro t=1; t<=10; t++)			//Contagem inteira de um a dez;
		{
			r=n*t					//Fórmula de cálculo do resultado da posição t da tabuada;
			escreva(n, " x ", t, " = ", r, "\n")	//Saída de dados tabulados.
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
