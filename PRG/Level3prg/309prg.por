/*
 * PROBLEMA:
 * 	Definir peso e número de identificação dos bois mais gordo e mais magro,
 * 	além da quantidade total que entrou no frigorífico.
*/
programa
{
	funcao inicio()
	{
		inteiro nb, c=1
		real p, menorp=5000.0, maiorp=0.0, somap=0		//Conjunto de variáveis;
		cadeia id, menorid="", maiorid=""
		escreva("Qtd. de bois: ")				//Entrada de dados, definindo número de bovinos;
		leia(nb)
		enquanto(c<=nb){					//Condição: enquanto o contador c for menor ou igual ao número de bois;
			escreva("Identificação do ",c,"º boi: ")
			leia(id)					//Entrada de dados de cada animal;
			escreva("Peso em Kg: ")
			leia(p)
			se(p<menorp){					//Teste para avaliar se o presente animal é o de menor peso;
				menorp=p				//Se sim, guarda o peso p e o número id;
				menorid=id
			}
			se(p>maiorp){					//Teste para avaliar se o presente animal é o de maior peso;
				maiorp=p				//Se sim, guarda as informações;
				maiorid=id
			}
			somap+=p					//Somatório dos pesos na fórmula somap = somap + p;
			c++						//Incremento do contador;
			limpa()						//"Limpa" a tela para nova entrada;
		}
		escreva("O boi ",menorid," é o mais magro, com ",menorp,"Kg.\n")	//Saída de dados.
		escreva("O boi ",maiorid," é o mais gordo, com ",maiorp,"Kg.\n")
		escreva("O peso médio de todos os bois é ",somap/nb,".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1174; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
