package agenda;

import java.util.Scanner;

public class Principal {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		Scanner leitor = new Scanner(System.in);
		Agenda agenda = new Agenda();
		agenda.banco();
		boolean exe = true;
		while (exe) {
			System.out.println("1-Cadastrar \n2-Mostrar Contatos \n3-Excluir \n4-Sair\n");
			String escolha = leitor.next();
			leitor.nextLine();
			switch (escolha) {
			case "1":{
				agenda.cadastrar();
				break;
			}
			case "2":{
				agenda.imprimir();
				break;
			}
			case "3":{
				agenda.excluir();
				break;
			}
			case "4":{
				exe = false;
				break;
			}
			default:
				break;
			}

		}
	}

}
