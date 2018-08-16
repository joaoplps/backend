/*
 *	PROBLEMA:
 *		Conversão de binário para decimal, e vice versa.
 */
#include<iostream>
using namespace std;
main(){
	cout<<"Decimal to Binary\n\n";
	int i;cout<<"Input bit size: ";cin>>i;	//Escolha do tamanho do binário;
	int n;cout<<"Input Decimal: ";cin>>n;	//Entrada do número decimal;
	int cnv[n];
	for(i-1;i>=0;i--){
		cnv[i]=n%2;
		n=n/2;
	}
	for(int i=0;i<=7;i++)cout<<cnv[i];	//Saída de dados;
	cout<<"\n\n";
	cout<<"Now, the other way: ";cin>>n;	//Processo reverso: binário para decimal;
	int dv=0,num=n,b=1,t=num;
	while(t){
		int ld=t%10;
		t=t/10;
		dv+=ld*b;
		b=b*2;
	}
	cout<<dv<<"\n\n";			//Saída de dados;
}
