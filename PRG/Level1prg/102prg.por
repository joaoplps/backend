/*
 * PROBLEMA:
 * 	Calcular a área da base e volume de um cilindro (dados: Raio e Altura).
 */
programa
{
	funcao inicio()
	{
		real r, h, ab, v							//Conjunto de variáveis necessárias;
		escreva("Digite o raio de um cilindro: \n")
		leia(r)
		escreva("Digite a altura de um cilindro: \n")				//Entrada de dados: Raio (r) e Altura (h);
		leia(h)
		ab=3.14*(r*r)		//Calcular área da base;
		v=ab*h			//Calcular o volume;
		escreva("A área da base é ", ab, ", e o volume é de ", v, ".\n")	//Exibe a saída.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
