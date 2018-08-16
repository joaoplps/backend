/*
	PROBLEMA:
		Deseja-se publicar o número de acertos de cada aluno em uma
		prova. A prova consta de 30 questões, cada uma com cinco 
		alternativas identificadas por A, B, C, D e E. Para isso são
		dados (lidos):
		- O cartão gabarito;
		- O número de alunos da turma;
		- O cartão de respostas para cada aluno, contendo o seu
		número e suas respostas.
*/
#include<iostream>
using namespace std;
main(){
	cout<<"\nRESULTADOS ACADEMICOS\n\n";
	int a,ac=0,i,n;cout<<"Qual o Número de Alunos da turma? ";cin>>n;
	string nm[n];int nt[n];char p[n],g[10];
	cout<<"Insira o gabarito das questões: \n";
	for(i=0;i<10;i++){
		do{
			cout<<"Q."<<i+1<<": ";cin>>g[i];
			if(g[i]!='A' && g[i]!='B' && g[i]!='C' && g[i]!='D' && g[i]!='E')cout<<"Digite a letra em maiúsculo: somente A, B, C, D, e E.\n";
		}while(g[i]!='A' && g[i]!='B' && g[i]!='C' && g[i]!='D' && g[i]!='E');		
	}
	cout<<"Ok. Agora insira os dados dos Alunos: \n";
	for(a=0;a<n;a++){
		cout<<a+1<<"º Aluno\nNome ";cin>>nm[a];
		for(i=0;i<10;i++){
			do{
				cout<<"Q."<<i+1<<": ";cin>>p[i];
				if(p[i]!='A' && p[i]!='B' && p[i]!='C' && p[i]!='D' && p[i]!='E')cout<<"Digite a letra em maiúsculo: somente A, B, C, D, e E.\n";
			}while(p[i]!='A' && p[i]!='B' && p[i]!='C' && p[i]!='D' && p[i]!='E');
			if(p[i]==g[i])nt[a]=ac++;
		}
	}
	cout<<"\nRELATÓRIO DE ACERTOS\n"<<"____________________________________\n"<<"NOME			ACERTOS\n";
	for(a=0;a<n;a++){cout<<a+1<<". "<<nm[a]<<"			"<<nt[a]<<"/10 - "<<(nt[a]/10.0)*100.0<<"%\n";}
}
