package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		System.out.println(convidado.getPeso());

		Comida ingrediente1 = new Arroz(.2);
		Feijao ingrediente2 = new Feijao(.1);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso());
		
		Comida sobremesa = new Sorvete(.4);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
		
	}

}
