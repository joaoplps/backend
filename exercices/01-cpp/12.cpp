/*
	EXERCÍCIO DE PROGRAMAÇÃO - Descomente o pedaço de código para ver a aplicação
	e descreva a problemática, fazendo seus próprios comentários.

	
Questão 1.

#include<iostream>
using namespace std;
main(){
	cout<<"Insira as cinco posições do vetor v[5]:\n";float mv=-99999999.99;int p,aux=0,h,i,v[5];
	for(i=0;i<5;i++){
		do{
			aux=0;cout<<"v["<<i<<"] - ";cin>>v[i];
			for(h=0;h<5;h++)if(v[i]==v[h])aux++;
			if(aux>1)cout<<"Este valor já foi lido.\n";
		}while(aux>1);
		if(v[i]>mv){
			mv=v[i];
			p=i;
		}
	}
	cout<<"O maior valor contido no vetor v[5] é "<<mv<<" ocupando a posição v["<<p<<"].\n";
}


Questão 2.

#include<iostream>
using namespace std;
main(){
	int n;cout<<"Digite a ordem n desejada da matriz quadrada de inteiros a[n][n]: ";cin>>n;int a[n][n];
	for(int l=0;l<n;l++){
		for(int c=0;c<n;c++){
			cout<<"a["<<l<<"]["<<c<<"] - ";
			cin>>a[l][c];
		}
	}
	cout<<"Está é a matriz a:\n";
	for(int l=0;l<n;l++){
		for(int c=0;c<n;c++)cout<<a[l][c]<<"   ";
		cout<<"\n";
	}
	cout<<"Está é a matriz b:\n";
	for(int l=0;l<n;l++){
		for(int c=0;c<n;c++)cout<<a[c][l]<<"   ";
		cout<<"\n";
	}
	cout<<"Está é a matriz c:\n";
	int C[n][n];
	for(int l=0;l<n;l++){
		for(int c=0;c<n;c++){
			if(l==c)cout<<"0";
			else{
				C[l][c]=a[l][c]+a[c][l];
				cout<<C[l][c];
			}
			cout<<"   ";
		}
		cout<<"\n";
	}
}


Questão 3.

#include<iostream>
using namespace std;
int segs(int h,int m, int s){
	int hs,ms,ts;
	if(h>0)hs=h*60*60;
	if(m>0)ms=m*60;
	ts=hs+ms+s;
	return(ts);
}
main(){
	int hr,mi,se;
	cout<<"Insira a quantidade de Horas: ";cin>>hr;
	cout<<"Insira a quantidade de Minutos: ";cin>>mi;
	cout<<"Insira a quantidade de Segundos: ";cin>>se;
	cout<<"O total de segundos é "<<segs(hr,mi,se)<<".\n";
}


Questão 4.

#include<iostream>
using namespace std;
void quad(char w,int q){
	char vw[q][q];
	for(int l=0;l<q;l++){
		for(int c=0;c<q;c++){
			if(l<1||l>q-2){
				vw[l][c]=w;
				cout<<w;
			}
			else{
				if(c>0 && c<q-1)cout<<" ";
				else{cout<<w;}
			}
		}
		cout<<"\n";
	}
}
main(){
	char st;int ld;
	cout<<"Insira o caractere do desenho: ";cin>>st;
	cout<<"Insira o valor para o lado: ";cin>>ld;
	quad(st,ld);
}
*/
