/*
 * PROBLEMA:
 * 	Dizer qual número é maior entre dois valores fornecidos, especificando se forem iguais.
 */
programa
{
	funcao inicio()
	{
		real a, b					//Conjunto de variáveis;
		escreva("Insira dois números A e B: \n")	//Entrada de dados;
		leia(a, b)
		se(a>b){					//Decisão 1: Se o primeiro número é maior que o segundo;
				escreva("A é maior que B!")	//Saída de dados;
		}
		senao{						//Se não, entra na decisão 2;
			se(a<b){				//Decisão 2: Se o primeiro número for menor que o segundo;
				escreva("B é maior que A!")	//Saída de dados;
			}
			senao{					//Se não, escreva a igualdade;
				escreva("A = B!")		//Saída de dados.
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 635; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
