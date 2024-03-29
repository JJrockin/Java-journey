package excecao;

public class Causa {
	
	public static void main(String[] args) {
		
		try {
//			metodoA(new Aluno("Ana", 7));
			metodoA(null);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getCause().getMessage());
		}
		
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno est� NUUUULO!");
		}
		
		System.out.println(aluno.nome);
	}
}
