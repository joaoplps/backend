/*
 * PROBLEMA:
 * 	Calcular a maior e a menor média de uma turma, junto com os dados dos respectivos alunos.
 */
programa
{
	funcao inicio()
	{
		inteiro n, c=0
		cadeia nome, nomemaior="", nomemenor=""		//Conjunto de variáveis;
		real n1, n2, m, mm=-0.1, mnm=10.1
		escreva("Qtd. de alunos: ")			//Entrada da quantidade de alunos;
		leia(n)
		enquanto(c<n){					//Estrutura de controle para repetir instruções para todos os alunos;
			escreva("Nome: ")
			leia(nome)
			escreva("Nota 1: ")			//Entrada de dados individuais;
			leia(n1)
			escreva("Nota 2: ")
			leia(n2)
			m=(n1+n2)/2				//Cálculo da média;
			escreva("Média: ",m,"\n")
			se(m>mm){
				mm=m
				nomemaior=nome
			}					//Seleção para teste de maior e menor média, guardando dados;
			se(m<mnm){
				mnm=m
				nomemenor=nome
			}
			c++					//Incremento;
		}
		escreva("A maior média é ",mm," obtida por ",nomemaior,", e a menor média foi de ",nomemenor," com a nota ",mnm,".")	//Saída de dados.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
