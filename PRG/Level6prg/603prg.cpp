/*
	PROBLEMA:
		Dados dois vetores x e y, ambos com n elementos, determinar
		o produto desses vetores e gera-los simultaneamente.
*/
#include<iostream>
using namespace std;
main(){
	int n,c;
	cout<<"PRODUTO DE VETORES\n\nInsira a quantidade de argumentos: ";cin>>n;
	float x[n],y[n];
	cout<<"Para o vetor x:\n";
	for(c=0;c<=n-1;c++){								//Looping para entrada do vetor "x[c]";
		cout<<"Digite o "<<c+1<<"º elemento do primeiro vetor: ";cin>>x[c];
	}
	cout<<"Para o vetor y:\n";
	for(c=0;c<=n-1;c++){								//Looping para entrada do vetor "y[c]";
		cout<<"Digite o "<<c+1<<"º elemento do segundo vetor: ";cin>>y[c];
	}
	cout<<"\nO produto dos vetores é o resultado da soma dos produtos entre os elementos de mesma posição, nesse caso ";
	float p=0.0;
	for(c=0;c<=n-1;c++)p+=x[c]*y[c];						//Cálculo do produto dos vetores;
	cout<<p<<".\n";
}
