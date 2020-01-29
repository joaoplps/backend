/*
 * 	Ler um número e exibir seu sucessor.
 */
programa
{
	funcao inicio()
	{
		// Declaração de variável
		inteiro n						
		
		// Pede o número ao usuário
		escreva("Digite um número: \n")				
		
		// Realiza a entrada de dado
		leia(n)							
		
		// Cálculo do sucessor
		n=n+1							
		
		// Exibe a saída
		escreva("O sucessor do número digitado é ", n, ".")	
	}
}