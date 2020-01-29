# Computer Programming

Este repositório tem por objetivo acompanhar o desenvolvimento do aprendizado introdutório ao avançado em Programação.
O trabalho será feito em linguagens de pseudo-código, C++ e em Java, observando:

	- Os códigos estão comentados descrevendo o fluxo do programa e a descrição narrativa da problemática;
	- Os que não estão comentados servem de exercício de leitura da linguagem em questão.

A pasta PRG contém o conteúdo inicial de programação, das descrições narrativas e fluxogramas até C++ passando pelo
pseudocódigo em linguagem Portugol (UNIVALI - PR).

A pasta POO contém o conteúdo sobre programação orientada a objetos, em java. Lembrando que o IDE utilizado para a criação
de projetos em java é o NetBeans, e se faz necessário ler atentamente a documentação em cada código para que funcionem os
efeitos práticos de cada exemplo dado. Um ou mais códigos devem estar nos locais corretos para que tudo ocorra conforme o
esperado.

@LPS

## Fundamentos / Pseudo-código

João Pedro Lima Pacheco da Silva


### Programação & Desenvolvimento

Os computadores e máquinas computacionais inventadas pelo ser humano tem instrumentos desenvolvidos para estabelecer comunicações. Esses instrumentos trabalham as informações que compõem uma mensagem de um ponto de vista organizacional matemático, ou seja, são codificações e decodificações de um simples sinal elétrico dentro um sistema binário.

Para o circuito de informações funcionar, a unidade lógica recebe comandos já prevenidos de comportamentos. As linguagens surgem para facilitar a execução dos comandos por parte dos usuários. Nesse sentido, conseguimos imaginar uma "pilha":

	PC	
	- Baixo Nível
	- Alto Nível
	USUÁRIO


Próximo à Máquina as linguagens são mais trabalhosas, devido à extensão da codificação binária. Como já sabemos, um Byte formado por 8 bits compreende possibilidades suficientes para armazenar números, letras, caracteres especiais, entre outras informações.

Mais próximo ao Usuário, as linguagens elevam-se no sentido de suportar comandos mais eficientes e potencializadores. Sendo assim, menos instruções executam mais funções. Em efeito cascata pensando como letras formam palavras e palavras formam frases, podemos imaginar o quão complexo uma estrutura de binários pode ser. Neste módulo de Programação, trabalharemos algoritmos, ou programas, desenvolvidos para resolver soluções específicas, das mais simples às mais complicadas. Aos poucos acrescentaremos as informações que se farão importantes conforme os problemas apresentados.

		
### Lógica Básica

A estrutura que compõe um código formado por instruções executáveis pode ser formada de várias maneiras. A lógica para estabelecer um padrão simples e poderoso é definida de acordo com uma característica fundamental da leitura física dos dados pela parte da máquina, de maneira linear e progressiva.

Um programa pode ter o seguinte fluxo de execução:
			
	INÍCIO
		Considerações iniciais;
	ENTRADA DE DADOS
		Interação com o usuário;
	CÁLCULO	
		Cálculos estabelecidos conforme problemática;
	DECISÃO LÓGICA
		Definição de curso segundo resultado lógico processado v/f;
	SAÍDA DE DADOS
		Interação com o usuário;
	FIM		
		Finalização do programa (execução finalizada).
		
É claro que dependendo da simplicidade do probelma podem não existir decisões lógicas, ou cálculos, ou até mesmo pode estar ausente a entrada de dados e a saída, mas com esses quatro processos básicos construímos problemas matemáticos complexos. Para resolver uma problemática apresentada, existem algumas maneiras de entender e desenvolver a solução, através de formas de representação (construções):

- Descrição Narrativa

	Nada mais é que a instrução escrita à mão. Se temos um bolo para fazer, a idéia é comparar o algoritimo à uma receita escrita definindo todo o passo a passo para sua execução, e se possível observações e informações úteis que dão origem aos comentários em um código (a ver).

	Se possível, é assim que começamos o desenvolvimento do problema pelo seu enunciado, eludindo todo o passo a passo na descrição dos comandos que serão executados.

