/*
 * 	Ler a cotação do Dólar e converter a moeda para real. Repetir a operação enquanto o valor for diferente de zero.
*/
programa {
	funcao inicio() {
		// Declara variáveis reais para número com casas decimais
		real cot, us, br				
		
		// Estrutura de repetição, faça isso enquanto o resultado for diferente de zero
		faca {
			escreva("Digite a cotação do dólar (em reais): \n")
			
			// Entrada de dados
			leia(cot)				
			escreva("Digite a quantidade de dólares: \n")
			leia(us)
			
			// Cálculo da cotação
			br=us*cot				
			
			// Saída de dados
			escreva("A conversão deu: R$", br, ".\n")	
		}
		
		// Teste lógico para saber se o valor (br) é diferente de zero
		enquanto(br!=0)					
	}
}