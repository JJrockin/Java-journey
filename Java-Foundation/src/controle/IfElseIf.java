package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média do aluno: ");
		
		double media = entrada.nextDouble();
		
		if (media > 10 || media < 0) {
			System.out.println("Nota inválida!");
		} else if (media >= 8.1) {
			System.out.println("Conceito A");
		} else if (media >= 6.1) {
			System.out.println("Conceito B");
		} else if (media >= 4.1) {
			System.out.println("Conceito C");
		} else if (media >= 2.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}
		
		System.out.println("Fim!");
		entrada.close();
	}

}
