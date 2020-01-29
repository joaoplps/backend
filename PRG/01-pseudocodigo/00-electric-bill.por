/*
 * 	Calcular o valor final do consumo de energia em um período de 30 dias, dado o valor do kw/h.
*/
programa
{
	funcao inicio()
	{
		real C, V
		
		escreva("Digite o consumo em kw/h: ")
		leia(C)
		
		// Verificar se o valor é negativo
		se(C>=0) {
			// Barrar valores muito absurdos
			se(C<99999) {
				// Checar qual será o valor base conforme previsto (menor ou maior que 150)
				se(C<=150) {
					// Realizar cálculo conforme
					V=C*0.2262	
				}			
				senao {
					V=C*0.26531
				}
				
				// Mostrar os resultados
				escreva("O valor do consumo em 30 dias é: R$", V)	
			}
			senao	{
				escreva("O valor digitado é muito alto.")
			}
		}
		// Se C for negativo ou muito alto o programa não irá calcular e terminará
		senao {
			escreva("O valor digitado é negativo.")	
		}
	}
}