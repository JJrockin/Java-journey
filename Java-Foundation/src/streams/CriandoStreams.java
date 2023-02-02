package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		// function that receives, but returns nothing
		Consumer<String> print = System.out::print;
//		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		// escolhendo quais elementos do array para imprimir do 1 ao 3 sem incluir o 3
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		System.out.println();
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		// em qualquer ordem, será executada paralelamente
		outrasLangs.parallelStream().forEach(print);
		
//		Stream.generate(() -> "a").forEach(print); lista infinita de elementos "a"
//		Stream.iterate(0, n -> n+1).forEach(println); lista infinita começando em 0
		
		
		
	}

}
