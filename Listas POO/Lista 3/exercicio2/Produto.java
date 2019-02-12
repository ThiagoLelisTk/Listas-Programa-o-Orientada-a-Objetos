package br.com.exercicio2;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		double p1 = 1.00;
		double p2 = 2.98;
		double p3 = 9.98;
		double p4 = 4.49;
		double p5 = 6.87;
		
		Scanner leitor = new java.util.Scanner(System.in);
		boolean exe = true;
		while (exe){
			System.out.println("\nEscolha o produto:");
			System.out.println("1- Produto 1");
			System.out.println("2- Produto 2");
			System.out.println("3- Produto 3");
			System.out.println("4- Produto 4");
			System.out.println("5- Produto 5");
			System.out.println("6- Sair");
			int escolha = leitor.nextInt();
		
		if (escolha == 1){
			System.out.println("Digite a quantidade de produtos: ");
			int prod1 = leitor.nextInt();
			double prfinal = prod1 * p1;
			System.out.printf("O preço total é de %2f reais", prfinal);
		}
		if (escolha == 2){
			System.out.println("Digite a quantidade de produtos: ");
			int prod2 = leitor.nextInt();
			double prfinal = prod2 * p2;
			System.out.printf("O preço total é de %2f reais", prfinal);
		}
		if (escolha == 3){
			System.out.println("Digite a quantidade de produtos: ");
			int prod3 = leitor.nextInt();
			double prfinal = prod3 * p3;
			System.out.printf("O preço total é de %2f reais", prfinal);
		}
		if (escolha == 4){
			System.out.println("Digite a quantidade de produtos: ");
			int prod4 = leitor.nextInt();
			double prfinal = prod4 * p4;
			System.out.printf("O preço total é de %2f reais", prfinal);
		}
		if (escolha == 5){
			System.out.println("Digite a quantidade de produtos: ");
			int prod5 = leitor.nextInt();
			double prfinal = prod5 * p5;
			System.out.printf("O preço total é de %2f reais", prfinal);
		}
		if (escolha == 6){
			exe = false;
		}
	}

}
}
