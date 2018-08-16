/*
	PROBLEMA:
		Programa que calcula a interseção (valores em comum) entre
		os valores contidos em dois vetores V1 e V2 e armazena e
		mostra estes valores no vetor V3.
*/
#include<iostream>
using namespace std;
main(){
	int x,n;
	cout<<"Digite o tamanho desejado do vetor: ";cin>>n;
	int v1[n],v2[n];
	for(i=0;i<n;i++){			//Looping de entrada de "v1[]";
		cout<<"v1["<<i<<"] : ";
		cin>>v1[i];
	}
	for(i=0;i<n;i++){			//Looping de entrada de "v2[]";
		cout<<"v2["<<i<<"] : ";
		cin>>v2[i];
	}
	for(i=0;i<n;i++)if(v1[i]==v2[i])x++;	//Looping para definir a quantidade de posições do vetor "v3[]";
	int v3[x], y=-1;
	for(i=0;i<n;i++){
		if(v1[i]==v2[i])v3[y+1]=v1[i];	//Gravação no vetor "v3[]";
	}
}
