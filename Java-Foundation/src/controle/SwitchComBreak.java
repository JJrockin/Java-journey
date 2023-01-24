package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "desconhecido";
//			break; pode ser comentada pq é está já 
//			na ultima linha, mas usando o break podemos mover
//			o "case" default para qualquer "altura" dentro do switch
		}
		
		System.out.println("Conceito " + conceito);

		entrada.close();
		
	}
}
