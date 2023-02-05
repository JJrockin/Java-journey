package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		
		// fa�o o casting e precisa fazer corretamente
		// para evitar erro de execu��o
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ol�");
		
//		Double coisaB = (Double) caixaB.abrir();
		// linha acima gera um erro de ClassCastException na execu��o
		// afinal o valor � uma String, n�o um double,
		// mas compila. � na execu��o que o erro aparece
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
		
	}
}
