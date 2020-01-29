/*
 * 	Mostrar os número de 1 a 30, substituindo os múltiplos de quatro pela palavra "pim".
*/
programa {
	funcao inicio() {
		// Definir variável n=números, c=contador e x=múltiplo
		inteiro n, c=1, x			
		
		escreva("Defina o múltiplo comum: ")
		leia(x)
		
		// Contagem inteira de um a 30 (o zero vale uma posição)
		para(c=0; c<=29; c++) {
			// Fórmula da contagem definindo n a partir de c (aproveitar o contador)
			n=c+1				
			
			// Se n for divisível pelo múltiplo, escreva "pim", se não escreva n
			se (n % x == 0) {
				escreva("pim")	
			}
			senao {
				escreva(n)
			}
		
		// A cada número ou palavra escrita, dá-se um espaço
		escreva(" ")				
		}
	}
}
