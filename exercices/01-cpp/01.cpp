/*
 * PROBLEMA:
 *		Criar uma matriz de dimensões N x N inserida pelo
 *		usuário.
 */
#include<iostream>
using namespace std;
main(){
	int c,i,n;cout<<"Digite a dimensão desejada: ";cin>>n;int m[n][n];	//Declaração, entrada de dados e declaração de matriz;
	for(i=0;i<n;i++){							//Looping para atribuição das posições com "0" e "1";
		for(int c=0;c<n;c++)m[i][c]=0;
		m[i][i]=1;
	}
	for(i=0;i<n;i++){							//Looping para escrita da matriz;
		for(c=0;c<n;c++){
			cout<<m[i][c]<<"  ";
		}
		cout<<"\n";
	}
}
