package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		Scanner leitor = new java.util.Scanner(System.in);
		System.out.println("Digite o 1º numero: ");
		int x = leitor.nextInt();
		System.out.println("Digite o 2º numero: ");
		int y = leitor.nextInt();
		System.out.println("Digite o 3º numero: ");
		int z = leitor.nextInt();
		
		t.Hipotenusa(x, y, z);	
	}

}
