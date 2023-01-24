package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia! \n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 4, 5, 10, 34, 58, 59);
		System.out.printf("Salário: %.1f%n", 1234.589); // %n quebra de linha
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in); // para receber dados digitados no console
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s tem %d anos. %n", nome, idade);
		
		entrada.close(); // usado para fechar o Scanner, economizando recursos na máquina. 
//		System.out.println("\nNome = " + nome);
		
	}
}
