package controle.exercicios;

import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		
//	2. Criar um programa informa se o ano atual e um ano bissexto
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um ano: ");
		
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);
		
		if (bissexto == true) {
			System.out.println("O ano " + ano + " é bissexto.");
		} else {
			
			System.out.println("O ano " + ano + " não é bissexto.");
		}

		entrada.close();
	}
}
