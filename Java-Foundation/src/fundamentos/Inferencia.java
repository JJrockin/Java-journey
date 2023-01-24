package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.5;
		System.out.println(a);
		
		a = 12; // int está dentro de double e por isso funciona mas o inverso não.
		System.out.println(a);

		var b = 4.5; // sem determinar qual o tipo da variavel, o java vai 
                     //	inferir que é double pelo
					 // valor inserido
		System.out.println(b);

		var c = "Texto"; // aqui infere que é do tipo String
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);
		
		double d; // declarei a variável
		d = 123.45; // inicializei a variável
		System.out.println(d);
		
		// não funciona com "var" precisamos declarar e inicializar
		// na mesma linha.
	}
}
