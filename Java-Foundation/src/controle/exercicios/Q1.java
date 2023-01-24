package controle.exercicios;

import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		// 1. Criar um programa que receba um numero
		// e verifique se ele está entre 0 e 10 e par;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número de 0 a 10: ");
		
		int numero = entrada.nextInt();
		int div;


		if (numero >= 0 && numero <= 10) {
			div = numero % 2;
			if (div == 0) {
				System.out.println(numero + " é par");
			} else {
				System.out.println(numero + " é ímpar");
			}
		} else {
			System.out.println("Digite um número válido");
		}

		entrada.close();

	}
}
