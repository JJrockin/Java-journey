package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia do aluno: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns");
		}
		
		if (media < 7 && media >= 5.0) {
			System.out.println("Em recupera��o.");
		}
		
		if (media < 5.0 && media >= 0) {
			System.out.println("Reprovado.");
		}
		
		entrada.close();
	}
}
