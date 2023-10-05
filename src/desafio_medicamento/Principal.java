package desafio_medicamento;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	private static ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	public static void main(String[] args) {


		String menu = "1 - Cadastrar medicamento\n"
				+ "2 - Cadastrar pessoa\n"
				+ "3 - Prescrever\n"
				+ "4 - Listar pessoas e seus medicamentos\n\n"
				+ "5 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if(op == 1) {
				Medicamento med = new Medicamento();
				med.cadastra();
				medicamentos.add(med);
				}
			if(op == 2) {
				Pessoa p = new Pessoa();
				p.cadastra();
				pessoas.add(p);
			}
			if(op == 3) {
				JOptionPane.showMessageDialog(null, "Selecione o paciente");
				selecionarP(pessoas);
				selecionarM(medicamentos);
			}

		}while(op != 5);
}
	
	public static Pessoa selecionarP(ArrayList<Pessoa> pessoas) {
			String menuP = "";
			int cont = 1;
			for (Pessoa p : pessoas) {
				menuP = cont + " - " + p.exibirDados()+"\n";
				cont ++;
			}
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuP));
			return pessoas.get(escolha-1);
	}
	public static Medicamento selecionarM(ArrayList<Medicamento> medicamentos) {
			String insmed = "";
			String menuM = "";
			int cont2 = 1;
			for (Medicamento m : medicamentos) {
				menuM = cont2 + " - " + m.exibirDados()+"\n";
				cont2 ++;
			}
			int escolha2 = Integer.parseInt(JOptionPane.showInputDialog(menuM));
			return medicamentos.get(escolha2-1);
			
			
	}
}