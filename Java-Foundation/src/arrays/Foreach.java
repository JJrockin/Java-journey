package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = { 9.7, 9.5, 8, 7.3 };
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for (double nota : notas) { // foreach percorre o array completo
			System.out.print(nota + " "); //  sem usar variável de interação
		}
	}

}
