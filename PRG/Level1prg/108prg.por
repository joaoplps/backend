/*
 * PROBLEMA:
 * 	Calcular e mostrar a média final e a situação do aluno dadas três notas.
 * 	Situação: Aprovado - 7 a 10; Recuperação - 5 a 7; Reprovado - 0 a 5;
 */
programa
{
	funcao inicio()
	{
		real n1, n2, n3, m				//Conjunto de variáveis;
		escreva("Insira as três notas do aluno: \n")
		escreva("Nota 1: ")
		leia(n1)
		escreva("Nota 2: ")				//Entrada de três notas com identificação a cada entrada.
		leia(n2)
		escreva("Nota 3: ")
		leia(n3)
		m=(n1+n2+n3)/3
		se(m>=7){					//Estrutura para testar cada condição com sua exibição de resultado específica;
			escreva("A média final é ", m, ", e o aluno está Aprovado!")
		}
		senao{
			se(m<5){				//Se não, se a média for menor que 5 a condição é reprovado;
				escreva("A média final é ", m, ", e o aluno está Reprovado!")
			}
			senao{					//Se não, a média estará entre 7 e 5, e a condição será em recuperação;
				escreva("A média final é ", m, ", e o aluno está em Recuperação!")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 861; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
