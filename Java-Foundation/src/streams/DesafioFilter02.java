package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("PC", 2569.56, .35, 0);
		Produto p2 = new Produto("Notebook", 3459.89, .25, 0);
		Produto p3 = new Produto("Book", 235.67, .32, 10);
		Produto p4 = new Produto("Desk", 1059.99, .40, 0);
		Produto p5 = new Produto("Kettlebell", 159.90, .3, 50);
		Produto p6 = new Produto("PS5", 1999.90, .15, 100);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> desconto = d -> d.desconto >= .3;
		Predicate<Produto> frete = f -> f.frete == 0;
		Function<Produto, String> situacao =
				pf -> {
					double preco = (pf.preco * (1-pf.desconto));
					double precoArredondado =
					Double.parseDouble(String.format("%.2f", preco).replace(',', '.'));
					return pf.nome + " custando " 
					+ "R$" + precoArredondado
					+ " está na Super Promo com frete grátis!";
				};
		// pipeline de execução
		produtos.stream()
			.filter(desconto)
			.filter(frete)
			.map(situacao)
			.forEach(System.out::println);
	}
}
