/*
 * 	Calcular e mostrar a média final e a situação do aluno dadas três notas.
 * 	Situação: 
 *		- Aprovado - 7 a 10; 
 *		- Recuperação - 5 a 7; 
 * 		- Reprovado - 0 a 5;
 */
programa
{
	funcao inicio()
	{
		// Conjunto de variáveis
		real n1, n2, n3, m				
		
		// Entrada de três notas com identificação a cada entrada
		escreva("Insira as três notas do aluno: \n")
		escreva("Nota 1: ")
		leia(n1)
		escreva("Nota 2: ")				
		leia(n2)
		escreva("Nota 3: ")
		leia(n3)
		
		m=(n1+n2+n3)/3
		
		// Estrutura para testar cada condição com sua exibição de resultado específica
		se(m>=7){					
			escreva("A média final é ", m, ", e o aluno está Aprovado!")
		}
		senao{
			// Se não, se a média for menor que 5 a condição é reprovado
			se(m<5){				
				escreva("A média final é ", m, ", e o aluno está Reprovado!")
			}
			// Se não, a média estará entre 7 e 5, e a condição será em recuperação
			senao{					
				escreva("A média final é ", m, ", e o aluno está em Recuperação!")
			}
		}
	}
}