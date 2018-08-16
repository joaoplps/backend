/*
 * PROBLEMA:
 * 	Imprimir de três números inteiros quaisquer: o maior, o 
 *		menor e o do meio.
 */
#include<iostream>
using namespace std;
main(){
	int a,b,c,mai,men,mei;
	cout<<"Digite três números inteiros: \n"; cin>>a; cin>>b; cin>>c;
	if(a<=b && a<=c){
		men=a;
		if(b<=c){
		mei=b; mai=c;
		}
		else{		//Lógica: definir o menor, depois os outros dois atribuindo-os às variáveis (men, mei, mai);
		mei=c; mai=b;
		}
	}	
	else if(b<=c && b<=a){
		men=b;
		if(a<=c){
			mei=a; mai=c;
		}
		else{
			mei=c; mai=a;
		}
	}
	else{
		men=c;
		if(a<=b){
			mei=a; mai=b;
		}
		else{
			mei=b; mai=a;
		}
	}
	cout<<"\nMaior: "<<mai<<"\nMenor: "<<men<<"\nIntermediário: "<<mei<<"\n";	//Exibição de resultados;
}
