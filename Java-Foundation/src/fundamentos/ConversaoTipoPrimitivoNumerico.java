package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // implicitamente converte int em double, n�o h� perda de info
		System.out.println(a);
		
		float b = (float) 1.12465768778654; // explicitamente convertemos double pra float pois
		System.out.println(b);              // haver� perda de informa��es, pois esse double n�o cabe em float.
		                                    // Java n�o analisa valores
		                                    // ele analisa o tipo e se vai ter perda, a convers�o deve
		                                    // ser expl�cita, conhecida como CAST
		int c = 340;
		byte d = (byte) c;    // explicita (CAST) n�o cabe em byte, maior que 127
		System.out.println(d);
		
		double e = 1.99999999999;
		int f = (int) e;  // expl�cita (CAST) perde, mostra apenas a parte inteira (1)
		System.out.println(f);
		
		double g = 1.12465768778654;
		System.out.println(g);
		
	}
	
}
