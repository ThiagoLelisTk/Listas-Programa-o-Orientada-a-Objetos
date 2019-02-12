package agenda;

import java.io.IOException;
import java.util.Scanner;

public class Professor extends Pessoa {
	private String numeroRegistro;
	private String quantidadeHoraAula;
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nRegistro: " + getNumeroRegistro();
		dadosFormatados = dadosFormatados + "\nHora/aula " + getQuantidadeHoraAula();
		return dadosFormatados;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getQuantidadeHoraAula() {
		return quantidadeHoraAula;
	}

	public void setQuantidadeHoraAula(String quantidadeHoraAula) {
		this.quantidadeHoraAula = quantidadeHoraAula;
	}
	
	public Professor pegaProfessor(Professor a) throws IOException{
		System.out.println("Digite o nome: ");
		a.setNome(scanner.nextLine());
		CadastrarBanco.escritorProfessor(a.getNome());
		System.out.println("Digite o email: ");
		a.setEmail(scanner.next());
		CadastrarBanco.escritorProfessor(a.getEmail());
		System.out.println("Digite o telefone: ");
		a.setTelefone(scanner.next());
		CadastrarBanco.escritorProfessor(a.getTelefone());
		System.out.println("Digite o numero de registro: ");
		a.setNumeroRegistro(scanner.next());
		CadastrarBanco.escritorProfessor(a.getNumeroRegistro());
		System.out.println("Digite a quantidade de horas: ");
		a.setQuantidadeHoraAula(scanner.next());
		CadastrarBanco.escritorProfessor(a.getQuantidadeHoraAula());
		CadastrarBanco.escritorProfessor("-------------------------");
		
		return a;
	}
	
	
	public void editaProfessores(){
		System.out.println("1- Alterar nome.");
		System.out.println("2- Alterar telefone.");
		System.out.println("3- Alterar email.");
		System.out.println("4- Alterar numeroRegistro.");
		System.out.println("5- Alterar quantidade de hora");
		int aux = scanner.nextInt();
		switch(aux){
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
			alteranumeroregistro();
			break;
		}
		case 5:{
			alteraQuantidadeHora();
			break;
		}
		}
		
	}
	
	public void alteranumeroregistro(){
		System.out.println("Digite o novo numero: ");
		String numero = scanner.next();
		this.setNumeroRegistro(numero);
	}
	
	public void alteraQuantidadeHora(){
		System.out.println("Digite a nova quantidade: ");
		String qtdade = scanner.next();
		this.setQuantidadeHoraAula(qtdade);
	}
	

}