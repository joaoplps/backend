/*
 *	PROBLEMA:
 *		De acordo com a quantidade de questões de uma prova, entrar
 *		o gabarito correto, fazer a conferência e calcular a nota.
 *		Extras:
 *		- Relatório com: média geral, melhores notas, percentual de
 *		classificados e desclassificados.
 */
#include<iostream>
using namespace std;
main(){
	cout<<"\nRESOLUÇÃO DE PROVAS\n\n";
	int des=0,cla=0,i,can,que; float nt,mn=0.0;
	cout<<"Quantidade de candidatos(as): ";cin>>can;cout<<"Quantidade de questões: ";cin>>que;
	char rsp[can][que],gab[que];
	string nms[can],sit="";
	float nf[can],mg=0.0;
	int crt[que];
	cout<<"\nGABARITO\n";
	for(i=0;i<que;i++){						//Looping para entrada de gabarito;
		do{							//Validação de dados;
			cout<<"Questão "<<i+1<<": ";cin>>gab[i];
			if(gab[i]!='A' && gab[i]!='B' && gab[i]!='C' && gab[i]!='D' && gab[i]!='E')cout<<"Somente A, B, C, D, e E em maiúsculo.\n";
		}while(gab[i]!='A' && gab[i]!='B' && gab[i]!='C' && gab[i]!='D' && gab[i]!='E');
	}
	cout<<"\nCANDIDATOS(AS)\n";
	for(i=0;i<can;i++){						//Looping para entrada dos(as) candidatos(as);
		nt=0.0;							//Zera variável nota "nt";
		cout<<"\nCandidato(a) "<<i+1<<"\nNome: ";cin>>nms[i];
		for(int c=0;c<que;c++){					//Looping para entrada de gabarito do(a) candidato(a) em questão;
			do{						//Validação de dados;
				cout<<"Questão "<<c+1<<": ";cin>>rsp[i][c];
				if(rsp[i][c]!='A' && rsp[i][c]!='B' && rsp[i][c]!='C' && rsp[i][c]!='D' && rsp[i][c]!='E')cout<<"Somente A, B, C, D, e E em maiúsculo.\n";
			}while(rsp[i][c]!='A' && rsp[i][c]!='B' && rsp[i][c]!='C' && rsp[i][c]!='D' && rsp[i][c]!='E');
			if(rsp[i][c]==gab[c]){nt+=10.0/que;crt[c]+=1;}else{crt[c]+=0;}	//Teste para avaliar nota no vetor "crt[c]";
		}
		nf[i]=nt;						//Atribuição da nota final "nf";
		if(nf[i]>=mn)mn=nf[i];					//Teste das melhores notas;
		if(nt<5){sit="DESCLASSIFICADO";des++;}else{sit="CLASSIFICADO";cla++;}	//Define situação;
	}
	cout<<"\n\nRELATÓRIOS\n";					//Geração de relatórios e loopings de saída dos dados;
	cout<<"\nR. GERAL\n"<<"----------------------------\nNOME			NOTA\n";for(i=0;i<can;i++){cout<<nms[i]<<"			"<<nf[i]<<"\n";}
	cout<<"\nMÉDIA GERAL		";for(i=0;i<can;i++)mg+=nf[i];mg=mg/can;cout<<mg<<"\n";
	cout<<"\nDESCLASSIFICADOS	"<<(des*100)/can<<"%\n\nCLASSIFICADOS		"<<(cla*100)/can<<"%\n----------------------------\nNOME			NOTA\n";
	for(i=0;i<can;i++){if(nf[i]>=5)cout<<nms[i]<<"			"<<nf[i]<<"\n";}
	cout<<"\nMelhores Notas\n----------------------------\nNOME			NOTA\n";
	for(i=0;i<can;i++){if(nf[i]==mn)cout<<nms[i]<<"			"<<nf[i]<<"\n";}
	cout<<"\nACERTOS\n";for(i=0;i<que;i++)cout<<"Questão "<<i+1<<"	"<<(crt[i]*100.0)/can<<"%\n";cout<<"\n";
}
