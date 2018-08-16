/*
 * PROBLEMA:
 * 	Avaliar se três valores dados pelo usuário formam um triângulo, e se sim, qual o tipo.
*/
programa
{
	funcao inicio()
	{
		real a, b, c						//Conjunto de variáveis;
		escreva("Digite os três lados de um triângulo: \n")	//Entrada de dados;
		leia(a, b, c)
		se(a<b+c e b<c+a e c<a+b)				//Se qualquer lado for maior que a soma dos outros dois, as medidas não formam um triangulo.
		{
			se(a==b e a==c)					//Se todos os lados forem iguais.
			{
				escreva("O triangulo é Equilátero!")	//Saída de dados;
			}
			senao
			{
				se(a==b ou a==c ou b==c)		//Se não, se pelo menos dois lados forem iguais.
				{
					escreva("O triangulo é Isósceles!")	//Saída de dados;
				}
				senao					//Se todos os lados forem diferentes.
				{
					escreva("O triangulo é Escaleno!")	//Saída de dados;
				}
			}
		}
		senao							//Se qualquer um dos lados for maior ou igual a soma dos outros dois lados, não formam um triângulo.
		{
			escreva("Não é um triangulo.\n")		//Saída de dados.
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 996; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
