/*
 *	PROBLEMA:
 *		Verificar médias dos alunos de uma turma e exibir relatórios:
 *		- Geral;
 *		- Alunos Reprovados;
 *		- Melhores Alunos;
 *		- Médias das Provas;
 */
#include<iostream>
using namespace std;
main(){
	int c,i,n;cout<<"Insira a quantidade de alunos - ";cin>>n;
	string nm[n],st[n];float sp=0.0,mp,mm,s=0.0,nt[n][4],m[n];
	for(i=0;i<n;i++){					//Looping para dados de cada aluno;
		cout<<i+1<<"º Aluno - ";cin>>nm[i];		//Atribuição do nome na posição "i" do vetor;
		for(c=0;c<4;c++){				//Looping para dados das provas do aluno em questão;
			cout<<"P"<<c+1<<" - ";			//Numeração da prova (referência escrita);
			do{					//Validação da nota;
				cin>>nt[i][c];
				if(nt[i][c]<0||nt[i][c]>10)cout<<"Nota inválida. Digite novamente: ";
			}while(nt[i][c]<0||nt[i][c]>10);
			s+=nt[i][c];				//Acumulador das notas das provas (variante "c" do aluno "i");
		}
		m[i]=s/4.0;s=0.0;				//Cálculo da média e atribuição no vetor do aluno "m[i]";
		if(m[i]>=6.0)st[i]="APROVADO\n";else{st[i]="REPROVADO\n";}	//Define situação do aluno;
		if(m[i]>mm)mm=m[i];				//Testa e guarda a maior média;
	}
	cout<<"\nRelatório Geral\n";				//Geração de relatórios e loopings internos para exibição dos dados armazenados;
	cout<<"NOME			MÉDIA			SITUAÇÃO\n";
	for(i=0;i<n;i++)cout<<nm[i]<<"			"<<m[i]<<"			"<<st[i];
	cout<<"\nAlunos Reprovados\n";
	cout<<"NOME			MÉDIA		P1		P2		P3		P4\n";
	for(i=0;i<n;i++)if(m[i]<6.0){
		cout<<nm[i]<<"			"<<m[i]<<"		";for(c=0;c<4;c++){cout<<nt[i][c]<<"		";}
		cout<<"\n";
	}
	cout<<"\nMelhor(es) Aluno(s)\n";cout<<"NOME			MÉDIA\n";
	for(i=0;i<n;i++)if(m[i]==mm){cout<<nm[i]<<"			"<<m[i]<<"\n";}
	cout<<"\n\nMédias das Provas\n";
	cout<<"P1		P2		P3		P4\n";
	for(c=0;c<4;c++){
		for(i=0;i<n;i++)sp+=nt[i][c];
		mp=sp/n;
		sp=0.0;
		cout<<mp<<"		";
	}
	cout<<"\n";
}

/*
 *	Obs.: Para cada aluno ("for(i=0;i<n;i++)"), são pedidos quatro notas
 *	(loop "for(l=0;l<4;l++)") além do nome, e tudo se refere aos índices
 *	criados. Após, acumula e grava no vetor de médias com as fórmulas
 *	...s+=nt[i][c]}m[i]=s/4.0; e, ainda para cada aluno i, o vetor de
 *	situação (st) recebe APROVADO ou REPROVADO. Importante observar que 
 *	as variáveis s e sp precisam ser zeradas (logo após uso, como tática)
 *	para recalcular a soma usada no cálculo da média de cada opção de
 *	prova da matriz (P1~P4).
 */
