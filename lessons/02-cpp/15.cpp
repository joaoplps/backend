/*
	PROBLEMA:
		Programa para ordenar um vetor de N inteiros (Dica: encontrar
		o maior de todos os inteiros e trocá-lo com o último elemento
		do vetor, repetindo este procedimento N vezes, porém
		descartando, a cada iteração, os elementos já ordenados).
*/
#include<iostream>
using namespace std;
main(){
	int x,c,i,n;
	cout<<"Insira a quantidade de posições de um vetor: ";cin>>n;
	int v[n];
	cout<<"Determine a sequência de v["<<n<<"]:\n";
	for(i=0;i<n;i++){					//Looping de entrada de dados;
		cout<<"v["<<i<<"]: ";cin>>v[i];cout<<"\n";
	}
	for(c=0;c<n-1;c++){					//Looping externo correndo todos os índices;
		for(i=0;i<n-1-c;i++){				//Looping interno correndo cada índice individualmente;
			if(v[i]>v[i+1]){			//Testa se o elemento é maior do que o próximo;
				x=v[i];
				v[i]=v[i+1];			//Troca de posições utilizando variável auxiliar "x";
				v[i+1]=x;
			}
		}
	}
	cout<<"Resultado Ordenado: ";
	for(i=0;i<n;i++)cout<<v[i]<<" ";
	cout<<"\n";
}
