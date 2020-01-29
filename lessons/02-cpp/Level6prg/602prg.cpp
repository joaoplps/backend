/*
	PROBLEMA:
		Tentando descobrir se um dado era viciado, um dono de cassino
		o lançou n vezes. Utilize um vetor para armazenar o número de
		ocorrências de cada face.
		
		Obs.: o lance gerado deve ser um valor entre 1 e 6.
*/
#include<iostream>
using namespace std;
main(){
	int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
	int r,i,c,n,dd[6]={n1,n2,n3,n4,n5,n6};
	for(i=0;i>=0;i++){
		do{
			cout<<"Insira o resultado: ";cin>>n;
			if(n<1||n>6)cout<<"Digite um número de 1 a 6.";
		}while(n<1||n>6);
		if(n==1)dd[0]=n1++;
		else if(n==2)dd[1]=n2++;
		else if(n==3)dd[2]=n3++;
		else if(n==4)dd[3]=n4++;
		else if(n==5)dd[4]=n5++;
		else dd[5]=n6++;
		cout<<"\nOcorrências:\n";
		for(c=0;c<=5;c++){
			r=(dd[c]/(i+1))*100;
			cout<<"Número "<<c+1<<" - "<<dd[c]<<", "<<r<<"%\n";
		}
	}
}

/* 
	Obs.: Vetor composto de ocorrencias segundo posições do resultado do jogo (1 a 6):
	int dd[5];
	Indice guarda a soma de ocorrencias:
	dd[i]=i++;
	Saída mostra cada indice (ocorrencias de cada numero):
	for(c=0;c<=5;c++)cout<<dd[c]<<r;
*/

