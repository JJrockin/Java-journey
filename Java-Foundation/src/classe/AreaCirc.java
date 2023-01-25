package classe;

public class AreaCirc {
	
	double raio;
	// atributo static pertencente a classe
	final static double PI = 3.1415; // garante que o valor de pi será
	// pertencente a classe e imutável
	
	// construtor
	AreaCirc (double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	// metodo static pertencente a classe
	static double area (double raio) {
		return PI * Math.pow(raio, 2);
	}
	
}
