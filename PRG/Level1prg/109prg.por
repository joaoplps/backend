/*
 * PROBLEMA:
 * 	Calcular e informar multa conforme situação do motorista:
 * 	Condição 1: $50	-	até 10 km/h acima do permitido;
 * 	Condição 2: $100	-	de 10 a 30 km/h acima do permitido;
 * 	Condição 3: $200	-	além de 30 km/h acima do permitido;
 */
 programa
{
	funcao inicio()
	{
		real vm, vv					//Conjunto de variáveis;
		escreva("Insira a velocidade máxima da via: ")
		leia(vm)
		escreva("Digite a velocidade do condutor: ")	//Entrada dos dados (velocidade permitida e do condutor);
		leia(vv)
		se(vv<=vm+10){					//Testando a condição 1;
			escreva("A sua multa é de R$50,00.")	//Estrutura de controle (seleção) com multas definidas.
		}
		senao{						//Testando a condição 2, sabendo que a velocidade está além dos 10 km/h acima do permitido;
			se(vv<=vm+30){
				escreva("A sua multa é de R$100,00.")
			}
			senao{					//A única opção que sobra é estar além dos 30 km/h acima do permitido.
				escreva("A sua multa é de R$200,00.")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 898; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
