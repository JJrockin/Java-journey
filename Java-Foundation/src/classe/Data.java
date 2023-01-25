package classe;

public class Data {
	
	// criar 3 atributos dia, mes e ano
	
	int dia;
	int mes;
	int ano;
	
	Data () {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // this() como metodo, um construtor chama o outro
	}
	
//	Data(int diaInicial, int mesInicial, int anoInicial){
//		dia = diaInicial;
//		mes = mesInicial;
//		ano = anoInicial;
//	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia; // this. aponta para o valor da instancia
		this.mes = mes; // que o construtor recebe
		this.ano = ano;
	}
	
	String dataFormatada() {
		
		String sign = "/";
		String resultado = dia+sign+mes+sign+ano;
		return resultado;
	}
	
	// como o prof fez
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // variavel local
		return String.format(formato, this.dia, mes, ano);
	}
	
	// outra forma mas que funciona apenas no terminal Eclipse, inviável
	// para aplicações reais, pois pelo uso do void não retorna nada
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada()); 
		// chamamos um metodo dentro do outro
	}

}
