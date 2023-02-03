package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
			
		} catch (Exception excecao) { // tratamento gen�rico
			System.out.println("Ocorreu um erro no momento"
					+ " de imprimir o nome do aluno.");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) { // tratamento espec�fico
//			e.printStackTrace();
			System.out.println("Ocorreu o erro: " + e.getMessage());
		} // assim ser� mais pr�tico de colocar num log (logging)
		// (salvar num arquivo (log de erros))
		
		System.out.println("Fim ;)");
		
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
