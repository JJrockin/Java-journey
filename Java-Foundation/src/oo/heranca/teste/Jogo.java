package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
//		Jogador j1 = new Jogador();
		Jogador heroi = new Heroi(10, 10);
//		heroi.x = 10;
//		heroi.y = 10;
		
//		Jogador j2 = new Jogador();
//		Podemos criar Monstro passando os valores 
//		como em heroi ou não
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println("O heroi tem de vida ==> " + heroi.vida);
		System.out.println("O monstro tem de vida ==> " + monstro.vida);
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		monstro.atacar(heroi);

		System.out.println("O heroi tem de vida ==> " + heroi.vida);
		System.out.println("O monstro tem de vida ==> " + monstro.vida);
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
		
//		System.out.println(j1.y);
//		System.out.println(j1.x);
		
	}
	

}
