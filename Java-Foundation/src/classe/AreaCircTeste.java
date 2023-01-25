package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(5);
		// usando o static no metodo area e no atributo PI na classe AreaCirc
		System.out.println(AreaCirc.area(5)); // acessando o metodo pela classe
		System.out.println(a1.area()); // usando o metodo sem static
		System.out.println(AreaCirc.PI); // acessando o atributo pela classe
		System.out.println(Math.PI); // PI já existe na classe Math
	}
}
