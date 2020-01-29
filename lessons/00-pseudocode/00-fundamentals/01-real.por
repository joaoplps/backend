/*
 * 	Calcular a área da base e volume de um cilindro (dados: Raio e Altura).
 */
programa
{
	funcao inicio()
	{
		// Conjunto de variáveis necessárias
		real r, h, ab, v		
		
		// Entrada de dados: Raio (r) e Altura (h)
		escreva("Digite o raio de um cilindro: \n")
		leia(r)
		escreva("Digite a altura de um cilindro: \n")				
		leia(h)
		
		// Calcular área da base e volume
		ab=3.14*(r*r)
		v=ab*h			
		
		// Exibe a saída
		escreva("A área da base é ", ab, ", e o volume é de ", v, ".\n")	
	}
}

