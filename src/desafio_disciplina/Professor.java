package desafio_disciplina;

import javax.swing.JOptionPane;

public class Professor {
	
	private String nome;
	private String formacao;
	
	public Professor() {
		cadastra();
	}
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome:"));
		setFormacao(JOptionPane.showInputDialog("Formação:"));
	}
	
	public String exibir() {
		return getNome()+"("+getFormacao()+")";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	

}
