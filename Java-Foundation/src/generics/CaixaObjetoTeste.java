package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		
		// faço o casting e precisa fazer corretamente
		// para evitar erro de execução
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
//		Double coisaB = (Double) caixaB.abrir();
		// linha acima gera um erro de ClassCastException na execução
		// afinal o valor é uma String, não um double,
		// mas compila. É na execução que o erro aparece
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
		
	}
}
