/*
 * 	Calcular imposto de renda de um contribuinte segundo:
 * 	
*/
programa {
	funcao inicio() {
		// Conjunto de variáveis
		real a, db, dbd
		inteiro d, r					
		caracter s='s'
		cadeia cpf
		
		// Looping conforme resposta
		enquanto(s=='s' ou s=='S'){			
			// Entrada de dados
			escreva("Insira os seguintes dados:\n")
			escreva ("CPF: ")
			leia(cpf)				
			escreva("Número de dependentes: ")
			leia(d)
			escreva("Renda Anual: ")
			leia(r)
				
			// Seleção 1: Renda Anual não pode ser negativa
			se(r>0){				
				// Seleção 2: Renda Anual entre 0 e 26000
				se(r<=26000){			
					// Definição de alíquota e saída
					a=0			
					escreva("Você está isento. ")
				}
				senao{
					// Seleção 3: R.A. entre 26001 e 35000
					se(r<=35000){		
						// Definição de alíquota
						a=7.5		
					}
					senao{
						// Seleção 4: R.A. entre 35001 e 54000
						se(r<=54000){	
							// Definição de alíquota
							a=15	
						}
						senao{
							// Seleção 5: R.A. entre 54001 e 92000
							se(r<=92000){		
								// Definição de alíquota
								a=22.5		
							}
							// Seleção 6: R.A. acima de 92001
							senao{			
								// Definição de alíquota
								a=27.5		
							}
						}
					}
				}
				
				// Cálculo do débito
				db=r*a/100			
				
				// Teste de seleção para desconto conforme número de dependentes d
				se(d>0){			
				
				// Cáculo do desconto de acordo com a quantidade de dependentes
				d=300*d				
				
				// Cáculo do novo débito para quem tem dependentes e saída
				db=db-d				
				
				escreva("O desconto atribuído conforme o número de dependentes foi de R$", d," reais.\n")
				}
				
				// Saída de dados
				escreva("CPF ", cpf, " - DÉBITO R$", db, ".\n")		
			}
			senao{
				escreva("A renda não pode ser negativa.")
			}
			
			// Estrada de dados, redefinindo a resposta para continuar ou não
			escreva("Deseja continuar? (S/N) ")	
			leia(s)
		}
	}
}