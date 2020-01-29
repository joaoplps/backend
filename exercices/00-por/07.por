/*
 * PROBLEMA:
 * 	Folhas de pagamento empresariais.
 */
programa
{
	funcao inicio()
	{
		caracter r, r2							//Conjunto de variáveis;
		cadeia n, ne, nf, nmenor="", nmaior=""
		inteiro qt, c, vh=0, i, cmenor=0, cmaior=0
		real h, s, he, inss, sl, fp=0.0, tinss=0.0, tir=0.0, smenor=9999999.99, smaior=-99999999.99
		
		escreva("FOLHAS DE PGTOS\n\n")
		faca{								//Para cada empresa, faça:
			escreva("Insira o nome da empresa: ")
			leia(ne)
			escreva("Quantidade de funcionários: ")
			leia(qt)
			limpa()							//Limpa a tela;
			para(inteiro cont=1; cont<=qt; cont++){			//Para cada funcionario, faça:
				escreva("Nome do ",cont,"º funcionário: ")
				leia(n)
				escreva("Horas trabalhadas: ")			//Entrada de dados do funcionário;
				leia(h)
				escreva("Categoria: ")
				leia(c)
				limpa()
				se(c<1){
					escreva("Categoria inexiste.")
				}
				senao se(c<2){
					vh=5
				}
				senao se(c<3){					//Valor da hora trabalhada conforme categoria;
					vh=10
				}
				senao se(c<4){
					vh=15
				}
				senao{
					escreva("Categoria inexiste.")
				}
				s=h*vh						//Cálculo do Salário bruto "s";
				se(h>160){
					he=h-160*(50/100*vh+vh)			//Armazenado o valor das horas extras "he" e calculado o salário novo se for o caso;
					s+=he
				}
				inss=s*0.08					//Cálculo do desconto INSS;
				se(s<=1200){
					i=0
				}
				senao se(s<=3500){				//Definindo o I.R. entre 0, 10 e 15;
					i=10
				}
				senao{
					i=15
				}
				sl=s-inss-s*(i/100)				//Cálculo do Salário Líquido (com descontos);
				se(s>smaior){
					smaior=s
					nmaior=n
					cmaior=c
				}						//Define remunerações e guarda os dados;
				se(s<smenor){
					smenor=s
					nmenor=n
					cmenor=c
				}
				fp+=s						//Somatório da Folha de Pgto;
				tinss+=inss					//Somatório do Total INSS;
				tir+=s*(i/100)					//Somatório do Total I.R;
				escreva("Nome: ",n,"\nCategoria: ",c,"\nINSS: R$",inss,"\nIR: R$",s*(i/100),"\nBruto: R$",s,"\nLíquido: R$",sl)	//Folha do Funcionário;
				escreva("\nInsira um carácter para avançar: ")	//Pausa a tela para que o usuário avance;
				leia(r2)
				limpa()					//Limpa a tela;
			}
			escreva("Nome: ",ne,"\nFolha: R$",fp,"\nTotal INSS: R$",tinss,"\nTotal IR: R$",tir,"\nPiso: ",nmenor,", R$",smenor,", Categoria ",cmenor,"\nTeto: ",nmaior,", R$",smaior,", Categoria ",cmaior)
			escreva("\n\nDeseja executar para outra empresa (s/n)? ")
			leia(r)
			limpa()
		} enquanto(r=='s'ou r=='S')		//Se desejar executar para outra empresa "r" deve ser igual a "s" ou "S".
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1978; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
