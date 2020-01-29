/*
 * PROBLEMA:
 *		Cálculo de fatoriais, lembrando que o fatorial do número
 *		zero é 1.
 *		Ex.: 5! (lê-se cinco fatorial) = 5 * 4 * 3 * 2 * 1 = 24
 */
#include<iostream>
using namespace std;
int fatorial(int num){				//Função de cálculo do fatorial;
	int fat=num;				//Atribuição: "num" para a variável "fat";
	while(num>1){
		fat=fat*(num-1);		//Cálculo do fatorial;
		num--;				//Decremento;
	}
	return(fat);				//Retorna a variável "fat";
}
main(){
	int n;cout<<"Insira um número inteiro: ";
	do{					//Validação de variável;
		cin>>n;
		if(n<0)cout<<"Não existe fatorial negativo.\nInsira novamente: ";
	}while(n<0);
	if(n==0)cout<<"O fatorial de 0 é 1.\n";	//Garante condição específica;
	else{
		cout<<"O fatorial de "<<n<<" é "<<fatorial(n)<<".\n";	//Chama a função "fatorial()" já na saída de dados, uma vez que n!=0;
	}
}
