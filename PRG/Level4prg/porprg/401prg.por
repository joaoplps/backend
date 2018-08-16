/*
 * PROBLEMA:
 * 	Imprimir três números lidos em ordem crescente.
 */
programa
{
	funcao inicio()
	{
		inteiro a, b, c				//Declaração de variáveis;
		escreva("Insira três números: \n")	//Entrada de dados;
		leia(a,b,c)
		se(a<=b e a<=c){			//Seleção 1: Se "a" menor ou igual a "b", E "a" menor ou igual a "c" define "a" como primeiro;
			escreva(a," ")
			se(b<=c){			//Seleção 1.1: "a" definido como primeiro, hora de definir o segundo, e consequentemente o terceiro;
				escreva(b," ",c)	//Se "b" for maior ou igual a "c", escreva A depois B depois C;
			}
			senao{
				escreva(c," ",b)	//Se não, "c" é maior a "b", então escreva A depois C depois B;
			}
		}
		senao se(b<=c e b<=a){			//Seleção 2: "b" em foco, definindo "a" e "c", mesma estratégia da Seleção 1;
			escreva(b," ")
			se(a<=c){
				escreva(a," ",c)
			}
			senao{
				escreva(c," ",a)
			}
		}
		senao{					//Seleção 3: "c" em foco, mesma estratégia, porém sem teste lógico.
			escreva(c," ")
			se(a<=b){
				escreva(a," ",b)
			}
			senao{
				escreva(b," ",a)
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
