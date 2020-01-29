/*
 * 	Calcular e mostrar os dez primeiros termos da tabuada de um número lido.
*/
programa {
	funcao inicio() {
		// Variáveis n=número, r=resultado e t=tabuada
		real n, r					
		
		escreva("Digite um número: ")
		leia(n)
		
		// Contagem inteira de um a dez
		para(inteiro t=1; t<=10; t++) {
			// Fórmula de cálculo do resultado da posição t da tabuada
			r=n*t					
			
			// Saída de dados tabulados
			escreva(n, " x ", t, " = ", r, "\n")	
		}
	}
}