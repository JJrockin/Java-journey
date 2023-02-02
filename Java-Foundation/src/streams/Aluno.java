package streams;

public class Aluno {
	
	final String nome;
	final double nota;
	final double assiduidade;
	
	public Aluno (String nome, double nota) {
		this(nome, nota, .75);
	}
	
	public Aluno(String nome, double nota, double assiduidade) {
		this.nome = nome;
		this.nota = nota;
		this.assiduidade = assiduidade;
	}
	
	public String toString() {
		return nome + " tem nota " + nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(assiduidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (Double.doubleToLongBits(assiduidade) != Double.doubleToLongBits(other.assiduidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}
	
	
	
}
