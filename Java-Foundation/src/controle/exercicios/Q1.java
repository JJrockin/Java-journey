package controle.exercicios;

import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		// 1. Criar um programa que receba um numero
		// e verifique se ele est� entre 0 e 10 e par;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um n�mero de 0 a 10: ");
		
		int numero = entrada.nextInt();
		int div;


		if (numero >= 0 && numero <= 10) {
			div = numero % 2;
			if (div == 0) {
				System.out.println(numero + " � par");
			} else {
				System.out.println(numero + " � �mpar");
			}
		} else {
			System.out.println("Digite um n�mero v�lido");
		}

		entrada.close();

	}
}
