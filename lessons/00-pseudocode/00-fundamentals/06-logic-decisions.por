/*
 * 	Dizer qual número é maior entre dois valores fornecidos, especificando se forem iguais.
 */
programa
{
	funcao inicio()
	{
		// Conjunto de variáveis
		real a, b					
		
		escreva("Insira dois números A e B: \n")	// Entrada de dados
		leia(a, b)
		
		// Decisão 1: Se o primeiro número é maior que o segundo
		se(a>b){					
				// Saída de dados
				escreva("A é maior que B!")	
		}
		// Se não, entra na decisão 2
		senao{						
			// Decisão 2: Se o primeiro número for menor que o segundo
			se(a<b){				
				// Saída de dados
				escreva("B é maior que A!")	
			}
			// Se não, escreva a igualdade
			senao{					
				// Saída de dados
				escreva("A = B!")		
			}
		}
	}
}
