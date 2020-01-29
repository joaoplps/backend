/*
 * PROBLEMA:
 * 	Cálculo de IMC e folha com dados:
 * 	Total de pessoas que participaram;
 * 	Total de pessoas abaixo do peso normal;
 * 	Total de pessoas em obesidade;
 * 	Peso e Altura médios;
 */
programa
{
	inclua biblioteca Matematica --> mat			//Inclusão de biblioteca de comandos para uso do <mat.arredondar>;
	funcao inicio()
	{
		inteiro ca=0
		real p, h, pm=0.0, hm=0.0, ap=0.0, ob=0.0, i, pmf=0.0, hmf=0.0, pfap, pfob		//Conjunto de variáveis;
		caracter s='s'

		escreva("Vamos calcular o I.M.C. de um grupo de pessoas.\n")		//Texto de entrada;
		enquanto(s=='s' ou s=='S'){
			ca=ca+1		//Cálculo do total de pessoas: Toda vez que a resposta for sim e entrar no loopíng <enquanto(s=='s' ou s=='S')>;
			escreva("Insira o peso da ",ca,"ª pessoa: ")			//Entrada de dados;
			leia(p)
			escreva("Digite a altura da ",ca,"ª pessoa: ")
			leia(h)
			i=p/(h*h)	//Cálculo do Índice de Massa Corporal;
			se(i>=0){
				se(i<=18.5){	//Seleções para guardar a quantidade de pessoas abaixo do peso "ap" e obesas "ob";
					ap=ap+1
				}			
				se(i>30){
					ob=ob+1
				}
				se(i<=17){	//Seleções para definir classificação conforme IMC;
					escreva("Essa pessoa está muito abaixo do peso ideal.")
				}
				senao se(i<=18.5){
					escreva("Essa pessoa está abaixo do peso ideal.")
				}
				senao se(i<=25){
					escreva("Essa pessoa está na faixa do peso ideal.")
				}
				senao se(i<=30){
					escreva("Essa pessoa está acima do peso." )	
				}
				senao se(i<=35){
					escreva("Essa pessoa está na faixa da Obesidade I.")
				}
				senao se(i<=40){
					escreva("Essa pessoa está na faixa da Obesidade II (severa).")
				}
				senao{
					escreva("Essa pessoa está na faixa da Obesidade III (mórbida).")
				}
			}
			senao{
				escreva("O I.M.C. não pode ser negativo.")
			}
			escreva("\nDeseja inserir mais dados? (S/N) ")
			leia(s)
			limpa()
			hm+=h		//Somatórios e cálculos para Altura Média e Peso Médio;
			hmf=hm/ca
			pm+=p
			pmf=pm/ca
		}
		pfap=(ap*100)/ca	//Cálculo das porcentagens;
		pfob=(ob*100)/ca
		escreva("Participaram deste cálculo ",ca," pessoas:\n",mat.arredondar(pfap, 1),"% estão abaixo do peso normal;\n",mat.arredondar(pfob, 1),"% estão obesos (com I.M.C. maior que 30);\nPeso médio: ",mat.arredondar(pmf, 2),"Kg;\nAltura média: ",mat.arredondar(hmf, 2),"m.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pm, 15, 13, 2}-{hm, 15, 21, 2}-{ap, 15, 29, 2}-{i, 15, 45, 1}-{pmf, 15, 48, 3}-{hmf, 15, 57, 3}-{pfap, 15, 66, 4}-{pfob, 15, 72, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
