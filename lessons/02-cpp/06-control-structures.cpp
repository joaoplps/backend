/*
 * PROBLEMA:
 * 	Folha salarial de empresas contendo:
 * 	Total de Salários Líquidos;
 * 	Média Salarial;
 * 	Funcionário mais antigo e Tempo de Serviço;
 * 	Observar Bônus por Tempo de Serviço:
 * 	Menos de 5 anos:	Isento
 * 	Menos de 10 anos:	5 %
 * 	Menos de 15 anos:	10 %
 * 	Menos de 20 anos:	15 %
 * 	Menos de 25 anos:	20 %
 * 	25 anos ou mais:	25 %
 */
 #include<iostream>

using namespace std;

main() {
	string n,nold="";
	float s,d,t,somasal=0.0,mediasal=0.0;
	int q,p,told=0;
	
	cout<<"Qual a quantidade de Funcionários? "; 
	cin>>q;

	// Para cada funcionário, definir variáveis
	for(int c=0;c<q;c++) {						
		cout<<"\nNome: "; 
		cin>>n;

		cout<<"Salário: "; 
		cin>>s;

		cout<<"Número de Dependentes: "; 
		cin>>d;

		cout<<"Tempo de Serviço: "; 
		cin>>t;

		// Define bônus de acordo com o tempo de serviço
		if(t<5) {p=0;}
		else if(t<10) {p=5;}					
		else if(t<15) {p=10;}
		else if(t<20) {p=15;}
		else if(t<25) {p=20;}
		else {p=25;}
		
		// Cálculo do salário com descontos
		s+=0.05*s-0.08*s-35-0.06*s+(p/100)*s; somasal+=s;	
		
		// Teste do funcionário mais antigo
		if(t>told) {
			nold=n; 
			told=t;
		}				
		
		cout<<"Total Líquido: R$"<<s<<"\n";
	}
	
	// Cálculo da média salarial
	mediasal=somasal/q;						
	
	// Exibição de resultados
	cout<<"\n\n____________________________________________";	
	cout<<"\nTotal de Salários Líquidos: R$"<<somasal;
	cout<<"\nMédia Salarial: R$"<<mediasal;
	cout<<"\nFuncionário mais antigo: "<<nold<<" ("<<told<<" anos).\n";	
}
