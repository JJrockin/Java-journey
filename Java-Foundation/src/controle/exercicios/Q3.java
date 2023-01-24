package controle.exercicios;

import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args) {
		// duas notas p/ calcular media
		// se media maior que 7 aprovado
		// se entre 4 e 7 em recuperação
		// menor que 4 reprovado
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota parcial 1: ");
		
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a nota parcial 2: ");
		
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media >= 7.0) {
			System.out.println("A média do aluno é " + media);
			System.out.println("Aluno aprovado!");
		} else if (media < 7 && media >= 4) {
			System.out.println("A média do aluno é " + media);
			System.out.println("Aluno em recuperação.");
		} else {
			System.out.println("A média do aluno é " + media);
			System.out.println("Aluno reprovado.");
		}
		

		entrada.close();
	}

}
