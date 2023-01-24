package fundamentos;

import java.util.Scanner;


public class DesafioConversao {
	// usar Scanner, pegar 3 Strings usando nextLine
	// m�dia de 3 salarios, seus valores podem ser representados
	// com virgula ou ponto
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro sal�rio: ");
		String salario1 = entrada.nextLine().replace(",",".");
		
		System.out.print("Digite o segundo sal�rio: ");
		String salario2 = entrada.nextLine().replace(",",".");
		
		System.out.print("Digite o terceiro sal�rio: ");
		String salario3 = entrada.nextLine().replace(",",".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);
		
		double media = (s1 + s2 + s3)/3;
		System.out.println("A m�dia salarial �: " + media);
		
		entrada.close();
	}
}
