package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("Toyota ", "Honda ", "Ferrari ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
		System.out.println("\nUsando composi��o...");
		marcas.stream()
		.map(Utilitarios.mauiscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
		
	}
}