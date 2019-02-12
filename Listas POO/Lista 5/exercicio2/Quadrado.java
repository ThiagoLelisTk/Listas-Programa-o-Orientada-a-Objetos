package exercicio2;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		Scanner leitor = new java.util.Scanner(System.in);
		System.out.println("Digite o tamanho do quadrado de 1 ate 20: ");
		int quad = leitor.nextInt();
		for (int x = 1; x <= quad ; x++) {
			System.out.print("*");
		}
		for (int x = 1; x <= quad - 2 ; x++) {
			System.out.print("\n*");
			for (int y = 1; y <= quad - 1; y++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
		for (int x = 1; x <= quad; x++) {
			System.out.print("*");
		}

	}

}
