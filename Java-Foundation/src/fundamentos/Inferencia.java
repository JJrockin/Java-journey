package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.5;
		System.out.println(a);
		
		a = 12; // int est� dentro de double e por isso funciona mas o inverso n�o.
		System.out.println(a);

		var b = 4.5; // sem determinar qual o tipo da variavel, o java vai 
                     //	inferir que � double pelo
					 // valor inserido
		System.out.println(b);

		var c = "Texto"; // aqui infere que � do tipo String
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);
		
		double d; // declarei a vari�vel
		d = 123.45; // inicializei a vari�vel
		System.out.println(d);
		
		// n�o funciona com "var" precisamos declarar e inicializar
		// na mesma linha.
	}
}
