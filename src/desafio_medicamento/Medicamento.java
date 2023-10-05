package desafio_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Medicamento {
	
	private String nome;
	private String adm;
	private ArrayList<String> contraIndicacao = new ArrayList<String>();
	private ArrayList<String> indicacao = new ArrayList<String>();
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do medicamento"));
		setAdm(JOptionPane.showInputDialog("Informe a Administração (Injetável, Tópico ou Oral)"));
		String continua = "";
		do {
			String c = new String();
			c = JOptionPane.showInputDialog("Contraindicação");
			contraIndicacao.add(c);
			continua = JOptionPane.showInputDialog("Incluir mais Contraindicações?(S/N)");
		}while(continua.equalsIgnoreCase("S"));
		String continua2 = "";
		do {
			String i = new String();
			i = JOptionPane.showInputDialog("Indicações");
			indicacao.add(i);
			continua2 = JOptionPane.showInputDialog("Incluir mais Indicações?(S/N)");
		}while(continua2.equalsIgnoreCase("S"));
	}
	
	public String exibirDados() {
		return getNome()+", Contra Indicações: "+getContraIndicacao()+" Indicações "+indicacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAdm() {
		return adm;
	}
	public void setAdm(String adm) {
		this.adm = adm;
	}
	public ArrayList<String> getContraIndicacao() {
		return contraIndicacao;
	}
	public void setContraIndicacao(ArrayList<String> contraIndicacao) {
		this.contraIndicacao = contraIndicacao;
	}
	public ArrayList<String> getIndicacoes() {
		return indicacao;
	}
	public void setIndicacoes(ArrayList<String> indicacoes) {
		this.indicacao = indicacoes;
	}
	
	
	}
	
