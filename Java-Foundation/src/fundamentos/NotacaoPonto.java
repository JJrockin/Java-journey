package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X"; // Tipo que não é primitivo
		s.toUpperCase();

		// Para salvar o valor novo de s todo em maiuscula
		s = s.toUpperCase();
		System.out.println(s);

		// Mudando o valor de s
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!"); // concatenando

		System.out.println(s);

		String x = "Leo".toUpperCase();
		System.out.println(x);

		String y = "Bom dia X".replace("X", "Gui").toUpperCase();
		System.out.println(y);

		System.out.println(y.concat("!!!"));
		System.out.println("Leo ".toUpperCase().concat("!!!"));

		// Tipos primitivos não tem o operador "."

	}
}
