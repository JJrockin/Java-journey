package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3 ,4 ,5, 6);
		
		// como visto antes, aqui é necessário fazer um cast
		String ultimoLangs1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimoLangs1);
		
		Integer ultimoNums1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNums1);
		
		String ultimoLangs2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimoLangs2);
		
		// podemos explicitar o type que o método recebe mas não é necessário
		Integer ultimoNums2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimoNums2);
		
	}
}
