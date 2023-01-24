package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		String s = "Bom dia!";
 		System.out.println(s); // executa sem problema porque faz parte do
 		                       // pacote padrão do Java "java.lang"
		
		Date d = new Date(); // precisa import de Date
		System.out.println(d);
		
//		JButton botao = new JButton(); usei o ctrl+shift+o para remover o import
		
	}
}
