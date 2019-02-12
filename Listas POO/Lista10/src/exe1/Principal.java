package exe1;

import java.util.Scanner;

public class Principal {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Agenda agenda = new Agenda();
		agenda.banco();
		boolean exe = true;
		while (exe) {
			System.out.println("1 - Cadastrar\n2 - Listar\n3 - Excluir\n4 - Sair\n");
			String escolha = leitor.next();
			switch (escolha) {
			case "1":{
				agenda.inserir();
				break;
			}
			case "2":{
				agenda.imprimir();
				break;
			}
			case "3":{
				agenda.remover();
				break;
			}
			case "4":{
				exe = false;
				break;
			}
			
				
			}

		}
	}
}