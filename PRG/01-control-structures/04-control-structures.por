/*
 * 	Ler quinze números e informar se cada um é maior, menor ou igual a zero.
*/
programa {
	funcao inicio() {
		// Estabelece o valor inicial de uma contagem (c=contador) em integros a partir de um 
		inteiro c=1			
		// Declara a variável do número que será digitado e comparado com zero 
		real n				
		
		// Programa o contador para até o valor quinze (com isso temos de 1 a 15 repetições antes de continuar)
		enquanto(c<=15) {
			// Funções da repeticão de um a quinze
			escreva("Digite um número: \n")	
			leia(n)
					
			// Exibe resultados comparativos conforme condições
			se(n>=0) {
				se(n>0) {
					escreva("O número é maior que zero.\n")
				}
				senao {
					escreva("O número é igual a zero.\n")	
				}
			}
			senao {
				escreva("O número é menor que zero.\n")
			}
			
			// Acrescenta um no valor do contador (incremento) para refazer as instruções com um novo valor de c
			c=c+1			
		}

		// Saída de dados finalizando o programa
		escreva("Já chega por hoje!\n")	
	}
}