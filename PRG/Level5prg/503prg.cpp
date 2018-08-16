/*
 *	PROBLEMA:
 *		Conversão de binário para decimal, para inteiros de 0 até 255.
 */
#include<iostream>
using namespace std;
main(){
	cout<<"Decimal para Binário\n\n";
	int n;
	cout<<"Input Decimal: ";
	do{					//Validação de variável;
		cin>>n;if(n>255||n<0)cout<<"Integers from 0 to 255 only.\n";
	}while(n>255||n<0);
	int cnv[8];				//Declaração de vetor com oito posições;
	for(int i=7;i>=0;i--){			//Looping para atribuição das posições do vetor, de forma decrescente;
		cnv[i]=n%2;n=n/2;		//Lógica: Guardar o resto de "n" dividido por 2, e atribuir novo "n";
	}
	for(int l=0;l<8;l++)cout<<cnv[l];	//Looping para impressão de resultados, de forma crescente;
	cout<<"\n\n";
}
