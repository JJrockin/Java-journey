package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.2;
		notasAlunoA[2] = 9;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.printf("A média do aluno é: %.2f", total/notasAlunoA.length);
		
		final double nota3 = 8.8;
		double[] notasAlunoB = {6.9, 7.8, nota3, 10};
		
		double totalAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.printf("\nA média do aluno é: %.2f", totalAlunoB/notasAlunoB.length);
	} 
}
