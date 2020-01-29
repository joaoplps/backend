/*
 * 	Calcular o valor da mensalidade a pagar.
 * 	Séries 1 a 4:	$200.00
 * 	Séries 5 a 8:	$280.00
 * 	Descontos:	5 % por irmão matriculado
 * 	Multa:		$15 + mora de 1 % ao dia
 */
#include<iostream>
using namespace std;
main() {
	// Declarações e Inicializações quando necessário
	string n;
	float v=0.00,df;			
	int s,i,d;
	char r;
	
	do{
		cout<<"Nome do Aluno: "; cin>>n;
		
		do{
			cout<<"Digite a Série: "; cin>>s;
			
			// Garante resultados esperados
			if(s<1||s>9) {
				cout<<"Insira a Série correta (1 a 9).\n";	
			}
		}while(s<1||s>9);
		
		// Define a mensalidade de acordo com a série
		if(s<5) {v=200.00;}		
		else{v=280.00;}
		
		cout<<"Quantidade de Irmãos: "; 
		cin>>i;
		
		cout<<"Dias em atraso: "; 
		cin>>d;
		
		// Definições de descontos e multa conforme dias em atraso
		if(d<=0) {
			df=(0.05*i)*v; 
			v=v-df;
		}		
		else{
			df=15+(0.01*d)*v; 
			v=v+df;
		}
		
		cout<<"Nome: "<<n<<"\nValor a ser pago: R$"<<v;
		
		do{
			cout<<"\nDeseja continuar (s/n)?"; cin>>r;
			
			// Garante resultados esperados
			if(r!='s' and r!='n') {
				cout<<"Digite apenas s ou n em minúsculo.";	
			}
		}while(r!='s' and r!='n');
	}while(r!='n');
}
