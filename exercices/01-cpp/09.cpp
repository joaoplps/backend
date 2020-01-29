/*
 *	PROBLEMA:
 *		Folha de pagamento para uma empresa de cada vez, com um número "X" de
 *		funcionários. Produzir relatório final com informações:
 *		- Totais de IR, INSS, Piso e Teto (categoria correspondente);
 *		- Nome da empresa e folha total;
 *		
 */
#include<iostream>
using namespace std;
main(){
	char r;
	cout<<"FOLHA DE PGTO\n"<<endl;								//Título de entrada;
	do{
		string n="", ne="", nf="", nmenor="", nmaior="";
		int qt=0, c, vh=0, i, cmenor=0, cmaior=0;
		float h, s, he=0, inss, sl=0.0, fp=0.0, tinss=0.0, tir=0.0, smenor=9999999.99, smaior=-9999999.99;
		cout<<"\n\nInsira o nome da empresa: "; cin>>ne;
		cout<<"Quantidade de funcionarios: "; cin>>qt;
		for(int cont=1; cont<=qt; cont++){
			cout<<"\nNome do "<<cont<<"º funcionario: "; cin>>n;
			cout<<"Horas trabalhadas: "; cin>>h;
			do{
				cout<<"Categoria: "; cin>>c;
				if(c>0 and c<2)vh=5;else if(c<3)vh=10;else if(c<4)vh=15;	//Seleção do valor da hora trabalhada;
				else{cout<<"Categoria inexistente. Insira novamente.\n"<<endl;}
			}while(c<1 or c>3);
			
			/*	Esta próxima linha é a dedução do salário bruto "s". Aqui ele é definido e não muda mais.
				Como no enunciado, o número de horas extras (h-160) definido pela condição do
				valor de horas (h) ser maior que 160 (expressão if(h>160)). Só então definimos s;
			*/
			if(h>160){he=(h-160)*((50/100*vh)+vh);s=160*vh+he;}else{s=h*vh;}inss=s*0.08;
			
			if(s<=1200)i=0;else if(s<=3500)i=10;else{i=15;}				//Define "i" (imposto);
			sl=s-inss-s*(i/100);							//Cálculo do salário líquido "sl";
			if(s>smaior){smaior=s; nmaior=n; cmaior=c;}
			if(s<smenor){smenor=s; nmenor=n; cmenor=c;}
			fp+=s;tinss+=inss;tir+=s*(i/100.0);					//Acumuladores para o relatório;
			cout<<"\nNome: "<<n<<"\nCategoria: "<<c<<"\nINSS: R$"<<inss<<"\nIR: R$"<<s*(i/100.0)<<"\nBruto: R$"<<s<<"\nLíquido: R$"<<sl<<endl;	//Saída individual;
		}
		cout<<"\n\n\nEmpresa: "<<ne<<"\nFolha: R$"<<fp<<"\nTotal INSS: R$"<<tinss<<"\nTotal IR: R$"<<tir<<"\nPiso: "<<nmenor<<", R$"<<smenor<<", Categoria "<<cmenor<<"\nTeto: "<<nmaior<<", R$"<<smaior<<", Categoria "<<cmaior<<endl;		//Relatório geral;
		do{
			cout<<"\nDeseja executar para outra empresa? (s/n): "; cin>>r;		//Execução para nova empresa;
			if(r!='s' and r!='n'){cout<<"Insira s ou n.\n";}
		}while(r!='s' and r!='n');
	}while(r=='s');
	cout<<"\nObrigado!\n";
}
