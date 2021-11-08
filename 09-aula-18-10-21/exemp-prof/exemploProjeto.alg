algoritmo PetShop
inicio
	literal nomeProd, tipoProd;
	real precoProd;
	inteiro qtdProd;
	
	escreva("Digite o Nome do Produto: ");
	leia(nomeProd);
	escreva("Digite o tipo produto: ");
	leia(tipoProd);
	escreva("digite o preço do produto");
	leia(precoProd);
	escreva("Quantidade do produto: ");
	leia(qtdProd);
	atualizaEstoqueProduto(nomeProd, tipoProd, qtdProd);
	

fim

void atualizaEstoqueProduto(literal nome, literal tipo, inteiro qtd)
inicio
	
	se(nomeProd == nome e tipoProd == tipo){
		se(qtdProd >= qtd){
		   qtdProd = qtdProd - qtd;
		}
		
	}
	

fim






