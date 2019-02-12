package Exercicio8;

import java.util.Scanner;

public class Descriptografar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int password = 0;
		while (password > 10000 || password < 1000) {
			System.out.println("Digite uma senha com 4 dígitos para ser descriptografada: ");
			password = entrada.nextInt();
	}
		int nro4 = password % 10;
		nro4 = (nro4 + 10) - 7;
		nro4 %= 10;
		password /= 10;
		int nro3 = password % 10;
		nro3 = (nro3 + 10) - 7;
		nro3 %= 10;
		password /= 10;
		int nro2 = password % 10;
		nro2 = (nro2 + 10) - 7;
		nro2 %= 10;
		password /= 10;
		int nro1 = password % 10;
		nro1 = (nro1 + 10) - 7;
		nro1 %= 10;
		
		int novo3, novo4;
		novo3 = nro1;
		nro1 = nro3;
		nro3 = novo3;
		novo4 = nro2;
		nro2 = nro4;
		nro4 = novo4;
		
		System.out.printf("A senha descriptografada é:\n%d%d%d%d", nro1, nro2, nro3, nro4);
		

	}

}

