package collections;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("João"));
		usuarios.add(new Usuario("Guilherme"));
		
		System.out.println(usuarios.contains(new Usuario("Guilherme")));
		
		
	}

}
