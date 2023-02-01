package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 6.50, .05);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Notebook", 2895.90, .30);
		Produto p3 = new Produto("Caderno", 16.59, .15);
		Produto p4 = new Produto("Borracha", 2.50, .05);
		Produto p5 = new Produto("Lápis", 4.89, .1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
