/*
 * PROBLEMA:
 *		Descobrir a quantidade de múltiplos de um número qualquer e
 *		listá-los.
 */
#include<iostream>
using namespace std;
main(){
	int m=0,x,n1,n2;
	cout<<"Insira dois números inteiros positivos:\n";
	do{					//Entrada e validação de variáveis;
		cout<<"N1 - ";cin>>n1;
		cout<<"N2 - ";cin>>n2;
		if(n1<0||n2<0)cout<<"Apenas inteiros positivos.\n";
	}while(n1<0||n2<0);
	int i,l,v[n2/n1];			//Declaração de vetor após entrada de variáveis;
	if(n1>n2){x=n1;n1=n2;n2=x;}		//Troca de endereços conforme condição, com variável auxiliar "x";
	for(i=1;(n1*i)<=n2;i++){		//Looping para gravação dos múltiplos no vetor "v[n2/n1]";
		m++;				//Contador de múltiplos;
		v[i-1]=n1*i;			//Atribuição do múltiplo em questão conforme "i";
		l++;				//Contador de índices;
	}
	cout<<"Existem "<<m<<" múltiplos de "<<n1<<", de "<<n1<<" à "<<n2<<".\nSão eles: ";for(l=0;l<(i-1);l++)cout<<v[l]<<" ";cout<<"\n";
}
