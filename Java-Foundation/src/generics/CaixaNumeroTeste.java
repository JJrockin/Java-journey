package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Integer> n1 = new CaixaNumero<>();
		n1.guardar(123);
		
		System.out.println(n1.abrir());
		
		CaixaNumero<Double> n2 = new CaixaNumero<>();
		n2.guardar(2.34);
		
		System.out.println(n2.abrir());
	}
}
