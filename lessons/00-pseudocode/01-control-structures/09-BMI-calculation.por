/*
 * 	Calcular peso ideal utilizando as seguintes fórmulas:
 * 	Homem: (72.7 * altura) - 58
 * 	Mulher: (62.1 * altura) - 44.7
*/
programa {
	funcao inicio() {
		// Conjunto de variáveis
		real h, p					
		
		caracter r='s', s
		
		// Estrutura para manter o programa funcionando enquanto a resposta for sim
		enquanto(r=='s' ou r=='S') {			
			// Entrada de dados
			escreva("Digite o sexo (M/F): ")
			leia(s)					
			escreva("Digite a altura: ")
			leia(h)
			
			// Teste para separar os cálculos entre Homem e Mulher
			se(s=='m' ou s=='M') {			
				// Cálculo do peso ideal para Homem
				p=h*72.7-58			
			}
			senao{
				// Cálculo do peso ideal para mulher
				p=h*62.1-44.7			
			}
			
			// Saída de resultado
			escreva("O seu peso ideal é: ", p, " Kg.\n")	
			
			// Redefinição da variável de resposta r, finalizando o programa ou não
			escreva("Deseja continuar? (S/N) ")		
			leia(r)
			
			// Limpa a tela antes de finalizar ou de começar novamente
			limpa() 				
		}
	}
}