package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		// retorno um boolean (true or false)
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3899.98, .15);
		
		System.out.println(isCaro.test(produto)); // testamos se o produto é caro
		
	}

}
