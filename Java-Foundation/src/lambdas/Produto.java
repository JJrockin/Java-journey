package lambdas;

public class Produto extends Object{ // como padrao toda classe extends Object
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
//		super(); porque extends Object tem esse elemento no construtor auto-generated
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
	    return nome + " tem o preço de " + precoFinal;
	}
	
}
