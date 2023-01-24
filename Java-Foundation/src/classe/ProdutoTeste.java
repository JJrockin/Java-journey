package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4567.89, 0.25);
		
		Produto p2 = new Produto();
		p2.nome = "Black Pen";
		p2.preco = 12.48;
		p2.desconto = 0.2;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.preco * (1-p2.desconto);
		double mediaDoCarrinho = (precoFinal1+precoFinal2)/2;
		
		System.out.printf("A média do carrinho é %.2f", mediaDoCarrinho);
		
	}
	

}
