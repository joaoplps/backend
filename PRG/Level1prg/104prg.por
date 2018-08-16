/*
 * PROBLEMA:
 * 	Calcular e mostrar a quantidade de dinheiro gasta por um fumante.
 */
programa
{
	funcao inicio()
	{
		real a, n, p, v, f						//Conjunto de variáveis: a=anos, n=números de cigarro por dia, etc...;
		escreva("Digite o número de anos que você fuma: \n")
		leia(a)
		escreva("Digite o número de cigarros fumados por dia: \n")	//Entrada de dados;
		leia(n)
		escreva("Digite valor de uma carteira, considerando uma carteira de 20 cigarros: \n")
		leia(p)
		v=(a*365)*n							//Quantidade total cigarros fumados;
		f=v/20*p							//Valor total gasto com cigarros;
		escreva("O valor total fumado é ", f, " moedas.")		//Saída de dados.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
