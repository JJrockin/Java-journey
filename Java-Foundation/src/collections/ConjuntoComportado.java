package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		// podemos informa no Hashset ou s� add <> que ele infere
//		Set<String> listaAprovados = new HashSet<String>();
		// usando TreeSet, � respeitado a ordem de inser��o de dados
//		Set<String> listaAprovados = new TreeSet<String>();
//		TreeSet<String> listaAprovados = new TreeSet<String>();
		// ainda existe o SortedSet que tbm garantir� exibir na ordem de inser��o
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Bruno");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		
		for(String candidato: listaAprovados ) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
	
		for (int n : nums) {
			System.out.println(n);
			
		}
	}
	

}
