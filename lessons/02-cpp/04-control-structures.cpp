/*
 * 	Orçamento para dedetizar pragas conforme a área:
 * 	1-Ervas Daninhas	- $50.00 por acre
 * 	2-Gafanhotos		- $90.00 por acre
 * 	3-Broca			- $120.00 por acre
 * 	4-Todos			- $170.00 por acre
 *
 *		Obs.: Parar execução quando o nome for diferente de "XXX".
 */
#include<iostream>

using namespace std;

main() {
	// Declarações, inicializações quando necessário
	string n;
	float ac,cf=0.0;						
	int t;
	
	do{
		cout<<"Nome: "; 
		cin>>n;
		
		// Garante a observação feita pelo enunciado
		if(n!="XXX"){						
			do{
				cout<<"Qual o tipo de praga?\n(1-Ervas Daninhas, 2-Gafanhotos, 3-Broca, 4-Todos).\nDigite o número correspondente: "; 
				cin>>t;
				
				if(t!=1 && t!=2 && t!=3 && t!=4) {
					cout<<"\nInsira novamente.\n";	
				}
			// Repete até conseguir um resultado esperado
			}while(t!=1 && t!=2 && t!=3 && t!=4);

			// Define a área
			cout<<"Área (em acres): "; 
			cin>>ac;		
			
			// Testes e Atribuições específicas
			if(t<2){cf=50*ac;}
			else if(t<3){cf=90*ac;}				
			else if(t<4){cf=120*ac;}
			else if(t<5){cf=170*ac;}

			cout<<"\nNome: "<<n<<"\n";
			cout<<"\nOrçamento: "<<cf<<"(opção "<<t<<").\n";
		}
	}while(n!="XXX");
}
