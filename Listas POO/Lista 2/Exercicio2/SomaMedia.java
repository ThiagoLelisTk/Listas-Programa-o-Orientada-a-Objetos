package Exercicio2;

import java.util.Scanner;

public class SomaMedia {

	public static void main(String[] args) {
		Scanner leitor = new java.util.Scanner(System.in);
		boolean exe = true;
		while (exe){
			System.out.println("\nDigite qual conta voce deseja: ");
			System.out.println("1 - SOMA");
			System.out.println("2 - M�DIA");
			System.out.println("3 - SAIR");
			int escolha = leitor.nextInt();
			
			if (escolha == 1){
				System.out.println("Digite o 1� numero: ");
				int nro1 = leitor.nextInt();
				System.out.println("Digite o 2� numero: ");
				int nro2 = leitor.nextInt();
				System.out.printf("Resultado: %d", nro1 + nro2);
				if (nro1 > nro2){
				System.out.printf("N�meros: %d %d ", nro1, nro2);
				}else{
					System.out.printf("\nN�meros: %d %d ", nro2, nro1);
				}
			}
			if (escolha == 2){
				System.out.println("Digite o 1� numero: ");
				int nro1 = leitor.nextInt();
				System.out.println("Digite o 2� numero: ");
				int nro2 = leitor.nextInt();
				System.out.printf("Resultado: %d", (nro1 + nro2)/2);
				if (nro1 > nro2){
					System.out.printf("\nN�meros: %d %d ", nro1, nro2);
					}else{
						System.out.printf("N�meros: %d %d ", nro2, nro1);
				}
			}
			if (escolha == 3){
				exe = false;
			}
		}
	}
}
