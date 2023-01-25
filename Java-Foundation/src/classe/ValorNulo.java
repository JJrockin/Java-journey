package classe;

public class ValorNulo {
	public static void main(String[] args) {
		
		String s1 = ""; // string com valor vazio mas alocada em memoria
		
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() * 100 > 50 ? new Data() : null;
		
		if (d1 != null) {
			d1.mes = 4;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() * 100 > 50 ? "Opa" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("???"));
		}
	}
}
