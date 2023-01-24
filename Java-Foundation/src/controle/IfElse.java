package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog
				("Digite um numero inteiro:");
		int number = Integer.parseInt(numero);
		
		if (number > 5) {
			System.out.println("Parabéns!");
		} else {
			System.out.println("Meus pêsames.");
		}
		
	}

}
