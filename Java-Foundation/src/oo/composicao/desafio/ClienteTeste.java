package oo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		// cadastro de produtos
		
		Produto p1 = new Produto("Caneta", 1.50);
//		Produto p2 = new Produto("Livro", 24.50);
//		Produto p3 = new Produto("Caderno", 11.59);
		Produto p4 = new Produto("Corretivo", 5.99);
		
		// cadastro do cliente
		Cliente cliente1 = new Cliente("Pedro");
		
		// cadastro das compras
		Compra compra1 = new Compra();
		compra1.adicionarItem(p1, 2);
		compra1.adicionarItem(new Produto("Livro", 24.50), 3);
		compra1.adicionarItem("Lápis", 4.50, 3);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(new Produto("Caderno", 11.59), 4);
		compra2.adicionarItem(p4, 1);
		compra2.adicionarItem("Mouse", 59.90, 1);
		
		cliente1.adicionarCompra(compra1); // melhor!!!
		cliente1.compras.add(compra2);
		
		double totalDeGastos = cliente1.obterValorTotalDasCompras();
		System.out.println("O cliente " + cliente1 + " gastou " 
		+ totalDeGastos);
		
	}

}
