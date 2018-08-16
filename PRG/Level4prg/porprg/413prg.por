/*
 * PROBLEMA:
 * 	Construa um algoritmo para pagamento de comissão de vendas. A quantidade de vendedores
 * 	deve ser lida no início do algoritmo. Os dados de cada vendedor são os seguintes: nome
 * 	do vendedor e o valor vendido. A comissão para todos é de 5% sobre o valor vendido.
 * 	Para cada vendedor, deve ser apresentado o valor da comissão. Ao final, mostrar os seguintes
 * 	resultados:
 * 	- A quantidade de vendedores onde o valor de vendas foi menor ou igual R$500; (contador);
 * 	- O percentual de vendedores com comissão acima de R$1000; (contador);
 * 	- O valor total vendido; (acumulador);
 * 	- O valor total pago às comissões; (acumulador);
 * 	- O valor médio vendido;
 */
programa
{
	inclua biblioteca Matematica --> mat		//Biblioteca que foi utilizada para formatar a quantidade de casas decimais;
	funcao inicio()
	{	inteiro N, cont=1, cont_menos500=0, cont_mais1000=0			//Conjunto de variáveis;
		cadeia nome
		real valor, comissao, perc_mais1000, valor_total=0

		escreva("Quantidade de vendedores: ")					//Entrada de dados;
		leia(N)
		enquanto(cont <= N)		//Estrutura de controle para repetir as instruções para a quantidade de vendedores definida;
		{
			escreva("\nNome do ",cont,"º vendedor: ")
			leia(nome)
			escreva("Valor vendido             : R$")
			leia(valor)
			comissao = valor * 0.05						//Cálculo da comissão;
			comissao = mat.arredondar(comissao, 2)				//Arredondar valor para duas casas decimais;
			escreva("Valor da comissão         : R$", comissao,"\n")	//Saída de dados;
			se(valor <= 500)cont_menos500++					//Seleção e contador de quantidade para comissões menores que $500 e maiores que $1000;
			se(comissao > 1000)cont_mais1000++
			valor_total = valor_total + valor				//Somatório do valor total;
			cont++
		}
		escreva("\nQtidade que venderam R$500 ou menos: ", cont_menos500,"\n")	//Saída de dados;
		perc_mais1000 = cont_mais1000 * 100.0 / N				//Cálculo da porcentagem;
		escreva("Percentual com comissão > 1000     : ", mat.arredondar(perc_mais1000, 1)," %\n")	//Saída de dados,
		escreva("Valor total vendido                : R$", mat.arredondar(valor_total, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2042; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
