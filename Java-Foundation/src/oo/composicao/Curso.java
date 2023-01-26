package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	// ManyToMany
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAlunos(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	public String toString () {
		return nome;
	}
}
