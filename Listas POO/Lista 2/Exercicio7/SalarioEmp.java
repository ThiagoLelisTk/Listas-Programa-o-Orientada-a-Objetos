package Exercicio7;

import java.util.Scanner;

public class SalarioEmp {

	public static void main(String[] args) {
		Scanner leitor = new java.util.Scanner(System.in);
		System.out.println("Digite o numero de horas trabalhadas: ");
		int horastrabalhadas = leitor.nextInt();
		int valorhoranormal = 30; 
		int calculo = horastrabalhadas - 40;
		int antigosalario = valorhoranormal * horastrabalhadas;
		int novosalario = ((50 * 30)/100) * (calculo) + antigosalario;
		
		System.out.println("Horas trabalhadas: " + horastrabalhadas);
		System.out.println("Novo salario: " +novosalario);
		System.out.println("Salario que iria ganhar sem os 50% por hora extra: " +antigosalario);
		
	}
}
	
