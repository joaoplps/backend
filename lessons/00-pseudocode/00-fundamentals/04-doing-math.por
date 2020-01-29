/*
 * 	Gerar o preço final de um carro ao consumidor e os valores de impostos dado o custo de fábrica.
 * 	- Impostos - 45%
 * 	- Lucro - 12%
 */
programa
{
	funcao inicio()
	{
		// Conjunto de variáveis já inicializadas (impostos sabidos)
		real i=0.45, l=0.12, c, f					
		
		// Entrada do custo
		escreva("Insira o custo de fábrica do automóvel : \n")		
		leia(c)
		
		// Cálculo do imposto
		i=i*c								
		
		// Cálculo do lucro
		l=l*c								
		
		// Cálculo do valor final = custo + imposto + lucro
		f=c+i+l								
		
		// Exibe resultados
		escreva("O valor final será de ", f, ", e serão abatidos ", i, " de imposto, e ", l, " de lucro.")	
	}
}
