/*
	PROBLEMA:
		Queremos efetuar a compactação de um vetor V1 de N algarismos 0 e 1 (N<=40) digitado pelo
		usuário (onde cada algarismo ocupa uma posição do vetor), de forma que o vetor resultante V2
		de N elementos (N<=40) possua menos elementos do que o vetor original. A regra de
		compactação é a seguinte:
		- O primeiro elemento do vetor V2 é o número de algarismos zero que o vetor V1 contém, a
		partir do seu início, até o primeiro algarismo um;
		- O próximo elemento do vetor V2 é o número de algarismos um que o vetor V1 contém, a partir
		do último zero encontrado, até o próximo algarismo zero;
		- O próximo elemento do vetor V2 é o número de algarismos zero que o vetor V1 contém, a
		partir do último um encontrado, até o próximo algarismo um;
		- Repete-se os passos b) e c) até o final do vetor V1.
		
		Exemplo: para o vetor digitado V1 = (0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0)
		obtém-se V2 = (3, 2, 1, 1, 1, 2, 1)
*/
#include<iostream>
using namespace std;
main(){
	cout<<"Compactação de um vetor v de n algarismos 0 ou 1.\n";
	int i,n,z=0,u=0;
	do{						//Validação da variável "n";
		cout<<"Insira a quantidade (até 40): ";cin>>n;
	}while(n<0||n>40);
	int v[n];
	for(i=0;i<n;i++){				//Looping para cada algarismo;
		do{					//Entrada e validação da variável "v[i]";
			cout<<"v["<<i<<"]: ";cin>>v[i];
			if(v[i]!=0 && v[i]!=1)cout<<"Somente 0 ou 1.\n";
		  }while(v[i]!=0 && v[i]!=1);
	}
	int r=0,vf[r];
	for(i=0;i<n;i++){				//Loopíng para contagem dos algarismos "0";
		if(v[i]==0){
			while(v[i]==0){
				z++;
				i++;
			}
			if(z>0){
				vf[r]=z;
				r++;
				z=0;
			}
		}
		else{					//Looping para contagem dos algarismos "1";
			while(v[i]!=0){
				u++;
				i++;
			}
			if(u>0){
				vf[r]=u;
				r++;
				u=0;
			}
		}
	}						//Saída de dados;
	cout<<"\nVetor Final vf["<<r<<"] = { ";
	for(i=0;i<r;i++)cout<<vf[i]<<" ";
	cout<<"} !!\n";
}
