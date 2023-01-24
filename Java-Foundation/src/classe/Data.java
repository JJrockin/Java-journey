package classe;

public class Data {
	
	// criar 3 atributos dia, mes e ano
	
	int dia;
	int mes;
	int ano;
	
	Data () {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String dataFormatada() {
		
		String sign = "/";
		String resultado = dia+sign+mes+sign+ano;
		return resultado;
	}
	
	// como o prof fez
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	// outra forma mas que funciona apenas no terminal Eclipse, inviável
	// para aplicações reais, pois pelo uso do void não retorna nada
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada()); 
		// chamamos um metodo dentro do outro
	}

}
