package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = "texto"; // um objeto, tem comportamentos associados
		s.toUpperCase();
		
		int a = 123; // tipo primitivo, s� carrega o valor
		// Wrappers s�o a vers�o objeto dos tipos primitivos
		System.out.println(a);
	}

}
