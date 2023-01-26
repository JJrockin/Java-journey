package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Pedro");
		Aluno aluno2 = new Aluno("Jorge");
		Aluno aluno3 = new Aluno("Angel");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAlunos(aluno1);
		curso1.adicionarAlunos(aluno2);
		
		curso2.adicionarAlunos(aluno1);
		curso2.adicionarAlunos(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for (Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no " +
		curso3.nome + "...");
			System.out.println(" ...e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		// alunos que estao em Java (curso posição 0) do aluno1
		System.out.println(aluno1.cursos.get(0).alunos);
		// cursos que o aluno 0 do curso2 esta matriculado
		System.out.println(curso2.alunos.get(0).cursos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}
}
