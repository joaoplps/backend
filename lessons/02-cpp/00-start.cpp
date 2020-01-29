/*
 * 	Imprimir três números lidos em ordem crescente.
 */
#include<iostream>

using namespace std;

main() {
	int a,b,c;

	// Entrada de dados
	cout<<"Insira três números: \n"; 
	cin>>a; 
	cin>>b; 
	cin>>c;	
	
	cout<<"\nEm ordem crescente -> ";
	// Lógica de definição
	// 1-Definir qual o menor número testando primeiro "a", depois "b" e "c"
	// 2-Após definido o menor, definir os conseguintes
	// Obs.: O sinal de menor ou igual já resolve as igualdades
	if(a<=b and a<=c) {
		cout<<a<<" ";
		if(b<=c) {
			cout<<b<<" "<<c;
		}
		else {
			cout<<c<<" "<<b;				
		}							
	}								
	else if(b<=c and b<=a) {						
		cout<<b<<" ";
		if(a<=c) {
			cout<<a<<" "<<c;
		}
		else {
			cout<<c<<" "<<a;
		}
	}
	else {
		cout<<c<<" ";
		if(a<=b) {
			cout<<a<<" "<<b;
		}
		else {
			cout<<b<<" "<<a;
		}
	}
	
	// Quebra de linha
	cout<<"\n";							
}
