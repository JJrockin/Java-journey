package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		
//		ArrayList<Usuario> lista = new ArrayList<>();
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // conseguimos acessar pelo indíce
		
		// .remove retorna o que foi removido da lista
		System.out.println(">>>> " + lista.remove(1));
		System.out.println(lista.contains(u1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("Tem?? " + lista.contains(new Usuario("Manu")));
		System.out.println("Tem?? " + lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
