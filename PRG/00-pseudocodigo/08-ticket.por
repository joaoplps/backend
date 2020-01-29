/*
 * 	Calcular e informar multa conforme situação do motorista:
 * 	Condição 1: $50	-	até 10 km/h acima do permitido;
 * 	Condição 2: $100	-	de 10 a 30 km/h acima do permitido;
 * 	Condição 3: $200	-	além de 30 km/h acima do permitido;
 */
 programa
{
	funcao inicio()
	{
		//Conjunto de variáveis;
		real vm, vv					
		
		//Entrada dos dados (velocidade permitida e do condutor);
		escreva("Insira a velocidade máxima da via: ")
		leia(vm)
		escreva("Digite a velocidade do condutor: ")	
		leia(vv)
		
		//Testando a condição 1;
		//Estrutura de controle (seleção) com multas definidas.
		se(vv<=vm+10){					
			escreva("A sua multa é de R$50,00.")	
		}
		senao{						
			//Testando a condição 2, sabendo que a velocidade está além dos 10 km/h acima do permitido;
			se(vv<=vm+30){
				escreva("A sua multa é de R$100,00.")
			}
			//A única opção que sobra é estar além dos 30 km/h acima do permitido.
			senao{					
				escreva("A sua multa é de R$200,00.")
			}
		}
	}
}