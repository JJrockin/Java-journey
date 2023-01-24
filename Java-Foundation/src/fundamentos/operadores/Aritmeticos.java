package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.5;  // implicita double type
		double y = 44.22;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 45;
		int b = 20;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // calcula como inteiros
		System.out.println(a / (double) b); // converte com CAST o int em double
		
		System.out.println(a % b); // pega o resto da divisão de a / b
		
	}

}
