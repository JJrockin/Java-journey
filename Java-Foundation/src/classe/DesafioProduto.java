package classe;

public class DesafioProduto {
	
	String nome;
	double preco;
	static double desconto = .25;
	
	DesafioProduto (){
		
	}
	
	DesafioProduto (String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	static double precoComDesconto(double preco) {
		return preco * (1 - desconto);
	}
}
