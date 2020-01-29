/*
 * 	Calcular e mostrar a quantidade de dinheiro gasta por um fumante.
 */
programa
{
	funcao inicio()
	{
		// Conjunto de variáveis: a=anos, n=números de cigarro por dia, etc...
		real a, n, p, v, f						
		
		// Entrada de dados
		escreva("Digite o número de anos que você fuma: \n")
		leia(a)
		escreva("Digite o número de cigarros fumados por dia: \n")	
		leia(n)
		escreva("Digite valor de uma carteira, considerando uma carteira de 20 cigarros: \n")
		leia(p)
		
		// Quantidade total cigarros fumados
		v=(a*365)*n							
		
		// Valor total gasto com cigarros
		f=v/20*p							
		
		// Saída de dados
		escreva("O valor total fumado é ", f, " moedas.")		
	}
}