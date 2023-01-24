package fundamentos.operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b acrescenta variável b em c e armazena em c
		c -= a; // c = c - a
		c *= b; // c = c * b
		c /= a; // c = c / a
		
		System.out.println(c);
		
		c %= 2; // c = C % 2 (resta da div) resultado será 0 ou 1, se 0, o numero é par, se 1, impar
		System.out.println(c);
		
	}

}
