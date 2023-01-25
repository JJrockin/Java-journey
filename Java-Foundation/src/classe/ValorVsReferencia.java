package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(5,6,1930);
		Data d2 = d1;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		valorDeDataReformatada(d2); // como é atribuição por referencia, muda o objeto
		// e acessando por d1 ou d2 exibe o mesmo valor
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		double c = 5;
		mudarPrimitivo(c);
		
		System.out.println(c); // o primitivo não muda pois a atribuição é por valor
		
	}
	
	static void valorDeDataReformatada (Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void mudarPrimitivo (double c) {
		c++;
	}
}
