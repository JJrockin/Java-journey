package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		// usados para tornar as variáveis primitivas um Objeto para representação
		// orientada a objeto
		// afinal tudo em Java é um objeto hehe
		
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next()); forma de receber dados pelo console
		Integer i = 10000;
		Long l = 100000L; // necessário L de long para não considerar inteiro literal
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l / 3);
		
		Float f = 123.20F; // lembrar de usar o F para indicar float ou será considerado inteiro literal
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
