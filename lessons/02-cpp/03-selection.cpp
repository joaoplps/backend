/*
 * 	Obter de cinco número inseridos:
 * 	Soma;
 * 	Média Aritimética;
 * 	Maior e Menor Número;
 */
#include<iostream>

using namespace std;

main() {
	float n1,n2,n3,n4,n5,s,m,ma,me;

	cout<<"Insira cinco números: \n";
	cin>>n1; 
	
	ma=n1; 
	me=n1;

	cin>>n2; 
	// Testes e atribuições
	if(n2<me){me=n2;} 
	if(n2>ma){ma=n2;}		
	
	cin>>n3; 
	if(n3<me){me=n3;} 
	if(n3>ma){ma=n3;}
	
	cin>>n4; 
	if(n4<me){me=n4;} 
	if(n4>ma){ma=n4;}
	
	cin>>n5; 
	if(n5<me){me=n5;} 
	if(n5>ma){ma=n5;}
	
	// Somatório
	s=n1+n2+n3+n4+n5;					
	
	// Cálculo da média
	m=s/5;							
	
	// Exibição de resultados
	cout<<"\nSoma Total: "<<s<<"\n";			
	cout<<"Média Aritimética: "<<m<<"\n";
	cout<<"Maior Número: "<<ma<<"\n";
	cout<<"Menor Número: "<<me<<"\n";
}
