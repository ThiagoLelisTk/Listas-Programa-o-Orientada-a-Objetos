package Array;

import java.util.Scanner;

public class Principal {
		public static Scanner scanner;
		public static void main(String[] args) {
			scanner = new java.util.Scanner(System.in);
			AgendaTelefonica agenda = new AgendaTelefonica();
			
			int sair = 0;
			int opcao = 0;
			
			while(sair == 0){
				switch (opcao) {
				case 0:{
					agenda.impOpcoes();
					opcao = scanner.nextInt();
					break;
				}
				case 1: {
					agenda.impPessoas();
					opcao = 0;
					break;
				}
				case 2: {
					agenda.cadastrarPessoa();
					opcao = 0;
					break;
				}
				case 3: {
					sair = 1;
					System.out.println("\nAté a proxima, meu caro amigo!");
					break;
				}
				default:{
					agenda.impOpcoes();
					opcao = scanner.nextInt();
					break;
				}
			}
			
		
		}
	}
}
