/*
 * 	Mostrar os valores pares entre 1 e 27.
 *	Obs.: Descomente um por um para executar!
*/

// Utilização do faça e do enquanto
programa {
	funcao inicio() {
		// Variável definida
		inteiro a=0		
		
		// Fazer a soma de dois em dois valores a partir do primeiro par anterior possível, até o último par possível
		faca {			
			a=a+2
			escreva(a)
			// Separar por espaços
			escreva(" ")	
		}
		
		// Definir trecho executável
		enquanto(a<27)		
	}
}

/*
// Utilização do para
programa {					
	funcao inicio() {
		inteiro n
		
		para(n=2;n<27;n+=2) {
			escreva(n," ")	
		}
	}
}


// Utilização do faça enquanto
programa {					
	funcao inicio() {
		inteiro n=2
		
		faca {
			escreva(n," ")
			n+=2
		}enquanto(n<27)
	}
}


// Utilização do enquanto
programa {					
	funcao inicio() {
		inteiro n=2
		
		enquanto(n<27) {
			escreva(n," ")
			n+=2
		}
	}
}
*/
