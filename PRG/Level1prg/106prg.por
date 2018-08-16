/*
 * PROBLEMA:
 * 	Verificar entre três números se o primeiro é maior que a soma dos últimos valores.
 */
programa
{
	funcao inicio()
	{
		real a, b, c, s				//Conjunto de variáveis;
		escreva("Insira A, B, e C: \n")		//Entrada de valores;
		leia(a, b, c)
		limpa()
		se(a>b+c){				//Estrutura de decisão para verificar a condição imposta pelo enunciado.
			escreva("O primeiro número é maior que a soma dos outros dois!")	//Saída de dados;
		}
		senao{
			escreva("O primeiro número não é maior que a soma dos outros dois...")	//Saída de dados;
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 547; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
