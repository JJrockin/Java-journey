package oo.heranca.desafio;

public class Lamborghini extends Carro implements Esportivo, Luxo{
	
	private boolean ligarAr = false;
	private boolean ligarTurbo = false;
//	private int airVeloc;
	
	// defino um valor padrao, caso não seja informado
	public Lamborghini() {
		this(280); // usamos this ou super
	}
	
	public Lamborghini(int velocMAX) {
		super(velocMAX);
		setDelta(15);
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligaAr() {
		ligarAr = false;
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	public int getDelta() {
		if(!ligarAr && ligarTurbo) {
			return 35;
			
		} else if(ligarAr && ligarTurbo) {
			return 30;
			
		} else if(!ligarAr && !ligarTurbo) {
			return 20;
			
		} else {
			return 15;
		}
	}

//	@Override
//	public int velocDoAr() {
//		if (airVeloc <= 4) {
//			return airVeloc;			
//		} else {
//			return 4;
//		}
//	}
//
//	public int getAirVeloc() {
//		return airVeloc;
//	}
//
//	public void setAirVeloc(int airVeloc) {
//		this.airVeloc = airVeloc;
//	}
	
	
	
//	void acelerar () {
//		if (veloc + 50 > VELOC_MAX) {
//			veloc = VELOC_MAX;
//		} else {
//			veloc += 50;
//		}
//	}
}
