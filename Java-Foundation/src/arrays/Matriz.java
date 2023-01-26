package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite quantos alunos serão: ");
		int numDeAlunos = entrada.nextInt();
		System.out.print("Digite quantas notas serão: ");
		int numDeNotas = entrada.nextInt();
		double[][] matriz = new double[numDeAlunos][numDeNotas];
		
		double total = 0;

		for (int a = 0; a < matriz.length; a++) {
			for (int n = 0; n < matriz[a].length; n++) {
				System.out.printf("Digite a nota %d do aluno %d: ",(n + 1),(a + 1));
				matriz[a][n] = entrada.nextDouble();
				total += matriz[a][n];
			}
		}
		double media = total / (numDeAlunos * numDeNotas);
		System.out.println("A média da turma é: " +media);
		
		for(double[] notasDosAlunos : matriz) {
			System.out.println(Arrays.toString(notasDosAlunos));
		}
		entrada.close();

	}
}
