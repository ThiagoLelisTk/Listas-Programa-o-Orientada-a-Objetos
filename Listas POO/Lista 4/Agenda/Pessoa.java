package Agenda;

import java.util.Scanner;

public class Pessoa implements Contato {
	private String nome;
	private String telefone;
	private String email;
	Scanner leitor = new Scanner(System.in);
	
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
		String nome = leitor.next();
		this.setNome(nome);
	}
	
	public void alteraTelefone(){
		System.out.println("Digite o novo telefone: ");
		String tel = leitor.next();
		this.setTelefone(tel);
	}
	
	public void alteraEmail(){
		System.out.println("Digite o novo email: ");
		String email = leitor.next();
		this.setEmail(email);
	}


}
