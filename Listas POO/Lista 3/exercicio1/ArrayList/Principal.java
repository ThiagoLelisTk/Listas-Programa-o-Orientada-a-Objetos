package ArrayList;

import java.util.Scanner;

public class Principal {
	public static Scanner leitor;
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		AgendaTelefonica agenda = new AgendaTelefonica();
		
		int menu = 0;
		int opcao = 0;
		
		while(menu == 0){
			switch (opcao) {
			case 0:{
				agenda.imprimirOpcoes();
				opcao = leitor.nextInt();
				break;
			}
			case 1: {
				agenda.imprimirPessoas();
				opcao = 0;
				break;
			}
			case 2: {
				agenda.cadastrarPessoa();
				opcao = 0;
				break;
			}
			case 3: {
				menu = 1;
				System.out.println("Até a proxima!\n");
				break;
			}
			default:{
				agenda.imprimirOpcoes();
				opcao = leitor.nextInt();
				break;
			}
		}
		
	
	}
}

}
