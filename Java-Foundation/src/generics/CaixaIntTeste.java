package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt caixa1 = new CaixaInt();
		// e assim definimos Caixaint como um tipo normal
		caixa1.guardar(10);
		Integer coisa1 = caixa1.abrir();
		System.out.println(coisa1);
		
	}
}
