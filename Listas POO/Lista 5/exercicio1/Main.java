package agenda;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner leitor;

	public static void main(String[] args) throws IOException {
		leitor = new Scanner(System.in);
		Agenda a = new Agenda();
		

		CadastrarBanco.alteraLinha("x", "y");
		int saida = 0;
		int opcao = 0;

		while (saida == 0) {
			switch (opcao) {
			case 0: {
				a.Opcoes();
				opcao = leitor.nextInt();
				break;
			}
			case 1: {
				a.cadastrarAluno();
				opcao = 0;
				break;
			}
			case 2:{
				a.cadastrarProfessor();
				opcao = 0;
				break;
			}
			case 3:{
				a.excluirAluno();
				opcao = 0;
				break;
			}
			case 4:{
				a.excluirProfessor();
				opcao = 0;
				break;
			}
			case 5:{
				a.alteraAlunos();
				opcao = 0;
				break;
				
			}
			case 6:{
				a.alteraProfessor();
				opcao = 0;
				break;
			}
			case 7:{
				a.listarTodos();
				opcao = 0;
				break;
			}
			}

		}

	}
}
