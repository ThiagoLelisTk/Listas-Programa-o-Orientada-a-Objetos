package Exercicio3;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		int x,maior=0, menor=0;								
		Scanner leitor = new Scanner(System.in);
				
		for(x=0; x<numeros.length; x++){
		System.out.printf("Digite o %d valor:", x+1);
		numeros[x] = leitor.nextInt();
	}
				
		maior = numeros[0];
		menor = numeros[0];
				
		for(x=0; x<numeros.length;x++){
			if(maior < numeros[x])
				maior = numeros[x];
					
			else if (menor > numeros[x])
				menor = numeros[x];
				}
				
		System.out.println("O maior numero é: "+maior);
		System.out.println("O menor numero é: "+menor);	
		}
}
