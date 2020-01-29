/*	
 *	PROBLEMA:
 *		ler um valor monetário e apresentar as cédulas
 *		referentes a este valor. Priorize um menor número de cédulas possíveis.
 *		Ex.:	R$368,00
 *				Notas de R$100:	3
 *				Notas de R$50:	1
 *				Notas de R$20:	0
 *				Notas de R$10:	1
 *				Notas de R$5:	1
 *				Notas de R$2:	1
 *				Notas de R$1:	3
 */
#include<iostream>
#include<math.h>		//Iclusão de biblioteca "math.h" que permite o arredondamento para baixo de uma variável numérica;
using namespace std;
main(){
	float n;
	int n100, n50, n20, n10, n5, n2, n1;
	cout<<"Insira um valor: "; cin>>n,"\n";
	n100=n/100;
	cout<<"Notas de R$100: "<<floor(n100)<<"\n";	//Lógica: divisão do valor total pelas notas mais altas primeiro,
	n=n-floor(n100)*100;				//subtraindo o valor restante e reiniciando o processo até que o
	n50=n/50;															//último valor disponível seja calculado.
	cout<<"Notas de R$50: "<<floor(n50)<<"\n";
	n=n-floor(n50)*50;
	n20=n/20;
	cout<<"Notas de R$20: "<<floor(n20)<<"\n";
	n=n-floor(n20)*20;
	n10=n/10;
	cout<<"Notas de R$10: "<<floor(n10)<<"\n";
	n=n-floor(n10)*10;
	n5=n/5;
	cout<<"Notas de R$5: "<<floor(n5)<<"\n";
	n=n-floor(n5)*5;
	n2=n/2;
	cout<<"Notas de R$2: "<<floor(n2)<<"\n";
	n=n-floor(n2)*2;
	n1=n/1;
	cout<<"Moedas de R$1: "<<floor(n1)<<"\n";
	n=n-floor(n1);
}
