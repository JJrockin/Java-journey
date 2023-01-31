package oo.heranca.desafio;

public interface Luxo {
	
	void ligarAr();
	void desligaAr();
	
	default int velocDoAr() {
		return 1;
	}
	
}
