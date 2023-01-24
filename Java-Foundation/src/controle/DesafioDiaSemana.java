package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		// Domingo = 1 a Sábado = 7
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		
		String day = entrada.next();
		
		if ("domingo".equalsIgnoreCase(day)) {
			System.out.println(1);
		} else if ("segunda".equalsIgnoreCase(day)) {
			System.out.println(2);
		} else if ("terça".equalsIgnoreCase(day) 
				|| "terca".equalsIgnoreCase(day)) {
		    System.out.println(3);
	    } else if ("quarta".equalsIgnoreCase(day)) {
	        System.out.println(4);
        } else if ("quinta".equalsIgnoreCase(day)) {
	        System.out.println(5);
        } else if ("sexta".equalsIgnoreCase(day)) {
	        System.out.println(6);
        } else if("sábado".equalsIgnoreCase(day)
        		|| "sabado".equalsIgnoreCase(day)) {
	        System.out.println(7);
        } else {
        	System.out.println("Dia inválido");
        }
		
		entrada.close();
	}
}
