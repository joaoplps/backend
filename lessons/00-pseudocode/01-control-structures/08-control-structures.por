/*
 * 	Definir peso e número de identificação dos bois mais gordo e mais magro, além da quantidade total que entrou no frigorífico.
*/
programa {
	funcao inicio() {
		// Conjunto de variáveis
		inteiro nb, c=1
		real p, menorp=5000.0, maiorp=0.0, somap=0		
		cadeia id, menorid="", maiorid=""
		
		// Entrada de dados, definindo número de bovinos
		escreva("Qtd. de bois: ")				
		leia(nb)
		
		// Condição: enquanto o contador c for menor ou igual ao número de bois
		enquanto(c<=nb) {					
			// Entrada de dados de cada animal
			escreva("Identificação do ",c,"º boi: ")
			leia(id)					
			escreva("Peso em Kg: ")
			leia(p)
			
			// Teste para avaliar se o presente animal é o de menor peso
			se(p<menorp) {					
				// Se sim, guarda o peso p e o número id
				menorp=p				
				menorid=id
			}
			// Teste para avaliar se o presente animal é o de maior peso
			se(p>maiorp) {					
				// Se sim, guarda as informações
				maiorp=p				
				maiorid=id
			}
			
			// Somatório dos pesos na fórmula somap = somap + p
			somap+=p					
			
			// Incremento do contador
			c++						
			
			// "Limpa" a tela para nova entrada
			limpa()						
		}
		
		// Saída de dados
		escreva("O boi ",menorid," é o mais magro, com ",menorp,"Kg.\n")	
		escreva("O boi ",maiorid," é o mais gordo, com ",maiorp,"Kg.\n")
		escreva("O peso médio de todos os bois é ",somap/nb,".")
	}
}