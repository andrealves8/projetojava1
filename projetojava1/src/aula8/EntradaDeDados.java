package aula8;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("DIGITE UM NÚMERO!");

		int num = Integer.valueOf(entrada);

		System.out.println("O NÚMERO DIGITADO FOI: " + num);

	}
}
