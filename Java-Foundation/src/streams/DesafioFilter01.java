package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter01 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.9, .75);
		Aluno a2 = new Aluno("Phael", 9.5, .90);
		Aluno a3 = new Aluno("Bia", 2.5, 1);
		Aluno a4 = new Aluno("Pedro", 8.6, .60);
		Aluno a5 = new Aluno("Gui", 5.7, .86);
		Aluno a6 = new Aluno("Jera", 10, .8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> assiduo = a -> a.assiduidade >= .75;
		Function<Aluno, String> situacao = a -> a.nome + ", Parabéns pela aprovação!";
		
		alunos.stream()
			.filter(aprovado)
			.filter(assiduo)
			.map(situacao)
			.forEach(System.out::println);

	}

}
