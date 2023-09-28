package modulo9.executavel;

import javax.swing.JOptionPane;

import modulo9.classes.Aluno;
import modulo9.classes.Disciplina;

public class Main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		String nomeAluno = JOptionPane.showInputDialog("NOME DO ALUNO?");
		String matriculaAluno = JOptionPane.showInputDialog("NÚMERO DE MATRÍCULA?");

		aluno.setNome(nomeAluno);
		aluno.setMatricula(Integer.valueOf(matriculaAluno));

		for (int pos = 1; pos <= 3; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("NOME DA DISCIPLINA " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("NOTA DA DISCIPLINA" + pos + "?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Integer.valueOf(notaDisciplina));

			aluno.getDisciplinas().add(disciplina);
		}

		System.out.println(aluno);

	}

}
