package oo.composicao;

public class Carro {
	
	// OneToOne
	final Motor motor;
	
	// assim um carro tem um motor e um motor tem um carro
	// bidirecional
	Carro() {
		this.motor = new Motor(this);
	}
	
	void acelerar () {
		if(motor.fatorInjacao < 2.6) {
			motor.fatorInjacao += 0.4;
		}
	}
	
	void frear () {
		if(motor.fatorInjacao > .5) {
			motor.fatorInjacao -= 0.4;
		}
	}
	
	void ligar () {
		motor.ligado = true;
	}
	void desligar () {
		motor.ligado = false;
	}
	
	boolean estarLigado () {
		return motor.ligado;
	}
	
}
