package b_encapsulamento;

public class Pessoa {
		
	 private String nome;
	 private int idade;
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int i) {
		if(idade > 0 && idade < 110) {
			this.idade = i;	
		}
		
	}
	 
	 
}
