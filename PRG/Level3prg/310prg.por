/*
 * PROBLEMA:
 * 	Calcular peso ideal utilizando as seguintes fórmulas:
 * 	Homem: (72.7 * altura) - 58
 * 	Mulher: (62.1 * altura) - 44.7
*/
programa
{
	funcao inicio()
	{
		real h, p					//Conjunto de variáveis;
		caracter r='s', s
		enquanto(r=='s' ou r=='S'){			//Estrutura para manter o programa funcionando enquanto a resposta for sim;
			escreva("Digite o sexo (M/F): ")
			leia(s)					//Entrada de dados;
			escreva("Digite a altura: ")
			leia(h)
			se(s=='m' ou s=='M'){			//Teste para separar os cálculos entre Homem e Mulher;
				p=h*72.7-58			//Cálculo do peso ideal para Homem;
			}
			senao{
				p=h*62.1-44.7			//Cálculo do peso ideal para mulher;
			}
			escreva("O seu peso ideal é: ", p, " Kg.\n")	//Saída de resultado;
			escreva("Deseja continuar? (S/N) ")		//Redefinição da variável de resposta r, finalizando o programa ou não.
			leia(r)
			limpa() 				//Limpa a tela antes de finalizar ou de começar novamente.
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 937; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
