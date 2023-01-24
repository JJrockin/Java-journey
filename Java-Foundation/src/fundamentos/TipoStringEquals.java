package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		String s1 = new String ("2");
		System.out.println("2" == s1); // não compara os valores
		
		System.out.println(s1.equals("2")); // compara o conteúdo de s1
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		String s2 = entrada.nextLine(); // next remove espaços vazios
		// nextLine pega a linha toda e por isso usa o trim() para
		// remover os espaços, caso precise
		System.out.println("o amor é bom".equals(s2.trim()));
		System.out.println("o amor é bom".equals(s2));
		
		entrada.close();
		
	
		
		
	}
}
