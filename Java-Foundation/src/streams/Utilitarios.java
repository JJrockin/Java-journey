package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	// garanties no instance can be created for this class
	private Utilitarios() {
		
	}
	
	public final static UnaryOperator<String> mauiscula =
			n -> n.toUpperCase();
			
	public final static UnaryOperator<String> primeiraLetra =
			n -> n.charAt(0) + "";
			
	public final static String grito(String n) {
		return n + "!!! ";
	}
	
}
