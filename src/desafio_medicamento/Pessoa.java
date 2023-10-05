package desafio_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private String sintoma;
	private ArrayList<String> condSaude = new ArrayList<String>();
	private Medicamento medicamentos;
	
	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome:"));
		setSintoma(JOptionPane.showInputDialog("Qual o sintoma:"));
		String continua = "";
		do {
			String c = new String();
			c = JOptionPane.showInputDialog("Condição de Saúde");
			condSaude.add(c);
			continua = JOptionPane.showInputDialog("Incluir mais condições?(S/N)");
		}while(continua.equalsIgnoreCase("S"));
		
	}
	
	public String exibirDados() {
		return getNome()+", Sintomas: "+getSintoma()+" Condições "+condSaude;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public ArrayList<String> getCondSaude() {
		return condSaude;
	}
	public void setCondSaude(ArrayList<String> condSaude) {
		this.condSaude = condSaude;
	}
	public Medicamento getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(Medicamento medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	

}
