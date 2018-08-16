/*
 * PROBLEMA:
 * 	Folha salarial de empresas contendo:
 * 	Total de Salários Líquidos;
 * 	Média Salarial;
 * 	Funcionário mais antigo e Tempo de Serviço;
 * 	Observar Bônus por Tempo de Serviço:
 * 	Menos de 5 anos:	Isento
 * 	Menos de 10 anos:	5 %
 * 	Menos de 15 anos:	10 %
 * 	Menos de 20 anos:	15 %
 * 	Menos de 25 anos:	20 %
 * 	25 anos ou mais:	25 %
 */
programa
{
	funcao inicio()
	{
		cadeia n, nantigo=""
		real s, d, t, somasal=0.0, mediasal=0.0			//Conjunto de variáveis;
		inteiro q, c=0, p, tantigo=0
		escreva("Digite a quantidade de funcionários: ")	//Define quantidade de funcionários para utilizar com o contador na estrutura de controle;
		leia(q)
		enquanto(c<q){						//Estrutura de Controle: Enquanto o contador incrementado a cada execução não atingir o valor definido "q";
			escreva("Nome: ")
			leia(n)
			escreva("Salário: ")				//Entrada individual de dados dos Funcionários;
			leia(s)
			escreva("Número de dependentes: ")
			leia(d)
			escreva("Tempo de serviço: ")
			leia(t)
			se(t<5){					//Seleções de valores percentuais "p" de acordo com o tempo de serviço;
				p=0
			}
			senao se(t<10){
				p=5
			}
			senao se(t<15){
				p=10
			}
			senao se(t<20){
				p=15
			}
			senao se (t<25){
				p=20
			}
			senao{
				p=25
			}
			s+=0.05*s-0.08*s-35-0.06*s+(p/100)*s		//Cálculo de descontos tranformando Salário Bruto em Líquido;
			somasal+=s					//Acumulador de Salário Líquido.
			se(t>tantigo){					//Seleção : Se o tempo de serviço "t" for o maior;
				nantigo=n				//Guardar nome e tempo de serviço do funcionário mais antigo;
				tantigo=t
			}
			escreva("Total líquido: R$",s,"\n")		//Saída de dados individuais;
			c++
		}
		mediasal=somasal/q					//Cálculo da média salarial líquida paga após término da entrada funcionários;
		limpa()
		escreva("Total de Salários Líquidos pagos: R$",somasal,"\nMédia Salarial: R$",mediasal,"\nFuncionário mais antigo: ",nantigo," (",tantigo," anos).")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
