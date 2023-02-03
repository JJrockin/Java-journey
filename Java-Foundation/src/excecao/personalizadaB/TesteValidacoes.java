package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		
		try {
			Aluno aluno1 = new Aluno("Ana", 7);
//			Aluno aluno1 = new Aluno("", 7);
//			Aluno aluno1 = new Aluno("Ana", -7);
			Validar.aluno(aluno1);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
//		Validar.aluno(null); // Preciso tratar ou throws pois agora 
//		é checada
		
		System.out.println("Fim ;)");
	}

}
