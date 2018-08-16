/*
 * PROBLEMA:
 * 	Calcular o valor final do consumo de energia em um período de 30 dias, dado o valor do kw/h.
*/
programa
{
	funcao inicio()
	{
		real C, V
		escreva("Digite o consumo em kw/h: ")
		leia(C)
		se(C>=0)				//Verificar se o valor é negativo.
		{
			se(C<99999)			//Barrar valores muito absurdos.
			{
				se(C<=150)
				{
					V=C*0.2262	//Checar qual será o valor base conforme previsto (menor ou maior que 150).
				}			//Realizar cálculo conforme;
				senao
				{
					V=C*0.26531
				}
				escreva("O valor do consumo em 30 dias é: R$", V)	//Mostrar os resultados;
			}
			senao
			{
				escreva("O valor digitado é muito alto.")
			}
		}					//Se C for negativo ou muito alto o programa não irá calcular e terminará.
		senao
		{
				escreva("O valor digitado é negativo.")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 666; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
