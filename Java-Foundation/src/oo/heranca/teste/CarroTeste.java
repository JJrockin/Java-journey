package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Gol;
import oo.heranca.desafio.Lamborghini;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Lamborghini c1 = new Lamborghini(400);
		Carro c2 = new Gol(180);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.ligarTurbo();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Ferrari: " + c1);

		c1.ligarAr();
		c1.acelerar();
		System.out.println("Ferrari: " + c1);
		
		c1.desligarTurbo();
		c1.acelerar();
		System.out.println("Ferrari: " + c1);
		System.out.println("O ar está na velocidade: " + c1.velocDoAr());
		
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		System.out.println("Gol: " + c2);
		c2.frear();
		System.out.println("Gol: " + c2);
		
	}
}
