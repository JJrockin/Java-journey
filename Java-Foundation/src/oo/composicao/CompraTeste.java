package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		// OneToMany
		Compra compra1 = new Compra();
		compra1.cliente = "Jorge";
//		compra1.itens.add(new Item("Caneta", 20, 7.45));
//		compra1.itens.add(new Item("Borracha", 12, 3.89));
//		compra1.itens.add(new Item("Caderno", 3, 18.79));
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
//		compra1.adicionarItem(new Item("Livro", 2, 36.98));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		// Só pra mostrar relação bidirecional
		double total = compra1.itens.get(0).compra.obterValorTotal();
		
		System.out.println("O total é R$" + total);
		
		
	}
}
