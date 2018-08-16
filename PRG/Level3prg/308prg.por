/*
 * PROBLEMA:
 * 	Pagamento de comissão de vendas, considerando comissão de 5 %.
*/
programa
{
	funcao inicio()
	{
		real v, t, vc, c			//Conjunto de variáveis;
		cadeia nome
		escreva("Insira o nome da pessoa, o valor vendido e o tempo de serviço (em anos): \n")
		escreva("Nome: ")
		leia(nome)
		escreva("Valor: ")			//Entrada de dados;
		leia(v)
		escreva("Tempo: ")
		leia(t)
		se(v>=0){				//Exclusão de valores negativos;
			se(v<=2000){			//Se o valor vendido estiver entre 0 e 2000;
				vc=v*0.05		//Cálculo da comissão;
				c=5			//Atribuição do valor de cálculo da comissão para mostrar na saída de dados;
			}
			senao{
				se(v<=5000){		//Se o valor vendido estiver entre 2001 e 5000;
					vc=v*0.1	//Cálculos;
					c=10
				}
				senao{			//Se o valor vendido estiver acima de 5001;
					vc=v*0.2	//Cálculos;
					c=20
				}
			}
			escreva(nome, " vendeu ", v, " reais, comissionados em ", c, "%. O valor de comissão é de ", vc, " reais.\n")		//Saída de dados;
			se(v>3000 e t>=5){		//Teste individual, fora da estrutura que define valores, pois define o bônus;
				escreva(nome, " também ganhou um bônus de R$500,00 por tempo de serviço e cumprimento da meta.")		//Saída de dados;
			}
		}
		senao{
			escreva("O valor não pode ser negativo.")	//Mensagem caso o valor digitado seja negativo.
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 85; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
