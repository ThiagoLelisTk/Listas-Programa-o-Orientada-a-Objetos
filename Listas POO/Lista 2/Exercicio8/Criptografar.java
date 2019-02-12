package Exercicio8;

import java.util.Scanner;

public class Criptografar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int password = 0;
		while (password > 10000 || password < 1000) {
			System.out.print("Digite uma senha com 4 dígitos: ");
			password = entrada.nextInt();
		}
		
		int nro1, nro2, nro3, nro4;
		nro4 = password % 10;
		nro4 += 7;
		nro4 %= 10;
		password /= 10;
		nro3 = password % 10;
		nro3 += 7;
		nro3 %= 10;
		password /= 10;
		nro2 = password % 10;
		nro2 += 7;
		nro2 %= 10;
		password /= 10;
		nro1 = password % 10;
		nro1 += 7;
		nro1 %= 10;
		
		int novo, novo2;
		novo = nro3;
		nro3 = nro1;
		novo2 = nro4;
		nro4 = nro2;
		System.out.printf("A senha criptografada é:\n%d%d%d%d", novo, novo2, nro3, nro4);
	}

	}
