package agenda;

import java.util.Scanner;

public class Pessoa implements Contato {
	private String nome;
	private String telefone;
	private String email;
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public String dadosFormatados() {
		String dadosFormatados;
		dadosFormatados = "\nNome: " + this.getNome();
		dadosFormatados = dadosFormatados + "\nTelefone: "+ this.getTelefone();
		dadosFormatados = dadosFormatados + "\nEmail: " + this.getEmail();
		return dadosFormatados;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	
	public void alteraNome(){
		System.out.println("Digite o novo nome: ");
		String nome = scanner.next();
		this.setNome(nome);
	}
	
	public void alteraTelefone(){
		System.out.println("Digite o novo telefone: ");
		String tel = scanner.next();
		this.setTelefone(tel);
	}
	
	public void alteraEmail(){
		System.out.println("Digite o novo email: ");
		String email = scanner.next();
		this.setEmail(email);
	}


}