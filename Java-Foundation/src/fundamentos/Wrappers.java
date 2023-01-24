package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		// usados para tornar as vari�veis primitivas um Objeto para representa��o
		// orientada a objeto
		// afinal tudo em Java � um objeto hehe
		
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next()); forma de receber dados pelo console
		Integer i = 10000;
		Long l = 100000L; // necess�rio L de long para n�o considerar inteiro literal
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l / 3);
		
		Float f = 123.20F; // lembrar de usar o F para indicar float ou ser� considerado inteiro literal
		System.out.println(f);
		
		Double d = 1234.5356;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
	}

}
