package generics;

public class Caixa<T> {
    
	private T coisa;
	
	// setter
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	// getter
	public T abrir() {
		return coisa;
	}
}
