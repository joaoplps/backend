/*
 * PROBLEMA:
 * 	Classificar jogadores segundo altura e categorias:
 * 	< 1.75			- Insuficiente
 * 	>= 1.75 e < 1.85	- Regular
 * 	>= 1.85 e < 1.95	- Boa
 * 	>= 1.95			- Ótima
 */
programa
{
	funcao inicio()
	{
		real h						//Conjunto de variáveis;
		cadeia c=""					//Define variável vazía que modifica-se conforme seleção;
		escreva("Insira a altura do jogador: ")		//Entrada de dados;
		leia(h)
		se(h<1.75){
			c="Insuficiente"			//Estratégia de Seleção: Tudo que for menor que 1.75 será insuficiente.
		}						
		senao se(h<1.85){				//Após, não há necessidade da expressão <senao se(h>=1.75 e h<1.85)>;
			c="Regular"
		}
		senao se(h<1.95){				//O mesmo acontece aqui;
			c="Boa"
		}
		senao{						//Por eliminação: se h >= 1.95;
			c="Ótima"
		}
		escreva("Categoria: ",c,".")			//Saída de dados;
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
