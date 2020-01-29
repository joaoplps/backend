/*
 * 	Pagamento de comissão de vendas, considerando comissão de 5 %.
*/
programa {
	funcao inicio() {
		// Conjunto de variáveis
		real v, t, vc, c			
		
		// Entrada de dados
		cadeia nome
		escreva("Insira o nome da pessoa, o valor vendido e o tempo de serviço (em anos): \n")
		escreva("Nome: ")
		leia(nome)
		escreva("Valor: ")			
		leia(v)
		escreva("Tempo: ")
		leia(t)
		
		// Exclusão de valores negativos
		se(v>=0) {				
			// Se o valor vendido estiver entre 0 e 2000
			se(v<=2000) {			
				// Cálculo da comissão
				vc=v*0.05		
				
				// Atribuição do valor de cálculo da comissão para mostrar na saída de dados
				c=5			
			}
			senao {
				// Se o valor vendido estiver entre 2001 e 5000
				se(v<=5000) {		
					// Cálculos
					vc=v*0.1	
					c=10
				}
				// Se o valor vendido estiver acima de 5001
				senao {			
					// Cálculos
					vc=v*0.2	
					c=20
				}
			}
			
			// Saída de dados
			escreva(nome, " vendeu ", v, " reais, comissionados em ", c, "%. O valor de comissão é de ", vc, " reais.\n")		
			
			// Teste individual, fora da estrutura que define valores, pois define o bônus
			se(v>3000 e t>=5) {		
				// Saída de dados
				escreva(nome, " também ganhou um bônus de R$500,00 por tempo de serviço e cumprimento da meta.")		
			}
		}
		senao {
			// Mensagem caso o valor digitado seja negativo
			escreva("O valor não pode ser negativo.")	
		}
	}
}