package classe;

public class DesafioProdutoTeste {
	
	public static void main(String[] args) {
		
		DesafioProduto p1 = new DesafioProduto("Book", 24.50);
		DesafioProduto.desconto = .30;
		
		var p2 = new DesafioProduto();
		p2.nome = "Desk";
		p2.preco = 260.00;
		
		System.out.println("Book on sale costs " + p1.precoComDesconto());
		System.out.println("Desk on sale costs " + p2.precoComDesconto());
		System.out.println(DesafioProduto.precoComDesconto(24.50));
	}

}
