/*
 * PROBLEMA:
 * 	Ler a cotação do Dólar e converter a moeda para real. Repetir a operação enquanto o valor for diferente de zero.
*/
programa
{
	funcao inicio()
	{
		real cot, us, br				//Declara variáveis reais para número com casas decimais;
		faca						//Estrutura de repetição, faça isso enquanto o resultado for diferente de zero;
		{
			escreva("Digite a cotação do dólar (em reais): \n")
			leia(cot)				//Entrada de dados;
			escreva("Digite a quantidade de dólares: \n")
			leia(us)
			br=us*cot				//Cálculo da cotação;
			escreva("A conversão deu: R$", br, ".\n")	//Saída de dados;
		}
		enquanto(br!=0)					//Teste lógico para saber se o valor (br) é diferente de zero.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
