package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // implicitamente converte int em double, não há perda de info
		System.out.println(a);
		
		float b = (float) 1.12465768778654; // explicitamente convertemos double pra float pois
		System.out.println(b);              // haverá perda de informações, pois esse double não cabe em float.
		                                    // Java não analisa valores
		                                    // ele analisa o tipo e se vai ter perda, a conversão deve
		                                    // ser explícita, conhecida como CAST
		int c = 340;
		byte d = (byte) c;    // explicita (CAST) não cabe em byte, maior que 127
		System.out.println(d);
		
		double e = 1.99999999999;
		int f = (int) e;  // explícita (CAST) perde, mostra apenas a parte inteira (1)
		System.out.println(f);
		
		double g = 1.12465768778654;
		System.out.println(g);
		
	}
	
}
