package Exercicio1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner leitor = new java.util.Scanner(System.in);
		boolean exe = true;
		while (exe){
			System.out.println("\nCalculadora com apenas 2 numeros para calcular");
			System.out.println("Digite qual conta voc� deseja: ");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRA��O");
			System.out.println("3 - MULTIPLICA��O");
			System.out.println("4 - DIVISAO");
			System.out.println("5 - SAIR");
			int escolha = leitor.nextInt();
			
			if (escolha == 1){
				System.out.println("Digite o 1� numero: ");
				int nro1 = leitor.nextInt();
				System.out.println("Digite o 2� numero: ");
				int nro2 = leitor.nextInt();
				System.out.printf("Resultado: %d", nro1 + nro2);
			}
			if (escolha == 2){
				System.out.println("Digite o 1� numero: ");
				int nro1 = leitor.nextInt();
				System.out.println("Digite o 2� numero: ");
				int nro2 = leitor.nextInt();
				System.out.printf("Resultado: %d", nro1 - nro2);
			}
			if (escolha == 3){
				System.out.println("Digite o 1� numero: ");
				int nro1 = leitor.nextInt();
				System.out.println("Digite o 2� numero: ");
				int nro2 = leitor.nextInt();
				System.out.printf("Resultado: %d", nro1 * nro2);
			}
			if (escolha == 4){
				System.out.println("Digite o 1� numero: ");
				int nro1 = leitor.nextInt();
				System.out.println("Digite o 2� numero: ");
				int nro2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n \n", nro1 / nro2);
			}
			if (escolha == 5){
				exe = false;
			}
		

		}

	}
}
