package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Set heterogeneo ou homogeneo, nao aceita duplicacao
		// Pode ser ordenado porem nao por padrao
		// não é indexado
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // todos os primitivos são convertidos
		conjunto.add(1);  // int -> Integer // para objeto pelo seu Wrapper
		conjunto.add("Teste");
		conjunto.add('x'); // char -> Character

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("teste");
		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("Teste"); // não aceita repetição entao nao add
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		// se encontra, retorna true e remove

		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains('X'));
		// tbm true ou false

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(conjunto);
		System.out.println(nums);

		// interseção

		conjunto.retainAll(nums);
		System.out.println(conjunto);

		HashSet conjunto2 = new HashSet();

		conjunto2.add(1.2);
		conjunto2.add(true);
		conjunto2.add(1);
		conjunto2.add("Teste");
		conjunto2.add('x');

		// junção de conjuntos

		conjunto2.addAll(nums);
		System.out.println(conjunto2);

	}
}
