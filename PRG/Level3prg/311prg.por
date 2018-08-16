/*
 * PROBLEMA:
 * 	Calcular imposto de renda de um contribuinte segundo:
 * 	
*/
programa
{
	funcao inicio()
	{
		real a, db, dbd
		inteiro d, r					//Conjunto de variáveis;
		caracter s='s'
		cadeia cpf
		enquanto(s=='s' ou s=='S'){			//Looping conforme resposta;
			escreva("Insira os seguintes dados:\n")
			escreva ("CPF: ")
			leia(cpf)				//Entrada de dados;
			escreva("Número de dependentes: ")
			leia(d)
			escreva("Renda Anual: ")
			leia(r)
			se(r>0){				//Seleção 1: Renda Anual não pode ser negativa;
				se(r<=26000){			//Seleção 2: Renda Anual entre 0 e 26000;
					a=0			//Definição de alíquota e saída;
					escreva("Você está isento. ")
				}
				senao{
					se(r<=35000){		//Seleção 3: R.A. entre 26001 e 35000;
						a=7.5		//Definição de alíquota;
					}
					senao{
						se(r<=54000){	//Seleção 4: R.A. entre 35001 e 54000;
							a=15	//Definição de alíquota;
						}
						senao{
							se(r<=92000){		//Seleção 5: R.A. entre 54001 e 92000;
								a=22.5		//Definição de alíquota;
							}
							senao{			//Seleção 6: R.A. acima de 92001;
								a=27.5		//Definição de alíquota;
							}
						}
					}
				}
				db=r*a/100			//Cálculo do débito;
				se(d>0){			//Teste de seleção para desconto conforme número de dependentes d;
				d=300*d				//Cáculo do desconto de acordo com a quantidade de dependentes;
				db=db-d				//Cáculo do novo débito para quem tem dependentes e saída;
				escreva("O desconto atribuído conforme o número de dependentes foi de R$", d," reais.\n")
				}
				escreva("CPF ", cpf, " - DÉBITO R$", db, ".\n")		//Saída de dados;
			}
			senao{
				escreva("A renda não pode ser negativa.")
			}
			escreva("Deseja continuar? (S/N) ")	//Estrada de dados, redefinindo a resposta para continuar ou não.
			leia(s)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1764; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
