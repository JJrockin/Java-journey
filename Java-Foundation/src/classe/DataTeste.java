package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data day1 = new Data();

		var day2 = new Data(5, 12, 1596); // por inferencia
		
		var day3 = new Data(); // por inferencia
		day3.dia = 6;
		day3.mes = 5;
		day3.ano = 1993;
		
		var day4 = new Data(); // por inferencia
		day4.dia = 23;
		day4.mes = 1;
		day4.ano = 2023;
		
		String dataFormatada4 = day4.obterDataFormatada();
		
		System.out.println(day1.dataFormatada());
//		System.out.printf("%d/%d/%d\n", day1.dia, day1.mes, day1.ano);
		System.out.println(day2.obterDataFormatada());
		
		day3.imprimirDataFormatada();
		System.out.println(dataFormatada4);
		
	}
}
