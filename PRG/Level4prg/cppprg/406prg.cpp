/*
 * PROBLEMA:
 * 	Calcular o valor da mensalidade a pagar.
 * 	Séries 1 a 4:	$200.00
 * 	Séries 5 a 8:	$280.00
 * 	Descontos:	5 % por irmão matriculado
 * 	Multa:		$15 + mora de 1 % ao dia
 */
#include<iostream>
using namespace std;
main(){
	string n;
	float v=0.00,df;			//Declarações e Inicializações quando necessário;
	int s,i,d;
	char r;
	do{
		cout<<"Nome do Aluno: "; cin>>n;
		do{
			cout<<"Digite a Série: "; cin>>s;
			if(s<1||s>9){
				cout<<"Insira a Série correta (1 a 9).\n";	//Garante resultados esperados;
			}
		}while(s<1||s>9);
		if(s<5){v=200.00;}		//Define a mensalidade de acordo com a série;
		else{v=280.00;}
		cout<<"Quantidade de Irmãos: "; cin>>i;
		cout<<"Dias em atraso: "; cin>>d;
		if(d<=0){df=(0.05*i)*v; v=v-df;}		//Definições de descontos e multa conforme dias em atraso;
		else{df=15+(0.01*d)*v; v=v+df;}
		cout<<"Nome: "<<n<<"\nValor a ser pago: R$"<<v;
		do{
			cout<<"\nDeseja continuar (s/n)?"; cin>>r;
			if(r!='s' and r!='n'){
				cout<<"Digite apenas s ou n em minúsculo.";	//Garante resultados esperados;
			}
		}while(r!='s' and r!='n');
	}while(r!='n');
}
