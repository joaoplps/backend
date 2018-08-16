/*
 * PROBLEMA:
 * 	Classificar jogadores segundo altura e categorias:
 * 	< 1.75			- Insuficiente
 * 	>= 1.75 e < 1.85	- Regular
 * 	>= 1.85 e < 1.95	- Boa
 * 	>= 1.95			- Ótima
 */
#include<iostream>
using namespace std;
main(){
	float h;
	string c="Inexistente.";				//Garante que se estiver fora do enquadramento previsto, o resultado será inexistente;
	cout<<"Insira a Altura do jogador: "; cin>>h;
	if(h<1.75){c="Insuficiente.";}				//Atribuições conforme testes de "h";
	else if(h<1.85){c="Regular.";}
	else if(h<1.95){c="Boa.";}
	else{c="Excelente.";}
	cout<<"\nCategoria: "<<c<<"\n";				//Imprime resultado;
}
