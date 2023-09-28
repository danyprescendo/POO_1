package desafio_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Medicamento {
	
	private String nome;
	private String adm;
	private ArrayList<String> contraIndicacao = new ArrayList<String>();
	private ArrayList<String> indicacoes = new ArrayList<String>();
	
	public void cadastrarContraInd(ArrayList<String> contraIndicacoes) {
		setNome(JOptionPane.showInputDialog("Qual a contra indicação?"));
	}
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome do medicamento"));
		setAdm(JOptionPane.showInputDialog("Informe a Administração (Injetável, Tópico ou Oral)"));
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
		return indicacoes;
	}
	public void setIndicacoes(ArrayList<String> indicacoes) {
		this.indicacoes = indicacoes;
	}
	
	
	}
	
