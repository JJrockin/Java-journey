package fundamentos.operadores;

public class DesafioAritmeticos {
	// exponencial usa Math.pow(num,potencia) que retorna um double
	
	public static void main(String[] args) {
		double a = 3 + 2;
		double b = 6 * a;
		double c = Math.pow(b, 2);
		double d = 3 * 2;
		double A = c / d;
		
		double e = 1 - 5;
		double f = 2 - 7;
		double g = (e * f)/2;
		double B = Math.pow(g, 2);
		
		double h = A - B;
		double numerador = Math.pow(h, 3);
		
		double denominador = Math.pow(10, 3);
		
		int resultado = (int) (numerador / denominador);
		
		System.out.println("O resultado é: " + resultado);
		
	}

}
