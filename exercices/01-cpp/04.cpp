/*
 * PROBLEMA:
 *		Calcular a área de acordo com a opção: Quadrado, Triângulo
 *		e Circulferência, utilizando funções.
 */
#include<iostream>
using namespace std;
void qua(){		//Função Área do Quadrado;
	float l,a;cout<<"\nÁREA DO QUADRADO\nInsira o lado: ";cin>>l;
	a=l*l;				//Cálculo correspondente;
	cout<<"Área - "<<a<<"\n";	//Saída de dados;
	a=0.0;				//Zera variável;
}
void tri(){		//Função Área do Triângulo;
	float b,h,a;cout<<"\nÁREA DO TRIÂNGULO\nInsira a base: ";cin>>b;cout<<"Insira a altura: ";cin>>h;
	a=(b*h)/2;			//Cálculo correspondente;
	cout<<"Área - "<<a<<"\n";	//Saída de dados;
	a=0.0;				//Zera variável;
}
void cir(){		//Função Área da Circunferência;
	float rai,a;cout<<"\nÁREA DA CIRCUNFERÊNCIA\nInsira o raio: ";cin>>rai;
	a=(rai*rai)*3.14;		//Cálculo correspondente;
	cout<<"Área - "<<a<<"\n";	//Saída de dados;
	a=0.0;				//Zera variável;
}
main(){
	char rsp;
	do{
		rsp='n';
		int r;cout<<"GEOMETRIA PLANA\n1 - Quadrado\n2 - Triângulo\n3 - Circunferência\n4 - Sair\n";
		do{								//Validação de variável "r";
			cout<<"Opção: ";cin>>r;
			if(r<1||r>4)cout<<"Opção incorreta.\n";
		}while(r<1||r>4);
		if(r==1)qua();else if(r==2)tri();else if(r==3)cir();		//Testa o rol de Opções e chama a função correspondente;
		else{cout<<"\nO programa será finalizado. Até Breve.\n";}	//Opção 4;
		if(r!=4){cout<<"\nDeseja continuar? (s/n): ";			//Se r!=4;
			do{							//Validação de variável "rsp";
				cin>>rsp;
				if(rsp!='s' && rsp!='n')cout<<"s ou n apenas: ";
			}while(rsp!='s' && rsp!='n');}
	}while(rsp=='s');
}
