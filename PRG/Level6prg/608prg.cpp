/*
	PROBLEMA:
		Dada uma seqüência de n números reais, determinar os números
		que compõem a seqüência e o número de vezes que cada um deles
		ocorre na mesma.
		
		Ex.: n = 8
		Seqüência: -1.7, 3.0, 0.0, 1.5, 0.0, -1.7, 2.3, -1,7
		Saída:
			-1.7 ocorre 3 vezes
			3.0 ocorre 1 vez
			0.0 ocorre 2 vezes
			1.5 ocorre 1 vez
			2.3 ocorre 1 vez
*/
#include<iostream>
using namespace std;
main(){
	int cc=0,c,i,n;
	cout<<"Insira a quantidade de números de uma determinada sequencia a definir: ";cin>>n;
	int v[n];
	cout<<"Determine a sequência de v["<<n<<"]:\n";
	for(i=0;i<n;i++){
		cout<<"v["<<i<<"]: ";cin>>v[i];cout<<"\n";
	}
	for(i=0;i<n;i++){
		for(c=-1;c<n-1;c++)if(v[i]==v[c+1])cc++;
		cout<<"v["<<i<<"] aparece "<<cc<<" vezes.\n";
		cc=0;
	}
}
/*
	Obs.: Para sabermos quando valores são iguais dentro de um vetor precisaremos
	comparar o indice em questão com o restante dos indices e incrementar
	contadores (que serão as respostas) quando o resultado desta comparação
	for igualdade. Essa comparação se faz através da observação da quantidade
	n de números lidos, e da referência de posicionamento no vetor. Corre-se
	a comparação com todos os valores (c) presentes, escrevendo a saída a cada
	finalização de contagem.
*/
