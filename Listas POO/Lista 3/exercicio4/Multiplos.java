package br.com.exercicio4;

import java.util.Scanner;

public class Multiplos {
	int nro1;
	int nro2;
	boolean multiplo;
	int numeros;
	
	public void mostraResultado(){
		Scanner leitor = new java.util.Scanner(System.in);
		System.out.println("Insira o 1º numero positivo: ");
		nro1 = leitor.nextInt();
		if (nro1 == 0){
			System.out.println("Digite um numero maior que 0: ");
			nro1 = leitor.nextInt();
			}
		System.out.println("Insira o 2º numero positivo: ");
		nro2 = leitor.nextInt();
		if (nro2 == 0){
			System.out.println("Digite um numero maior que 0: ");
			nro2 = leitor.nextInt();
			}
		multiplo = sMult();
		System.out.printf("São Multiplos? %b", multiplo);
		}

	

	public boolean sMult(){
		if ( nro1 % nro2 == 0 ) {		
			return true;
		} else {
			return false;
		}
	}
}	
