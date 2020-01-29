/*
 * PROBLEMA:
 * 	Ler quinze números e informar se cada um é maior, menor ou igual a zero.
*/
programa
{
	funcao inicio()
	{
		inteiro c=1			//Estabelece o valor inicial de uma contagem (c=contador) em integros a partir de um;
		real n				//Declara a variável do número que será digitado e comparado com zero;
		enquanto(c<=15)			//Programa o contador para até o valor quinze (com isso temos de 1 a 15 repetições antes de continuar);
		{
			escreva("Digite um número: \n")	//Funções da repeticão de um a quinze:
			leia(n)
			se(n>=0)
			{
				se(n>0)
				{
					escreva("O número é maior que zero.\n")
				}
				senao
				{
					escreva("O número é igual a zero.\n")	//Exibe resultados comparativos conforme condições;
				}
			}
			senao
			{
				escreva("O número é menor que zero.\n")
			}
			c=c+1			//Acrescenta um no valor do contador (incremento) para refazer as instruções com um novo valor de c;
		}
		escreva("Já chega por hoje!\n")	//Saída de dados finalizando o programa.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 807; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
