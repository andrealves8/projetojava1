package modulo9.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int matricula;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double getMedia() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();

		}
		return somaNotas / disciplinas.size();
	}

	public boolean getStatus() {
		if (getMedia() > 7) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", disciplinas=" + disciplinas + ", média="
				+ getMedia() + ", status=" + getStatus() + "]";
	}

	
	

}
