package Exercicio4;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		int nro1, nro2;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		nro1 = leitor.nextInt();
		System.out.println("Digite o segundo numero: ");
		nro2 = leitor.nextInt();
		if(nro1 % nro2 == 0){
			System.out.printf("Os numeros %d e %d s�o multiplos", nro1, nro2);
		}
		else{ 
			System.out.printf("Os numeros %d %d n�o s�o multiplos", nro1, nro2);
		}
	}
}