- Fluxograma

	O fluxo de execução é um parâmetro interessante para ajudar a entender e trabalhar a solução de um problema qualquer. O desenho das estruturas auxilia na visualização dos "caminhos" que o próprio algoritmo pode tomar.
	
	- INÍCIO/FIM - Dentro de um formato oval-horizontal;
	- ENTRADA - Dentro de um retângulo em formato envelope (com uma das pontas "cortada";
	- DECISÃO - Dentro de um losângulo com duas saídas: verdadeiro e falso;
	- CÁLCULO - Dentro de um retângulo;
	- SAÍDA - Dentro de um retângulo com o lado de baixo ondulado (formato de resma de papel);
	
	Um fluxograma sempre começa no INÍCIO e termina no FIM. As estruturas de DECISÃO sempre devem ser fechadas "de fora para dentro", ou seja, da mais interna até a mais externa, garantindo que a primária englobe a(s) secundária(s) e assim por diante.

	Em suma, um fluxograma apresentará os dados mais básicos, assim como o fluxo ou caminho que a informação percorrerá e suas interações ou alterações.

- Pseudocódigo
	
	O pseudocódigo administrado pelo software chamado Portugol Studio da UNIVALI-PR (entre outros), é um exemplo de código educativo, com carateristicas direcionadas para aprendizado onde os comandos são mais intuitivos, e no próprio vocabulário.

	É claro que as intruções sempre se aplicarão à palavras de comando que expressam exatamente o que fazem, ou o mais próximo disso. Por exemplo em c++ (a ver), o comando "while" em inglês (ou "enquanto" em portugês), expressa a condição temporal de que ENQUANTO alguma expressão lógica definida for verdadeira (ou não), permanecerá executando as instruções que estão contidas dentro da estrutura deste comando.

	Um exemplo simples para construção das duas primeiras formas de representação de um algoritimo feito para resolvê-lo:
		
	Problema:

		Descobrir o resultado da soma de dois números.

	Soluções:

		- Descrição Narrativa:
			1 - Definir primeiro quais os número que serão somados;  
			2 - Somá-los;  
			3 - Exibir o resultado.  
		- Fluxograma
									INÍCIO
			
				1			ENTRADA	->	N1, N2
			
				2			CÁLCULO	->	N1 + N2 = R
			
				3			SAÍDA		->	R
			
									 FIM

Para definirmos uma certa generalidade sobre algoritimos e diferentes linguagens, precisamos conhecer um pouco sobre sintaxe e semântica. São elementos que caracterizam a lógica de expressão das formas verbais e permitem maior controle sobre a informação contida nas mensagens de comunicação, sendo assim, amplia o controle sobre seus comandos nas soluções práticas. Facilita o aprendizado de novas ferramentas reparando nas estruturas e identações. Sintaxe:

	"Parte da gramática que estuda a disposição das palavras na frase e das frases entre sí."

Ou seja, o alvo sempre dos estudos das linguagens envolve observar as palavras/caracteres, ou estruturas, e sua ordem e harmonia no discurso completo. E ainda:

	"Ao emitir uma mensagem verbal, o emissor procura transmitir um significado completo e compeensível."

É essa compreensão que buscamos quando precisamos estudar os mecanismos dos comandos e estruturas para fazê-los funcionar como quisermos, e criar motores de interações altamente funcionais. Para facilitar, sintaxe pode ser pensada como uma forma de design lírico.

Outra importante menção é sobre DECLARAÇÕES. Nada mais são que as palavras escritas já pré-definidas ou reservadas, ou seja, o sistema interpreta essas palavras como funções. Quando você diz algo para o sistema através da escrita deve usar uma linguagem em comum, e se quizer que trabalhe deve dar-lhe os instrumentos. O conjunto básico de instruções de toda unidade lógica garante a matemática da organização e trabalho dos dados ou informações, e como o PC é uma máquina programável, a programação é o que dá sentido e lógica de funcionamento.

### Operadores e Expressões

As expressões são compostas de operadores e compreendem alguns tipos, porém podemos começar com apenas duas delas, e indica-se olhar a seção Ajuda da linguagem em foco para descobrir mais informações úteis. Para manter-se ao básico:

- Aritméticas

	Números como operandos e operadores aritméticos dando sempre como resultado valores numéricos. Lembre-se das regras matemáticas básicas para prioridades e o uso de (), [], {}, entre outras características:
	
		Operadores Aritméticos:  
			+	Adição;  
			-	Subtração;  
			*	Multiplicação;  
			/	Divisão;  
	
- Lógicas 

	Expressões que testam a veracidade ou não das mesmas. Podem resultar em Verdadeiro ou Falso e possuem tais operadores:

	 	Operadores Lógicos:  
			e	 -> conjunção;			V e F = F  
			ou	 -> disjunção;			V ou F = V  
			não -> negação;				não V = F  
		
		Operadores Relacionais:  
			==	Igual;					2 == 2		V  
			>=	Maior ou Igual;				2 >= 2		V  
			<=	Menor ou Igual;				2 <= 2		V  
			!=	Diferente;				2 != 2		F  
			>	Maior;					2  > 2		F  
			<	Menor;					2  < 2		F  

- Atribuições
	
	Como observação extra, as atribuições são nada mais que o direcionamento dos valores que compõem os dados para as variáveis:

		x = 4 <- O valor 4 será levado para o espaço na memória reservado com o endereço "x";  
		x += y		x = x + y  
		x -= y		x = x - y  
		x /= y		x = x / y  
		x *= y		x = x * y  
		x ^= y		x = x ^ y  
		x |= y		x = x | y  
		x %= y		x = x % y  
		x &= y		x = x & y  
		x ++			x = x + 1		<- Incremento (soma 1);  
		x --			x = x - 1		<- Decremento (subtrai 1);  


### Variáveis Simples

Em nome da máquina programável entender como proceder com os dados fornecidos externamente, é necessário que o usuário especifique o tipo da informação que está lhe passando nas instruções. Para cada tipo existe uma configuração diferente de comportamento por parte da máquina. Por exemplo, como podemos somar um número e um nome? Se você separar um lugar para guardar um número, como poderá guardar uma letra no mesmo lugar?

O que acontece em algumas linguagens, é o auto-reconhecimento quando a entrada é feita, porém isso exige mais instruções básicas de software. Em Portugol Studio, ou em C++, é preciso declarar o tipo seguido do nome da variável que deseja estabelecer.
	
Fórmulas:

	comando ( parâmetros )
	comando variavel = valor
	etc...
	
Comandos:

	- inteiro - Valor pertencente ao conjunto dos n. inteiros.
	- Cadeia - Valor é um texto ou uma grande sequência de carácteres.
	- vazio - Sem valor (não é a mesma coisa que zero!), null.
	- Caracter - Valor é apenas UM carácter alfanumérico ou especial (letras, números, pontuações, etc).
	- logico - Retorna verdadeiro ou falso (o valor é usado em operação lógica e só poderá retornar um dos dois resultados).
	- real - Valor pertence ao conjunto dos números reais, ou uma fração decimal possivelmente infinita (números com casas decimais).
	
	Uso:

		inteiro x
		real x, y, z
		cadeia nome
		etc...

### Entrada e Saída

Segundo o manual de instruções do software Portugol Studio, "a instrução de entrada de dados possibilita que o algoritimo capture dados provenientes do ambiente externo e armazene em variáveis.". A comunicação com o usuário é a chave para o controle e para a programação. É através dessa interação que os computadores realizam as funções e trabalhos que designamos.

Comandos:

	- escreva - Escreverá o que tiver entre parênteses na tela. Uso:
		escreva("Texto mostrado.")
		escreva(x," Texto!") <- Valor da variável x e o texto todo entre aspas (espaço também).
										
	- leia - Ao declarar uma variável x e dizer por exemplo que será um número inteiro, se quisermos que o valor desta variável seja definida pelo usuário externo utilizaremos o comando leia. Uso:
		leia(x)
		leia(x,y) <- Serão duas entradas, primeiro a variável x, e após o Enter ser pressionado, y.
						
	- limpa - Em outras linguagens é um comando altamente adaptado. Como o propósito do Portugol Studio é educacional, e quase sempre iremos executar os programas no próprio console ou terminal, é um artifício usado para limpagem de tela, quando precisamos "apagar" o que está escrito para exibir novas saídas. Não precisa de nenhum parâmetro específico entre os parênteses. Uso:
		limpa()


### Estruturas de Controle

Para garantir o desvio intencional do fluxo durante a execução de um algoritimo, utilizamos as estruturas de controle as quais representam pré-decisões definidas pelo programador. Quando se faz necessário executar ações de acordo com os	dados que foram fornecidos pelo próprio programa, utilizamos Laços de Repetição. Pode ser o caso de querer repetir uma ação determinado número de vezes, inclusive podendo controlar e manipular a ordem com que as instruções serão executadas em função dos dados fornecidos.

#### Seleção ou Desvío Condicional

Durante uma execução, podemos encontrar situações onde um conjunto de instruções deverá ser executado caso uma condição seja verdadeira.

Comandos:

- se - Como dizer quando um conjunto de instruções será executado. Uso:  
		se(resposta = "sim") {escreva("Tchau!")}
	
- se-senao - Uma das duas opções será executada. Uso:  
		se(hora >= 6 e hora <= 18) {escreva("É dia.")}  
		senao{escreva(""É noite.)}

- se-senao-se - A partir daí a cadeia escala para mais decisões. Utilizado para definir valores de acordo com limites. Uso:  
		se(nota >= 9) {escreva("A")}  
		senao se(nota >= 7) {escreva("B")}  
		senao se(nota >= 5) {escreva("C")}  
		senao se(nota >= 3) {escreva("D")}  
		senao{escreva("E")}  
		
#### Laços de Repetição

Justamente criar um "Looping" controlado onde uma quantidade de comandos se repete até que uma determinada condição seja verdadeira.

Comandos:

- enquanto - Simples assim, enquanto uma condição for verdadeira, determinadas instruções serão executadas. Uso:  
		enquanto(parar != "sim")  
		{  
			escreva("Deseja parar?")  
			leia(parar)					<- Enquanto o usuário não quiser parar, o programa perguntará novamente, e lerá nova entrada.  
		}
	
- faca-enquanto - Um pouco diferente na sintaxe do enquanto, pois garante que ao menos uma vez o conjunto de instruções dentro da estrutura será executado. O que garante essa situação é que o teste lógico (enquanto) somente é feito no fim da execução do faça. Uso:  
		faca  
		{  
			escreva("Insira o valor do lado: ")  
			leia(lado)  
		}enquanto(lado <= 4)		<- Garante a leitura dos quatro lados do quadrado.

- para - O laço "para" recebe mais parâmetros para trabalhar. Em situações onde o programa necessita de um contador interno por exemplo, existe a condição especial conforme uso: Uso: Tabuada de 3:  
		para(inteiro i = 1; i < 10; i++)  
		{  
			tabuada = i * 3  
			escreva(tabuada," ")  
		}  
	
		*Leia-se: Para um número inteiro i igual a um, enquanto i for menor que dez (valor máximo da tabuada), executam-se as instruções, incrementa-se o valor de i e repete o teste lógico e, conforme resultado, repetem-se as instruções.



Com essas informações básicas já podemos começar a abordar problemas simples para enxergar as soluções nesses formatos. Após, veremos o uso das variáveis compostas. Abaixo é um exemplo de como usar as estruturas de repetição para exibir os mesmos resultados em um ambiente de comando, escrito em C++:

	#include<iostream>
	#include<windows.h>				// Comando Sleep = pausa temporariamente (milisegundos);
	
	using namespace std;
	
	main() {
		int c=0;
		
		while(c<=10) {
			cout<<c<<" "; 
			c++;		// Enquanto(condição);
		}
		
		cout<<"\n";
		c=0;
		Sleep(1000);				// Sleep - 1 segundo;
		
		do{
			cout<<c<<" "; 	
			c++;		// Faça-Enquanto(condição);
		}while(c<=10);
		
		cout<<"\n";
		c=0;
		Sleep(1000);				// Sleep - 1 segundo;
		
		for(int c=0;c<=10;c++) {
			cout<<c<<" ";			// Para(declaração;condição;incremento ou decremento);
		}
	}


## C++

### Validação de Variáveis

Validamos uma variável antes de prosseguir com o código para que o programa responda exatamente como previsto:
	
1 - Deseja executar para uma nova empresa? (s/n): "somente s ou n":
	
	#include<iostream>
	
	using namespace std;
	
	main() {
		setlocale(LC_ALL,"Portuguese");
		char r;
		
		cout<<"Perguntarei se você deseja continuar.\n\n";
		do{
			cout<<"Deseja continuar (s/n)? "; cin>>r;
			if(r!='s' and r!='S' and r!='n' and r!='N') {
				cout<<"Insira s ou n.\n";
			}
		}while(r!='n' and r!='N');
		
		cout<<"OK.";
	}

2 - Testando validação de dados, o programa lê o nome do aluno, o sexo e duas notas. Calcula e mostra uma mensagem informando a média. É executado até que a resposta à pergunta s/n seja n. Realiza procedimentos para:

	1.Sexo apenas m/f;
	2.Nota entre 0 e 10;
	3.s/n aceita s ou S ou n ou N.

	#include<iostream>
	#include<windows.h>
	
	using namespace std;
	
	main() {
		setlocale(LC_ALL,"Portuguese");
		char s, r;
		string n;
		float n1, n2, m;
		
		do{
			cout<<"Nome: "; cin>>n,"\n";
			do{
				cout<<"Nota 1: "; cin>>n1,"\n";
				if(n1<0 or n1>10) {
					cout<<"Insira nota de 0 a 10.\n";
				}
			}while(n1<0 or n1>10);
			
			do{
				cout<<"Nota 2: "; cin>>n2,"\n";
				if(n2<0 or n2>10) {
					cout<<"Insira nota de 0 a 10.\n";
				}
			}while(n2<0 or n2>10);
			
			do{
				cout<<"Sexo: "; cin>>s,"\n";
				if(s!='m' and s!='M' and s!='f' and s!='F') {
					cout<<"Insira m/M ou f/F.\n";
				}
			}while(s!='m' and s!='M' and s!='f' and s!='F');
			
			m=(n1+n2)/2; 
			cout<<"A media foi "<<m<<".\n";
			
			Sleep(1000);		
			
			do{
				cout<<"Deseja continuar (s/n)? "; cin>>r;
				if(r!='s' and r!='S' and r!='n' and r!='N') {
					cout<<"Insira s ou n.\n";
				}
			}while(r!='s' and r!='S' and r!='n' and r!='N');
		}while(r=='s' or r=='S');
		
		cout<<"\nObrigado.";
	}

	
### Variáveis Compostas Homogêneas

São variáveis que comportam mais de uma informação do mesmo tipo, definidas na declaração, pelo usuário ou durante o programa. Parâmetros a serem considerados:

- Vetores (unidimensionais, apenas um índice: linhas). Uso:

	tipo		nome[quantidade de dados ou colunas]

	cadeia vetor[2] = {"a", "b"}  
	inteiro vetor[2] = {32, 44}
	
	Exemplo - Entrada, saída e cálculos:
		
		#include<iostream>
		
		using namespace std;
		
		main() {
			int n[3], np=0, ni=0, nt=0, mn=-99999999;
			float m;
			
			cout<<"Insira 3 números inteiros: ";
			for(int i=0;i<=2;i++) {
				cin>>n[i];
				
				if(n[i]>mn) mn=n[i];

				nt+=n[i];
			}

			m=nt/3.0;
			
			cout<<"\nAo contrário, ";
			
			for(int i=2;i>=1;i--) cout<<n[i]<<", ";
			cout<<n[0]<<".";

			cout<<"\nAo maior dos maiores, "<<mn<<".";
			
			cout<<"\nAos pares, ";
			for(int i=0;i<=1;i++)
				if(n[i]%2==0) {
					cout<<n[i]<<", ";
					np+=1;
				}
			if(n[2]%2==0) {
				cout<<n[2]<<" ";
				np+=1;
			}
			cout<<"(total de "<<np<<" números).";

			cout<<"\nAos ímpares, ";
			for(int i=0;i<=1;i++)
				if(n[i]%2!=0) {
					cout<<n[i]<<", ";
					ni+=1;
				}
			if(n[2]%2!=0) {
				cout<<n[2]<<" ";
				ni+=1;
			}
			cout<<"(total de "<<ni<<" números).";

			cout<<"\nÀ média, "<<m<<"!\n\n";	
		}

- Matriz (bidimensional, dois ou mais índices: linhas e colunas). Uso:

	tipo	nome[qtd. de linhas][qtd. de colunas]  
	real matriz[linhas][colunas]  

	Declarações - "int m[linhas][colunas];"  
	Atribuições - "m[nl][nc]=x;"  

	Estratégia para entrada de dados - Linha por linha ou Coluna por coluna:

		for(l=0;l<nl;l++) {
			for(c=0;c<nc;c++) {
				cout<<"Digite ... : ";
				cin>>m[l][c];
			}
		}

		Onde: nl - número de linhas e nc - número de colunas.  

	Saída de dados - "cout<<endl;" finaliza a linha:

		for(l=0;l<nl;l++) {
			for(c=0;c<nc;c++){
				cout<<m[l][c];
				cout<<endl;"
			}
		}

	Exemplo - Testando Matriz:

		#include<iostream>
		
		using namespace std;
		
		main() {
			int l,c,nl,nc;
			
			cout<<"Número de linhas da matriz: ";
			cin>>nl;

			cout<<"Número de colunas da matriz: ";
			cin>>nc;
			
			int m[nl][nc];

			for(l=0;l<nl;l++)
				for(c=0;c<nc;c++) {
					cout<<"m["<<l<<"]["<<c<<"] : ";
					cin>>m[l][c];
				}

			for(l=0;l<nl;l++) {
				for(c=0;c<nc;c++) cout<<m[l][c]<<"   ";
				cout<<endl;
			}
		}


- Arrays: Tridimensional (camadas de matrizes). Uso:

	Declarações: tipo nome[indice]  
	Atribuição: nome[indice] = <valor>

	Obs.: Índice declarado (quantidade de posições, referências): contagem a partir do zero: 0, 1, 2 ... N, ou seja, a primeira posição é vetor[0];

	
### Rotinas de Classificação (ordens e arranjos)
	
- Código para gerar a sequência de fibonacci em um vetor com dez posições.
	
	Fibonacci - 0 1 1 2 3 5 8 13 ... n=(n-1)+(n-2)
		
	Obs.: Inicialização das primeiras duas posições para seguir a sequência. Biblioteca windows.h permite o comando Sleep (milisegundos).
		
	Saídas Separadas:

		#include<iostream>
		#include<windows.h>
		using namespace std;
		main() {
			int i,f[10]={0,1};
			
			cout<<f[0]<<" "<<f[1]<<" ";

			for(i=2;i<=9;i++) {
				f[i]=f[i-1]+f[i-2];
				cout<<f[i]<<" ";
				Sleep(500);
			}
			
			cout<<"\n";
		}

	Saída única:

		#include<iostream>
		using namespace std;
		main() {
			int i,f[10]={0,1};
			
			for(i=2;i<=9;i++) f[i]=f[i-1]+f[i-2];
			for(i=0;i<=9;i++) cout<<f[i]<<" ";
			
			cout<<"\n";
		}

	Atribuindo os valores iniciais (posições 0 e 1):

		#include<iostream>
		using namespace std;
		main() {
			int i,f[10];
			
			f[0]=0;f[1]=1;
			
			for(i=2;i<=9;i++) f[i]=f[i-1]+f[i-2];
			for(i=0;i<=9;i++) cout<<f[i]<<" ";
			
			cout<<"\n";
		}

- Código para um vetor de tamanho n (lido), e atribui a cada posição do vetor o seu índice elevado ao quadrado.

	Função pow(a,b) onde a=base e b=expoente:

		#include<iostream>
		#include<math.h>
		
		using namespace std;
		
		main() {
			int t;
			cout<<"Digite o tamanho desejado do vetor: ";
			cin>>t;
			
			int v[t];
			for(int c=0;c<=t-1;c++) {
				v[c]=pow(c,2);
				cout<<"v["<<c<<"] = "<<v[c]<<"\n";
			}
		}

- Classificação método "bolha": carrega valores maiores ou menores para a ultima posição por comparação entre dois valores consequentes de modo crescente ou decrescente.
		- Note a inversão de variáveis com x;
		- O intervalo for(int i=0;i<=t-1;i++), o teste vai até a penúltima posiçao, no caso do vetor de t posições;
		- A expressão relacionada ao teste, garante em i<=t-1-c (c inicializado em 0) que as posições do cálculo decresçam, evitando comparações repetidas;
		- Também funciona comparando o código ASC em vetores tipo string;
		- Para ordem decrescente inverta os sinais de maior para menor e decremente.

	Método Bolha:

		#include<iostream>
		
		using namespace std;
		
		main() {
			int c,i,x,t;
			
			cout<<"Digite o tamanho desejado do vetor: ";
			cin>>t;
			
			int v[t];

			for(i=0;i<t;i++) {
				cout<<"v["<<i<<"] : ";
				cin>>v[i];
			}
			
			for(c=0;c<t-1;c++) {
				for(int i=0;i<t-1-c;i++)
					if(v[i]>v[i+1]) {
						x=v[i];
						v[i]=v[i+1];
						v[i+1]=x;
					}
			}
			
			cout<<"Resultado: \n";
			for(i=0;i<t;i++) cout<<"v["<<i<<"] = "<<v[i]<<endl;
		}


### Subprogramas (funções)

Rotinas e programas dentro de uma função principal. Manutenção e clareza do código, pode ser usado mais de uma vez resumindo e padronizando processos para manipular melhor rotinas. Variáveis em subprogramas podem ser do tipo Local, do ponto de aparecimento em diante, ou seja, elas valem do momento que aparecem em diante, mas não serão reconhecidas fora da função nativa. Observar parâmetros em main() e fun(). Declaradas antes da main function. Nomes Técnicos: - Função (existe retorno caracterizado, tipo definido - "int", "char", etc). O parâmetro frase receberá o conteúdo (string, no caso) que será passado pelo programa principal:
		
	#include<iostream>
	
	using namespace std;
	
	void mensagem(string frase) {
		cout<<frase<<endl;
	}
	
	main() {
		cout<<"Testando Subprogramas\n\n";
		mensagem("Yeah!");
	}
			
Procedimento (não retorna valor algum, neutro, sem tipo, "void"):
			
	#include<iostream>
	
	using namespace std;
	
	void mensagem() {
		cout<<"Yeah!\n";
	}
	
	main() {
		cout<<"Testando Subprogramas\n\n";
		mensagem();
	}

Testando com variável: o parâmetro é levado e torna-se a variável, o que flexibiliza a utilidade da função. Aterando o parâmetro altera-se o conteúdo. No caso da função oline, c é o caractere que será utilizado e n a quantidade de repetições do mesmo. Os parâmetros podem ser constantes ou variáveis (se vierem do usuário, por exemplo):

	#include<iostream>
	
	using namespace std;
	
	void mensagem(string frase) cout<<frase<<endl;
	void linha() cout<<"-------------------------------\n";
	void linhapersonalizada(char c,int n) {
		for(int i;i<=n;i++) cout<<c;
		cout<<endl;
	}
	
	main() {
		cout<<"Testando Subprogramas\n\n";
		linha();

		mensagem("Yeah!\n");
		string texto="Oh Yeahhh!\n";
		linha();
		
		mensagem(texto);
		linha();

		cout<<"Digite algo: ";
		cin>>texto;
		cout<<"E eu repito, ";
		mensagem(texto);
		linha();
		
		char letra;
		int qtd;

		cout<<"Insira uma letra: ";
		cin>>letra;
		cout<<"Insira a quantidade: ";
		cin>>qtd;

		linhapersonalizada(letra,qtd+5);
		linhapersonalizada('H',30);	// Funções com parâmetros constantes (A VER).
	}

Retornos:

	#include<iostream>
	
	using namespace std;
	
	int resto(int dividendo,int divisor) {
		int r;
		r=dividendo%divisor;
		return(r);
	}
	
	main() {
		int valor,dd,ds;

		cout<<"Insira o dividendo: ";
		cin>>dd;
		cout<<"Insira o divisor: ";
		cin>>ds;

		valor=resto(dd,ds);
		
		cout<<"Resto = "<<valor<<endl;
	}


## Orientação à Objetos

### Objetos e Classes

Classe define Objeto de características e comportamentos diferentes. Os métodos alteram características.

- Atributos - Características de um Objeto;
- Métodos - Definem comportamentos (funções, rotinas);
	
	Ex.: 
		Pessoa: Classe
		Atributos: Nome, Idade, Peso, Altura;
		Métodos: fazer_aniversário(); -> Muda o atributo Idade, por exemplo;
	
### Linguagens

- Compiladas - Compiladores específicos para cada ambiente;
- Interpretadas - Compila em um tradutor que trabalha com diferentes ambientes;
	
Java não é uma linguagem, e sim uma plataforma. Possue as seguintes divisões:
	
	J2SE Standard Edition
	J2EE Enterprise Edition - Pacotes Empresariais (módulos);
	J2ME Micro Edition - Telefonia, etc;
	Java Web Services
	Java Fx - Efeitos Sonoros

Esta plataforma é composta por dois instrumentos:
		
			Runtime Environment
		JDK + JRE
	Dev Kit

### Código e Sintaxe

Variáveis Primitivas:

- int idade = 10;
- float valor = 1.5;
- double							(aceita int e float)
- char letra = 'a';
- boolean verdade = true;	(verdadeiro ou falso)
- String nome = "João";		(não é primitiva, cabem textos)
	
Escrita básica na tela:
	
	public class Hello{ //Projeto
		public void static main(String[] args) { //Método Principal
			System.out.println("Yeah!"); //Execução
		}
	}
	
Na linguagem Java, é possível atribuir o valor de um tipo de variável a outro tipo de variável, apontando a operação ao compilador. Este processo é chamado de CASTING:
	
	int num;
	num = (int) 1.234;

### Controle de fluxo SWITCH CASE e Entrada de Dados

Switch case Verifica variável e age de acordo com os casos (escolha-caso). Importante não esquecer da linha "break;" para parar a execução quando o teste for verdadeiro. A linha "default" executa se nenhum teste for verdade. Para a entrada de dados é necessário importar a biblioteca Scanner, que é um método consultor.
	
### Classe String
	
Não há limite de tamanho, e suas variáveis guardam referências para objetos (espaços na memória)e não valores. Criação com new:
	
	String x = new String("Segunda-Feira");
	String y = new String("Segunda-Feira");
			
Se compararmos as variáveis x e y (x==y) criadas com "new String", estaríamos comparando os endereços de memória, e a expressão retornaria False. Se os elementos fossem atribuídos sem o "new String", o java retornaria a expressão como True. O método "equals" alcança os valores dentro das referências:
	
	if(x.equals(y)){System.out.println("X e Y são iguais.");}
	else{System.out.println("X e Y são diferentes.");}
			
Vamos à prática.
Comece pelo arquivo chamado 00-start.java, abra-o no editor de texto de sua preferência e leia a documentação inclusa no código para acompanhar o passo a passo e complete a lista.


@LPS