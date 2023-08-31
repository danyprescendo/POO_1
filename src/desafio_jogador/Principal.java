package desafio_jogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import desafio_1.Carro;

public class Principal {
	
  public static void main(String[] args) {
	  ArrayList<Jogador> lista = new ArrayList<Jogador>();
	  
	  String menu = "1 - Cadastrar jogador\n"
				  + "2 - Buscar jogadores por time\n"
				  + "3 - Buscar artilheiro do campeonato\n"
				  + "4 - Buscar qual time fez mais gols\n\n"
				  + "5 - Sair";
	  int op = 0;
	  do {
		  op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		  
		  if(op == 1) {
			  Jogador j = new Jogador();
			  	  j.cadastrar();{
				  lista.add(j);
		  }
			  	  
		  if(op == 2) {
			  buscaPorTime(lista);
		  }
			  	  
		
		  }
	  }while(op!=5);
	
  }
  
  static void buscaPorTime(ArrayList<Jogador> lista) {
	  String time = JOptionPane.showInputDialog("Time:");
	  String dados = "";
	  for( Jogador j : lista) {
		  if(j.getNome().equalsIgnoreCase(time)) {
			  dados += j.exibir() + "\n";
		  }
	  }
	  
  	}

}
  
