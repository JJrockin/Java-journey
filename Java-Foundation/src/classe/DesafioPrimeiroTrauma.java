package classe;

public class DesafioPrimeiroTrauma {
	

	int a = 2;
	static int b = 3;
	
	public static void main(String[] args) {
		
		// precisa instanciar a variavel para depois acessar "a"
		// pela notação ponto
		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();
		System.out.println(p.a);
		// como b é static, o método main tem acesso a ele
		System.out.println(b);
		
	}

}
