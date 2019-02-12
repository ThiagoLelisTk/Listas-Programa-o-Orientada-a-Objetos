package exe2;

import java.util.Scanner;


public class Principal{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("battlefield");
		Scanner leitor = new Scanner(System.in);
		String palavra = leitor.next();
		Alfabeto al = new Alfabeto(palavra);
		al.buracos();
		System.out.println(al);
	}
}