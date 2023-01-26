package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Set heterogeneo ou homogeneo, nao aceita duplicacao
		// Pode ser ordenado porem nao por padrao
		// n�o � indexado
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // todos os primitivos s�o convertidos
		conjunto.add(1);  // int -> Integer // para objeto pelo seu Wrapper
		conjunto.add("Teste");
		conjunto.add('x'); // char -> Character

		System.out.println("Tamanho � " + conjunto.size());

		conjunto.add("teste");
		System.out.println("Tamanho � " + conjunto.size());

		conjunto.add("Teste"); // n�o aceita repeti��o entao nao add
		System.out.println("Tamanho � " + conjunto.size());

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

		// interse��o

		conjunto.retainAll(nums);
		System.out.println(conjunto);

		HashSet conjunto2 = new HashSet();

		conjunto2.add(1.2);
		conjunto2.add(true);
		conjunto2.add(1);
		conjunto2.add("Teste");
		conjunto2.add('x');

		// jun��o de conjuntos

		conjunto2.addAll(nums);
		System.out.println(conjunto2);

	}
}
