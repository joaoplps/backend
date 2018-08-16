/*
	PROBLEMA:
		Um time de basquete possui 12 jogadores. Deseja-se um programa que,
		dado o nome e a altura dos jogadores, determine:
		- O nome e a altura do jogador mais alto;
		- A média de altura do time;
		- A quantidade de jogadores com altura superior a média, listando
		o nome e a altura de cada um;
*/
#include<iostream>
using namespace std;
main(){
	cout<<"Time de Basquete\n\n";
	string n[12];float h[12],sh=0.0,mh=0.0,m; int qm=0,qi=0;
	for(int c=0;c<12;c++){
		cout<<"Insira o nome do "<<c+1<<"º atleta: ";cin>>n[c];
		cout<<"Insira a altura do "<<c+1<<"º atleta: ";cin>>h[c];
		sh+=h[c];								//Acumulador das alturas;
		if(h[c]>mh)mh=h[c];							//Armazena as maiores alturas;
	}
	m=sh/12;									//Cálculo da média de altura;
	cout<<"\nA média de altura dos atletas é "<<m<<".";			
	cout<<"\n\nRelação de atleta(s) de maior altura: \n";
	cout<<"NOME		ALTURA\n";
	for(int c=0;c<12;c++)if(h[c]==mh){cout<<n[c]<<"		"<<h[c]<<"\n";qm++;}	//Acumulador da quantidade de atletas com altura igual ou superior à média;
	cout<<"Total de atletas de maior altura: "<<qm;
	cout<<"\n\nRelação de atleta(s) com altura igual ou superior à média: \n";
	cout<<"NOME		ALTURA\n";
	for(int c=0;c<12;c++)if(h[c]>=m){cout<<n[c]<<"		"<<h[c]<<"\n";qi++;}
	cout<<"Total de atletas com altura igual ou superior à média: "<<qi<<"\n\n";
}
