package fundamentos;

import javax.swing.JOptionPane;

public class DesafioDeModulo {
	
	public static void main(String[] args) {
		// Calculadora
		// Ler num1
		// Ler num2
		// Ler operacao a ser realizada (+ - * / %)
		
		String num1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
		double numero1 = Double.parseDouble(num1);
		
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero:");
		double numero2 = Double.parseDouble(num2);
		
		String operador = JOptionPane.showInputDialog("Digite a operacao desejada:");
		
		double resultado = "+".equals(operador) ? numero1 + numero2 : 0;
		 resultado = "-".equals(operador) ? numero1 - numero2 : resultado;
		 resultado = "*".equals(operador) ? numero1 * numero2 : resultado;
		 resultado = "/".equals(operador) ? numero1 / numero2 : resultado;
		 resultado = "%".equals(operador) ? numero1 % numero2 : resultado;
		System.out.printf("%.2f %s %.2f = %.2f", numero1, operador, numero2, resultado);
		
		
		
	}

}
