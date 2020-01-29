/*
 * 	Verificar entre três números se o primeiro é maior que a soma dos últimos valores.
 */
programa
{
	funcao inicio()
	{
		// Conjunto de variáveis
		real a, b, c, s				
		
		// Entrada de valores
		escreva("Insira A, B, e C: \n")		
		leia(a, b, c)
		
		limpa()
		
		// Estrutura de decisão para verificar a condição imposta pelo enunciado
		se(a>b+c) {				
			// Saída de dados
			escreva("O primeiro número é maior que a soma dos outros dois!")	
		}
		senao {
			// Saída de dados
			escreva("O primeiro número não é maior que a soma dos outros dois...")	
		}
	}
}
