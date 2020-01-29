/*
 * 	Ler dois números e mostrar sua soma, produto e quociente.
 */
programa
{
	funcao inicio()
	{
		// Conjunto de variáveis necessárias (números a e b, s=soma, p=produto e q=quociente)
		real a, b, s, p, q				
		
		// Entrada dos números e cálculo das variáveis respectivas
		escreva("Digite um número: \n")
		leia(a)
		escreva("Digite outro número: \n")		
		leia(b)
		
		s=a+b
		p=a*b
		q=a/b
		
		// Exibição de resultados
		escreva("A soma dos números é ", s, ", o produto é ", p, " e o quociente é ", q, ".")	
	}
}