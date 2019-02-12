package agenda;

import java.io.IOException;
import java.util.Scanner;

public class Aluno extends Pessoa  {
	Scanner leitor = new Scanner(System.in);
		
	private String numeroMatricula;
	
	

	@Override
	public String dadosFormatados() {
		String dados = super.dadosFormatados();
		dados = dados + "\nMatrícula: " + getRegistro();
		return dados;
	}

	public String getRegistro() {
		return numeroMatricula;
	}

	public void setRegistro(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public Aluno pegaAluno(Aluno a) throws IOException{
		System.out.println("Digite o nome: ");
		a.setNome(leitor.next());
		CadastrarBanco.escritorAluno(a.getNome());
		System.out.println("Digite o email: ");
		a.setEmail(leitor.next());
		CadastrarBanco.escritorAluno(a.getEmail());
		System.out.println("Digite o telefone: ");
		a.setTelefone(leitor.next());
		CadastrarBanco.escritorAluno(a.getTelefone());
		System.out.println("Digite o numero de registro: ");
		a.setRegistro(leitor.next());
		CadastrarBanco.escritorAluno(a.numeroMatricula);
		
		
		return a;
	}
	
	public void editaAluno(){
		System.out.println("1- Trocar nome.");
		System.out.println("2- Trocar telefone.");
		System.out.println("3- Trocar email.");
		System.out.println("4- Trocar registro.");
		int aux = leitor.nextInt();
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
			alteranumeroMatricula();
			break;
		}
		
		}
		
	}
	
	public void alteranumeroMatricula(){
		System.out.println("Digite o novo numero: ");
		String numero = leitor.next();
		this.setRegistro(numero);
	}

}
