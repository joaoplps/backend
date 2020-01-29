/*
 *	PROBLEMA:
 *		Leia uma matriz quadrada de ordem NxN, onde N deve ser lido
 *		e apresente este mesma matriz oposta.
 *		Ex.:	1  2  3		1  4  7
 *			4  5  6	 ->	2  5  8
 *			7  8  9		3  6  9
 *	
 */
#include<iostream>
using namespace std;
main(){
	int n;cout<<"Insira o valor da ordem quadrada: ";cin>>n;int m[n][n],l,c;
	for(l=0;l<n;l++)for(c=0;c<n;c++){	//Looping para entrada de matriz (percorre as colunas por cada linhas);
		cout<<"m["<<l<<"]["<<c<<"] : ";
		cin>>m[l][c];
	}
	cout<<"Original:\n";
	for(l=0;l<n;l++){			//Looping para mostrar a matriz de entrada;
		for(c=0;c<n;c++)cout<<m[l][c]<<"      ";
		cout<<endl;			//Quebra de linha;
	}
	cout<<"Oposta:\n";
	for(c=0;c<n;c++){			//Looping para mostrar a matriz oposta (invertendo coluna por linha);
		for(l=0;l<n;l++)cout<<m[l][c]<<"      ";
		cout<<endl;			//Quebra de linha;
	}
}
