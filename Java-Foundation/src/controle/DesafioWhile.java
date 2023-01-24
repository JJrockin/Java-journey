package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// media de alunos, se nota valida, salva na variavel e soma
		// salva numa variavel a qtd de notas validas digitadas
		// calcula a media
		// condi��o de sa�da, para mostrar o resultado: usu�rio digitou -1
		// notas invalidas solicita que o usuario digite outra

		Scanner entrada = new Scanner(System.in);

		double notaDigitada = 0;
		int numDeAlunos = 0;
		double somaDasNotas = 0;

		System.out.println("Vamos calcular a m�dia dos alunos!");
		while (notaDigitada != -1) {
			System.out.print("Digite a nota do aluno " + (numDeAlunos + 1) + "(ou -1 p/ sair): ");
			notaDigitada = entrada.nextDouble();

			if (notaDigitada <= 10 && notaDigitada >= 0) {
				numDeAlunos = numDeAlunos + 1;
				somaDasNotas = somaDasNotas + notaDigitada;

			} else if (notaDigitada != -1){
					System.out.println("Digite uma nota v�lida");
			}
		}

		double media = somaDasNotas / numDeAlunos;
		System.out.printf("A m�dia das notas dos alunos �: %.2f", media);

		entrada.close();

	}
}
