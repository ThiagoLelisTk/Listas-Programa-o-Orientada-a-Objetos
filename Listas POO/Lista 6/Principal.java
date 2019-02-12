package br.com.fatec;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	private static Scanner leitor;
	
	public static void main(String[] args) throws IOException{
		CadastroBanco.writer("Pizza", 10);
		CadastroBanco.leitor();
		int out = 0;
		int menu = 0;
		
		Options op = new Options();
		leitor = new java.util.Scanner(System.in);
		ListProduto lipr = new ListProduto();
		
		while(out != 0){
			switch(menu){
			case 1:{
				op.printOptions();
				menu = leitor.nextInt();
				break;
			}
			case 2:{
				lipr.CadastroProduto();
				menu = 0;
				break;
			}
			case 3:{
				lipr.RemoveProduto();
				menu = 0;
				break;
			}
		
	}

}
}
}
