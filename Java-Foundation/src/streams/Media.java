package streams;

public class Media {
	
	private double total;
	private int qtd;
	
	// assim o metodo retorna um valor do tipo media
	public Media adicionar(double valor) {
		total += valor;
		qtd++;
		return this;
	}
	
	public double getValor() {
		return total / qtd;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.qtd = m1.qtd + m2.qtd;
		return resultante;
		
	}
}
