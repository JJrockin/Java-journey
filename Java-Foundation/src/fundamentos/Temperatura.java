package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final int AJUSTE = 32;
		final double FATOR = 5.0/9;
		double F = 87;
		double C = (F - AJUSTE)*FATOR;
		
		System.out.println("A temperatura em °C é " + C +".");

		F = 150;
		C = (F - AJUSTE)*FATOR;
		
		System.out.println("A temperatura em °C é " + C +".");
	}
}
