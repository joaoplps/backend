/*
 * PROBLEMA:
 * 	Gerar o preço final de um carro ao consumidor e os valores de impostos dado o custo de fábrica.
 * 	- Impostos - 45%
 * 	- Lucro - 12%
 */
programa
{
	funcao inicio()
	{
		real i=0.45, l=0.12, c, f					//Conjunto de variáveis já inicializadas (impostos sabidos);
		escreva("Insira o custo de fábrica do automóvel : \n")		//Entrada do custo;
		leia(c)
		i=i*c								//Cálculo do imposto;
		l=l*c								//Cálculo do lucro;
		f=c+i+l								//Cálculo do valor final = custo + imposto + lucro;
		escreva("O valor final será de ", f, ", e serão abatidos ", i, " de imposto, e ", l, " de lucro.")	//Exibe resultados.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
