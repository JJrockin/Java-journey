package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Paulo", 35);
		p1.setIdade(230);
		
		System.out.println(p1);
		System.out.println("Tenho " + p1.getIdade() + " anos.");
		System.out.println(p1.getNomeCompleto());
		
	}

}
