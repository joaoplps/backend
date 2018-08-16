/*
	PROBLEMA:
		Receber do usuário uma lista de N nomes, sexo e idades de
		pessoas, onde N é fornecido inicialmente pelo usuário. Mostrar
		o nome, o sexo e a idade da pessoa mais idosa e da pessoa mais
		jovem. Mostrar a relação (nome e idade) das mulheres e, após,
		dos homens.
*/
#include<iostream>
using namespace std;
main(){
	int c,n,mai=0,mei=150;
	cout<<"LISTA DE NOMES\n\nDigite a quantidade de pessoas que deseja inserir dados: ";cin>>n;
	int i[n];char s[n];string nm[n];
	for(c=0;c<=n-1;c++){
		cout<<"Insira o Nome da "<<c+1<<"º pessoa: ";cin>>nm[c];
		do{									//Validação da variável idade "i[c]";
			cout<<"Digite a idade da "<<c+1<<"º pessoa em números inteiros: ";cin>>i[c];
			if(i[c]<0||i[c]>150)cout<<"De 0 até 150 anos.\n";
		}while(i[c]<0||i[c]>150);
		if(i[c]>mai)mai=i[c];							//Definição a maior idade;
		if(i[c]<mei)mei=i[c];							//Definição a menor idade;
		do{									//Validação da variável sexo "s[c]";
			cout<<"Para o Sexo da "<<c+1<<"º pessoa, insira m/f (em minúsculo): ";cin>>s[c];
			if(s[c]!='m' && s[c]!='f')cout<<"Apenas o caractere m ou f em minúsculo.\n";	
		}while(s[c]!='m' && s[c]!='f');
	}
	cout<<"\nMais velhos(as):\n";							//Relatórios e Loopings de saída de dados;
	cout<<"NOME		SEXO		IDADE\n";
	for(c=0;c<=n;c++)if(i[c]==mai)cout<<nm[c]<<"		"<<s[c]<<"		"<<i[c]<<"\n";
	cout<<"\nMais novos(as)\n";
	cout<<"NOME		SEXO		IDADE\n";
	for(c=0;c<=n;c++)if(i[c]==mei)cout<<nm[c]<<"		"<<s[c]<<"		"<<i[c]<<"\n";
	cout<<"\n\nRelação das Mulheres:\n";
	cout<<"NOME		IDADE\n";
	for(c=0;c<=n;c++)if(s[c]=='f')cout<<nm[c]<<"		"<<i[c]<<"\n";
	cout<<"\n\nRelação dos Homens:\n";
	cout<<"NOME		IDADE\n";
	for(c=0;c<=n;c++)if(s[c]=='m')cout<<nm[c]<<"		"<<i[c]<<"\n";
}
