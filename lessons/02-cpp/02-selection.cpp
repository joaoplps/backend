/*
 * 	Classificar jogadores segundo altura e categorias:
 * 	< 1.75			- Insuficiente
 * 	>= 1.75 e < 1.85	- Regular
 * 	>= 1.85 e < 1.95	- Boa
 * 	>= 1.95			- Ótima
 */
#include<iostream>

using namespace std;

main() {
	float h;

	// Garante que se estiver fora do enquadramento previsto, o resultado será inexistente
	string c="Inexistente.";	

	cout<<"Insira a Altura do jogador: "; 
	cin>>h;

	// Atribuições conforme testes de "h"
	if(h<1.75) { 
		c="Insuficiente."; 
	}				
	else if(h<1.85) { 
		c="Regular."; 
	}
	else if(h<1.95) { 
		c="Boa."; 
	}
	else { 
		c="Excelente."; 
	}
	
	// Imprime resultado
	cout<<"\nCategoria: "<<c<<"\n";				
}
