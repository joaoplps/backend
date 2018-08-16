/*
 * PROBLEMA:
 * 	Testar uma sequencia de números inteiros. Para cada número exibir uma mensagem
 *	se o número é par ou ímpar. O programa será executado até que a resposta Sim
 *	seja negativa. No fim, apresentará a quantidade de números pares e ímpares
 *	a média dos números, o maior e o menor número lido, e o % de números positivos
 *	e negativos. Nota: para saber o resto de uma divisão utiliza-se o operador "%"
 *	(ex: N % 2 = 0 é par).
 */
programa
{
	funcao inicio()
	{
		inteiro n, qtp=0, qti=0, tt=0, pos=0, neg=0, soman=0, maior=-99999999, menor=99999999	//Conjunto de variáveis;
		caracter s='s'
		faca{		//Estrutura de controle para repetir conforme resposta sim;
			escreva("Insira um número inteiro: ")
			leia(n)
			tt++					//Incremento no total de números lidos;
			soman+=n				//Somatório (acumulador) dos números lidos;
			se(n%2==0){	//Testes de seleção e incremento de quantidade para Par e Ímpar;
				escreva("O número ",n," é par.")
				qtp++
			}						
			senao{
				escreva("O número ",n," é ímpar.")
				qti++
			}
			se(n>0){	//Testes de seleção e incremento de quantidade para Positivo e Negativo;
				pos++
			}					
			senao se(n<0){
				neg++
			}
			se(n<menor){	//Testes de seleção e armazenamento do dado para Maior e Menor número;
				menor=n
			}					
			se(n>maior){
				maior=n
			}
			escreva("\nDeseja continuar (S/N)? ")
			leia(s)
		} enquanto(s=='s' ou s=='S')
		escreva("A quantidade de números pares é ",qtp,".\n")	//Saídas de dados.
		escreva("A quantidade de números ímpares é ",qti,".\n")
		escreva("O percentual de número positivos é de ",(pos*100)/tt,"%.\n")
		escreva("O percentual de número positivos é de ",(neg*100)/tt,"%.\n")
		escreva("A média dos números é ",soman/tt,".\n")
		escreva("O maior número é ",maior,".\n")
		escreva("O menor número é ",menor,".\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1607; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
