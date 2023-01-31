package oo.heranca;

public class Monstro extends Jogador{

	// esse metodo acessa o de baixo
	// e o de baixo acessa o de super classe
	// construindo assim a hierarquia
	public Monstro () {
		this(0, 0);
	}
	
	Monstro (int x, int y){
		super (x, y);
	}
	
}
