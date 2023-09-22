package desafio_disciplina;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util {
	
	public static Aluno selecionaAluno (ArrayList<Aluno> lista) {
		String menuAl = "";
		int cont = 1;
		for (Aluno a : lista) {
			menuAl = cont + " - " + a.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuAl));
		return lista.get(escolha-1);
	}
	
	public static Disciplina selectionaDisciplina (ArrayList<Disciplina> lista) {
		String menuDisc = "";
		int cont = 1;
		for (Disciplina d : lista) {
			menuDisc = cont + " - " + d.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuDisc));
		return lista.get(escolha - 1);
	}

}