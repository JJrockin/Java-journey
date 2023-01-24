package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(!!condicao1); // "not not"
		System.out.println(!condicao2); // "not" -> !
		
		// Tabelas verdade
		
		// (AND) -> &&
		System.out.println("\nTabela verdade AND");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		// (OR) -> ||
		System.out.println("\nTabela verdade OR");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// (XOR) -> ^
		System.out.println("\nTabela verdade XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// (NOT) -> !
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!false);
		System.out.println(!!false);
		
	}

}
