package desafio_livro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Livro {
	
	private String titulo;
	private String autor;
	private double preco;
	public ArrayList<Livro> livros = new ArrayList<Livro>();
	
	
	public void cadastrar() {
		setTitulo(JOptionPane.showInputDialog("Título do Livro"));
		setAutor(JOptionPane.showInputDialog("Nome do Autor (1 à 4)"));
		setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do livro")));
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
	
}
