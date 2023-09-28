package modulo9.classes;

public class Disciplina {
	private String disciplina;
	private double nota;

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota=" + nota + "]";
	}
	
	

}
