package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
//		Consumer<Integer> println = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
//		Function<Integer, String> toBinary = 
//				numero -> Integer.toBinaryString(numero);
		
		UnaryOperator<String> inverse = 
				numero -> new StringBuilder(numero).reverse().toString();
//				numero -> {
//					String rev = "";
//					for(int i = numero.length() - 1; i >= 0; i--)
//					 {
//						rev = rev + numero.charAt(i);
//					 } return rev;
//				};
		
		Function<String, Integer> toInteger =
				numero -> Integer.parseInt(numero, 2);
				// 2 defines the radix (Binary has a 2 radix to convert to integer)
		
//		nums.stream()
//				.map(toBinary)
//				.map(inverse)
//				.map(toInteger)
//				.forEach(println);
				
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverse)
		.map(toInteger)
		.forEach(System.out::println);
				
		
	}
}
