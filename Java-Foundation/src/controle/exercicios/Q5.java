package controle.exercicios;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		// 5. Refatorar o exercicio 04, utilizando a estrutura switch.
		
		Scanner entrada = new Scanner(System.in);

		int contadorDeDivisores = 0;
		System.out.print("Digite um número para identificar se é primo: ");
		int number = entrada.nextInt();
		
		for (int i=2; i< number; i++) {
			if (number % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		case 0:
			System.out.println("\nO numero "+ number +" é primo.");
			break;

		default:
			System.out.println("\nO numero "+ number +" não é primo.");
			
		}

		entrada.close();
	}

}
