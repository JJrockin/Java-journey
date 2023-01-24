package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		// forma posfixada
		a++; // a = a + 1
		a--; // a = a - 1
		
		// forma prefixada
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--); // precedência, soma 1 a "a", compara com b e então subtrai 1 de b
		
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
