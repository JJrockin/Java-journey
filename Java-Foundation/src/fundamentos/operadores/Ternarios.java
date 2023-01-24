package fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 7.5;
		
		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
		// condição (true/false) ? (se true) : (se false)
		System.out.println("O aluno está " + resultadoFinal);
		
		
	}

}
