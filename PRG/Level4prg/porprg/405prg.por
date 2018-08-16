/*
 * PROBLEMA:
 * 	Orçamento para dedetizar pragas conforme a área:
 * 	1-Ervas Daninhas	- $50.00 por acre
 * 	2-Gafanhotos		- $90.00 por acre
 * 	3-Broca			- $120.00 por acre
 * 	4-Todos			- $170.00 por acre
 */
programa
{
	funcao inicio()
	{
		cadeia nome
		real ac, cf=0.0					//Conjunto de variáveis;
		inteiro t
		faca{						//Estrutura de controle repete instruções enquanto o nome for diferente de "XXX";
			escreva("Nome: ")
			leia(nome)				//Entrada de dados;
			escreva("Qual o tipo de praga? (1-Ervas Daninhas, 2-Gafanhotos, 3-Broca, 4-Todos)\nDigite o número correspondente: ")
			leia(t)		//Escolha da opção usada na estrutura de Seleção;
			escreva("Insira a área (em acres): ")
			leia(ac)
			se(t<1 ou t>=5){			//Seleção 1: Opções 0 ou menor, assim como 5 ou maior, inexistem;
				escreva("Opção inexistente.\n")
			}
			senao se(t<2){				//Seleção 1.1: Número 1 do menu;
				cf=50*ac
			}
			senao se(t<3){				//Seleção 1.2: Número 2 do menu;
				cf=90*ac
			}
			senao se(t<4){				//Seleção 1.3: Número 3 do menu;
				cf=120*ac
			}
			senao se(t<5){				//Seleção 1.4: Número 4 do menu;
				cf=170*ac
			}
			escreva("Nome: ",nome,"\nOrçamento: R$",cf," (opção ",t,").\n")
		} enquanto(nome!="XXX")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 198; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
