/*
 * PROBLEMA:
 * 	Ler dois números e mostrar sua soma, produto e quociente.
 */
programa
{
	funcao inicio()
	{
		real a, b, s, p, q				//Conjunto de variáveis necessárias (números a e b, s=soma, p=produto e q=quociente);
		escreva("Digite um número: \n")
		leia(a)
		escreva("Digite outro número: \n")		//Entrada dos números e cálculo das variáveis respectivas;
		leia(b)
		s=a+b
		p=a*b
		q=a/b
		escreva("A soma dos números é ", s, ", o produto é ", p, " e o quociente é ", q, ".")	//Exibição de resultados.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
