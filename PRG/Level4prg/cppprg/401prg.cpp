/*
 * PROBLEMA:
 * 	Imprimir três números lidos em ordem crescente.
 */
#include<iostream>
using namespace std;
main(){
	int a,b,c;
	cout<<"Insira três números: \n"; cin>>a; cin>>b; cin>>c;	//Entrada de dados;
	cout<<"\nEm ordem crescente -> ";
	if(a<=b and a<=c){
		cout<<a<<" ";
		if(b<=c){
			cout<<b<<" "<<c;
		}
		else{
			cout<<c<<" "<<b;				//Lógica de definição:
		}							//1-Definir qual o menor número testando primeiro "a", depois "b" e "c";
	}								//2-Após definido o menor, definir os conseguintes;
	else if(b<=c and b<=a){						//Obs.: O sinal de menor ou igual já resolve as igualdades;
		cout<<b<<" ";
		if(a<=c){
			cout<<a<<" "<<c;
		}
		else{
			cout<<c<<" "<<a;
		}
	}
	else{
		cout<<c<<" ";
		if(a<=b){
			cout<<a<<" "<<b;
		}
		else{
			cout<<b<<" "<<a;
		}
	}
	cout<<"\n";							//Quebra de linha;
}
