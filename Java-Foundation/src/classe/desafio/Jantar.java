package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Carlos", 82);
		
		Comida comida1 = new Comida("Feijão", .250);
		
		Comida comida2 = new Comida("Arroz", .250);
		
		System.out.println(p1.apresentar());
		
		p1.comer(comida1);
		p1.comer(comida2);
		
		System.out.println(p1.apresentar() + " (Depois de comer)");
		
		
	}

}
