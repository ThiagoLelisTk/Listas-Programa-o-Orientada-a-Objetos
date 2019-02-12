package br.com.fatec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public abstract class CadastroBanco {

	private static final String caminho = ("C:\\Users\\jp-to\\Desktop\\test.exe");
	static File arquivo = new File(caminho);
	

	public static void leitor() throws IOException {
		BufferedReader buff = new BufferedReader(new FileReader(caminho));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buff.readLine();
		}
		buff.close();
	}

	public static void writer(String x, int quantidade) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));

		writer.write(x);
		writer.write("\t" + quantidade);
		writer.newLine();
		writer.flush();
		writer.close();

	}	
}
