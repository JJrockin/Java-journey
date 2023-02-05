package generics;

public class CaixaObjeto {
	
	private Object coisa;
	
	// setter
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	// getter
	public Object abrir() {
		return coisa;
	}

}
