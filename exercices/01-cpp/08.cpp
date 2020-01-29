/*	
 *	PROBLEMA:
 *		Ler o nome do aluno e suas duas notas, calcula e mostra a média das
 *		notas. Apresentar um relatório com o nome do aluno, suas notas, a média
 *		calculada e a situação (Reprovado<6=<Aprovado). Outros relatórios mostram
 *		os dados dos alunos aprovados e reprovados, e os percentuais respectivos
 *		totais. Além disso gera mensagem dizendo a média da turma e o(s) melhor(es)
 *		aluno(s).
 *	
 *		Obs.: Utilizando vetores, a entrada de "i" define o índice dos vetores.
 */
#include<iostream>
using namespace std;
main(){
	int q,i,na=0,nr=0;
	cout<<"RELATÓRIO DE NOTAS\n\n\nQual a quantidade de alunos: ";cin>>q;
	string nome[q];
	float n1[q],n2[q],m[q],mm,sm;						//Declaração dos vetores APÓS entrada do índice;
	for(i=0;i<=q-1;i++){
		cout<<"\nNome do "<<i+1<<"º aluno: ";cin>>nome[i];
		cout<<"1ª Nota do "<<i+1<<"º aluno: ";cin>>n1[i];		//Lê as notas;
		cout<<"2ª Nota do "<<i+1<<"º aluno: ";cin>>n2[i];
		m[i]=(n1[i]+n2[i])/2;if(m[i]>mm)mm=m[i];			//Calcula e mostra a média individual e define se é a maior média;
		cout<<"\nA média de "<<nome[i]<<" é "<<m[i]<<".\n";
		sm+=m[i];							//Acumula o somatório das médias;
		if(m[i]<6){nr+=1;}else{na+=1;}					//Acumula a quantidade de reprovados e aprovados;
	}
	cout<<"\n\nFolha de Alunos:";						//Geração de relatório;
	cout<<"\n__________________________________________________________________________\n";
	cout<<"NOME		NOTA1		NOTA2		MÉDIA		SITUAÇÃO\n";
	for(i=0;i<=q-1;i++){
		cout<<nome[i]<<"		"<<n1[i]<<"		"<<n2[i]<<"		"<<m[i]<<"		";if(m[i]<6)cout<<"REPROVADO\n";else cout<<"APROVADO\n";
	}
	cout<<"\n__________________________________________________________________________\n";
	cout<<"APROVADOS			"<<na*100/q<<"%";
	cout<<"\nREPROVADOS			"<<nr*100/q<<"%";		//Porcentagens calculadas direto na saída de dados;
	cout<<"\nMÉDIA GERAL			"<<sm/q;
	cout<<"\n\nMelhor(es) aluno(s): ";
	cout<<"\n__________________________________________________________________________\n";
	cout<<"\nNOME		NOTA1		NOTA2		MÉDIA		SITUAÇÃO\n";
	for(i=0;i<=q-1;i++){
		if(m[i]==mm){
			cout<<nome[i]<<"		"<<n1[i]<<"		"<<n2[i]<<"		"<<m[i];
		}
	}
	cout<<"\n\nObrigado!\n\n";
}
