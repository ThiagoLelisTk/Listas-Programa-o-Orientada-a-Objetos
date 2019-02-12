package Agenda;

import java.util.Scanner;

public class Principal {

	public static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Agenda t = new Agenda();
		

		
		int executar = 0;
		int menu = 0;

		while (executar == 0) {
			switch (menu) {
			case 0: {
				t.impOpcoes();
				menu = leitor.nextInt();
				break;
			}
			case 1: {
				t.CadastroAluno();
				menu = 0;
				break;
			}
			case 2:{
				t.CadastroProfessor();
				menu = 0;
				break;
			}
			case 3:{
				t.ExcluirAluno();
				menu = 0;
				break;
			}
			case 4:{
				t.AlterarAlunos();
				menu = 0;
				break;
				
			}
			case 5:{
				t.AlterarProfessor();
				menu = 0;
				break;
			}
			case 6:{
				t.listTodos();
				menu = 0;
				break;
			}
			}

		}

	}
}
