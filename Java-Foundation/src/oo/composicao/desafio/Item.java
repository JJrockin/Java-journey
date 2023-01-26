package oo.composicao.desafio;

public class Item {
	
	final int qtdDeProdutos;
	final Produto produto; // instanciei o produto
	
	Item (Produto produto, int qtdDeProdutos){
		this.qtdDeProdutos = qtdDeProdutos;
		this.produto = produto;
	}
	
}
