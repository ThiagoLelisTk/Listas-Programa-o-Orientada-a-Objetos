package Exercicio6;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		Scanner leitor = new java.util.Scanner(System.in);
		int calculo, aumento;
		
		System.out.println("Digite o numero de itens vendidos: ");
		int itensvendidos = leitor.nextInt();
		
		aumento = (9 * itensvendidos)/100;
		calculo = aumento + 200;
		System.out.println("Sua comissao é de: " +aumento);
		System.out.printf("Seu salario é de: %d\n", calculo);
		
	}

}
