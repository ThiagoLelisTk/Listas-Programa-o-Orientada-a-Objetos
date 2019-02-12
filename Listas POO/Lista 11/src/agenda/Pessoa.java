package agenda;

import java.io.Serializable;

public class Pessoa implements Comparable<Pessoa>, Serializable{
	String nome; 
	String email; 
	String telefone;
	int contador;

	public Pessoa(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	
	@Override
	public String toString() {
		System.out.println("Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone);
		return null;

	}
	
	@Override
	public int compareTo(Pessoa p) {
		
		return nome.compareToIgnoreCase(p.nome);
	}

}