/*
 * PROBLEMA:
 * 	Identificar o menor número entre dois número inseridos, e contar até o maior.
 */
programa
{
	funcao inicio()
	{
		inteiro a, b, aux
		escreva("Insira dois números inteiros: \n")
		leia(a)
		leia(b)
		se(b<a){			//Seleção 1: Identifica se "b" é menor do que "a" em caso de ter que trocar o nome da variável (com a
			aux=a			//ajuda de uma variável auxiliar "aux") para estabelecer a condição de escrita: <enquanto(a<=b)>;
			a=b
			b=aux
		}
		enquanto(a<=b){
			escreva(a," ")		//Escrevendo o resultado do menor "a" até o maior "b";
			a++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
