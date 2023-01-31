package oo.heranca.desafio;

public class Carro {
	
	public final int VELOC_MAX;
	protected int veloc;
	private int delta = 5;
	
	Carro (int velocMax) {
		VELOC_MAX = velocMax;
	}
	
	public void acelerar () {
		if (veloc + getDelta() > VELOC_MAX) {
			veloc = VELOC_MAX;
		} else {
			veloc += getDelta();
		}
	}
	public void frear () {
		if(veloc >= 5) {
			veloc -= 5;
			
		} else {
			veloc = 0;
		}
	}
	
	public String toString () {
		return "Velocidade atual é " + veloc + "Km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
}
