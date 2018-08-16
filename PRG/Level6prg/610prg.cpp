/*
	PROBLEMA:
		Programa para receber do usuário 10 nomes de postos de gasolina
		e os preços da gasolina em cada um deles e depois mostrar os
		nomes e os respectivos preços em ordem, do menor para o maior
		preço (método do código 609prg.cpp, com variável auxiliar "x" e
		"y").
*/
#include<iostream>
using namespace std;
main(){
	int c,i,t;
	cout<<"Insira a quantidade de Postos: ";cin>>t;
	float x,p[t];string y,n[t];
	for(i=0;i<t;i++){
		cout<<"Nome do Posto: "<<i+1<<": ";cin>>n[i];
		cout<<"Preço da Gasolina: ";cin>>p[i];
	}
	for(c=0;c<t-1;c++){
		for(int i=0;i<t-1-c;i++){
			if(p[i]>p[i+1]){
				x=p[i];
				p[i]=p[i+1];
				p[i+1]=x;
				y=n[i];
				n[i]=n[i+1];
				n[i+1]=y;
			}
		}
	}
	cout<<"Relatório: \n"<<"POSTO				PREÇO\n";
	for(i=0;i<t;i++)cout<<n[i]<<"				"<<p[i]<<"\n";
}
