/*
 * PROBLEMA:
 * 	Obter de cinco número inseridos:
 * 	Soma;
 * 	Média Aritimética;
 * 	Maior e Menor Número;
 */
programa
{
	funcao inicio()
	{
		real n1, n2, n3, n4, n5, s, m, ma, me		//Conjunto de variáveis;
		escreva("Insira 5 números: \n")			//Entrada de dados. Estratégia:
		leia(n1)
		ma=n1						//A primeira entrada define o primeiro número como maior e menor número simultaneamente.
		me=n1
		leia(n2)
		se(n2<me){					//À medida que entram os números ocorrem os testes de maior e menor número, obtendo-se sempre em "ma" e "me"
			me=n2					//os valores maiores e menores respectivamente.
		}
		se(n2>ma){
			ma=n2
		}
		leia(n3)
		se(n3<me){
			me=n3
		}
		se(n3>ma){
			ma=n3
		}
		leia(n4)
		se(n4<me){
			me=n4
		}
		se(n4>ma){
			ma=n4
		}
		leia(n5)
		se(n5<me){
			me=n5
		}
		se(n5>ma){
			ma=n5
		}
		s=n1+n2+n3+n4+n5				//Cálculo da soma;
		m=s/5						//Cálculo da Média Aritimética;
		escreva("\nSoma dos números:",s,"\nMédia aritimética: ",m,"\nMaior número lido: ",ma,"\nMenor número lido: ",me)		//Saída de dados.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1023; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
