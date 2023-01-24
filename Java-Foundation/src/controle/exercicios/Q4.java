package controle.exercicios;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// 4. Criar um programa que receba um
//		numero e diga se ele e um numero primo.
		// se um numero não possui divisores alem de 1 e ele mesmo, primo.
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		
		System.out.print("Digite um número para identificar se é primo: ");
		int number = entrada.nextInt();
		
		for (int i=2; i< number; i++) {
			if (number % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero "+ number +" é primo.");
		} else {
			System.out.println("\nO numero "+ number +" não é primo.");
			
		}
		
		
		

		entrada.close();
	}
}
