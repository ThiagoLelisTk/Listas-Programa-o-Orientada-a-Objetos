package Agenda;

import java.util.Scanner;

public class Aluno extends Pessoa {
	Scanner leitor = new Scanner(System.in);

	private String numeroMatricula;
	
	@Override
	public String dadosFormatados() {
		String d = super.dadosFormatados();
		d = d + "\nMatrícula: " + getNumeroMatricula();
		return d;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public Aluno pegaAluno(Aluno a){
		System.out.println("Digite o nome: ");
		a.setNome(leitor.nextLine());
		System.out.println("Digite o email: ");
		a.setEmail(leitor.next());
		System.out.println("Digite o telefone: ");
		a.setTelefone(leitor.next());
		System.out.println("Digite o numero de matrícula: ");
		a.setNumeroMatricula(leitor.next());
		
		return a;
	}
	
	public void editaAluno(){
		System.out.println("1- Alterar nome.");
		System.out.println("2- Alterar telefone.");
		System.out.println("3- Alterar email.");
		System.out.println("4- Alterar numero de Matricula.");
		int menu = leitor.nextInt();
		switch(menu){
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
		
		}
		
	}
	

}
