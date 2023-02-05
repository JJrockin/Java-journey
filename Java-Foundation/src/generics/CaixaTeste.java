package generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo");

		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixab = new Caixa<>();
		caixab.guardar(3.1415);
		
		Double coisaB = caixab.abrir();
		System.out.println(coisaB);
	}
}
