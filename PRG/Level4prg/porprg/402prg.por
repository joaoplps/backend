/*
 * PROBLEMA:
 * 	Imprimir de três números inteiros quaisquer: o maior, o menor e o do meio.
 */
programa
{
	funcao inicio()
	{
		inteiro a, b, c, mai, men, mei				//Conjunto de variáveis;
		escreva("Insira três números inteiros: \n")		//Entrada de dados;
		leia(a,b,c)
		se(a<=b e a<=c){					//Seleção 1: Se "a" é o menor de todos;
			men=a
			se(b<=c){					//Seleção 1.1: Sendo "a" o menor, se "b" for menor que "c" define "b" antes de c
				mei=b					//pois não faz diferença se forem iguais;
				mai=c
			}
			senao{						//Exclusão da Seleção 1.1: Define "c" como menor que "b", sendo o do meio;
				mei=c
				mai=b
			}
		}
		senao se(b<=c e b<=a){					//Seleção 2: Se "a" não for o menor, será o "b"?
			men=b
			se(a<=c){					//Seleção 2.1: Se "b" for o menor, a estratégia repete-se para "a" e "c";
				mei=a
				mai=c
			}
			senao{
				mei=c
				mai=a
			}
		}
		senao{							//Exclusão da Seleção 1: Se nem "a" nem "b" forem os menores, por eliminação "c" é;
			men=c
			se(a<=b){					//Atribuições estratégicas;
				mei=a
				mai=b
			}
			senao{
				mei=b
				mai=a
			}
		}
		escreva("Maior: ",mai,"\nMenor: ",men,"\nIntermediário: ",mei)		//Saída de dados.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1008; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
