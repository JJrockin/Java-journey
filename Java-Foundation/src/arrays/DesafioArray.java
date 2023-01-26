package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite quantas notas serão: ");
		int numDeNotas = entrada.nextInt();
		double[] notas = new double [numDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.print("Digite a nota " + (i+1) + ":");
			notas[i] = entrada.nextDouble();
			
		}

		entrada.close();
		
		double total = 0;
		
		for (double nota : notas) {
			total += nota;
		}
		
		System.out.printf("\nA média do aluno é: %.2f", total/notas.length);
	}
}
