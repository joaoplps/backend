/*
 * PROBLEMA:
 * 	Calcular o valor da mensalidade a pagar.
 * 	Séries 1 a 4:	$200.00
 * 	Séries 5 a 8:	$280.00
 * 	Descontos:	5 % por irmão matriculado
 * 	Multa:		$15 + mora de 1 % ao dia
 */
programa
{
	funcao inicio()
	{
		cadeia n
		real v=0.0, df
		inteiro s, i, d						//Conjunto de variáveis;
		caracter r
		faca{							//Estrutura de controle para repetir as instruções enquanto
			escreva("Insira o nome do aluno: ")		//a resposta sobre continuar seja diferente de "n";
			leia(n)
			escreva("Digite a série: ")			//Entrada de dados;
			leia(s)
			escreva("Quantos irmãos(ãs): ")
			leia(i)
			escreva("Número de dias em atraso: ")
			leia(d)
			se(s<1 ou s>8){
				escreva("Série não existe.")		//Seleção 1: Exclusão de inexistências;
			}
			senao se(s<5){					//Seleção 1.1: Estando a série "s" entre 1 e 4, define valor da mensalidade;
				v=200.0
			}
			senao{						//Exclusão da Seleção 1: Estando a série "s" entre 4 e 8, define valor da mensalidade;
				v=280.0
			}
			se(d<=0){					//Seleção 2: Garantindo que os dias em atraso "d" não sejam negativos, realiza os cálculos;
				df=(0.05*i)*v				//Cálculo para valor dos descontos: 5 % do valor total por irmão "i";
				v=v-df					//Valor final = valor total menos descontos;
			}
			senao{						//Exclusão da Seleção 2: Com os dias de atraso positivos, calcula a multa;
				df=15+(0.01*d)*v			//Cálculo 
				v=v+df
			}
			escreva("Nome: ",n,"\nValor a ser pago: ",v)	//Saída de dados: Resultado;
			escreva("\nDeseja calcular novamente (s/n)? ")	//Entrada de dados: Define a resposta "r", repetindo ou
			leia(r)						//finalizando o programa após o teste <enquanto(r!='n')>;
			limpa()			//Limpa a tela.
		} enquanto(r!='n')
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
