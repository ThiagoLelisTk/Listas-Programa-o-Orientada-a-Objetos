package Agenda;

import java.util.Scanner;

public class Professor extends Pessoa {
	private String Registro;
	private String quantidade;
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public String dadosFormatados() {
		String d = super.dadosFormatados();
		d = d + "\nRegistro: " + getRegistro();
		d = d + "\nHora/aula " + getQuantidade();
		return d;
	}

	public String getRegistro() {
		return Registro;
	}

	public void setRegistro(String Registro) {
		this.Registro = Registro;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public Professor pProfessor(Professor a){
		System.out.println("Digite o nome: \n");
		a.setNome(scanner.nextLine());
		System.out.println("Digite o email: \n");
		a.setEmail(scanner.next());
		System.out.println("Digite o telefone: \n");
		a.setTelefone(scanner.next());
		System.out.println("Digite o numero de registro: \n");
		a.setRegistro(scanner.next());
		System.out.println("Digite a quantidade de horas: ");
		a.setQuantidade(scanner.next());
		
		return a;
	}
	
	
	public void editaProfessores(){
		System.out.println("1- Mudar o nome.");
		System.out.println("2- Mudar o telefone.");
		System.out.println("3- Mudar o email.");
		System.out.println("4- Mudar o registro.");
		System.out.println("5- Mudar a quantidade de horas");
		int executar = scanner.nextInt();
		switch(executar){
		case 1:{ 
			alteraNome();
			break;
		}
		case 2:{
			alteraTelefone();
			break;
		}
		case 3:{
			alteraEmail();
			break;
		}
		case 4:{
			NewRegistro();
			break;
		}
		case 5:{
			NewQuantidade();
			break;
		}
		}
		
	}
	
	public void NewRegistro(){
		System.out.println("Digite o novo numero: ");
		String nro = scanner.next();
		this.setRegistro(nro);
	}
	
	public void NewQuantidade(){
		System.out.println("Digite a nova quantidade: ");
		String eoq = scanner.next();
		this.setQuantidade(eoq);
	}
	

}