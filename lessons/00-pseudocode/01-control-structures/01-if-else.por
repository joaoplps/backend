/*
 * 	Avaliar se três valores dados pelo usuário formam um triângulo, e se sim, qual o tipo.
*/
programa {
	funcao inicio() {
		// Conjunto de variáveis
		real a, b, c						
		
		// Entrada de dados
		escreva("Digite os três lados de um triângulo: \n")	
		leia(a, b, c)
		
		// Se qualquer lado for maior que a soma dos outros dois, as medidas não formam um triangulo
		se(a<b+c e b<c+a e c<a+b) {
			// Se todos os lados forem iguais
			se(a==b e a==c)	{
				escreva("O triangulo é Equilátero!")	
			}
			senao {
				// Se não, se pelo menos dois lados forem iguais
				se(a==b ou a==c ou b==c) {
					escreva("O triangulo é Isósceles!")
				}
				// Se todos os lados forem diferentes
				senao {
					escreva("O triangulo é Escaleno!")
				}
			}
		}
		// Se qualquer um dos lados for maior ou igual a soma dos outros dois lados, não formam um triângulo
		senao	{
			escreva("Não é um triangulo.\n")
		}
	}
}
