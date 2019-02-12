package exercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String arquivo = JOptionPane.showInputDialog("Digite o caminho do arquivo: ");
		
		//"C:\\Users\\jp-to\\OneDrive\\Documentos\\Requisitos.txt"
		try {
			lerArquivo(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	static void lerArquivo(String escrito) throws IOException {
		long tempoInicial = System.currentTimeMillis();
		BufferedWriter escritor = new BufferedWriter(new FileWriter("EmailsSalvos.txt"));
		File arq = new File(escrito);
		FileReader ler = new FileReader(arq);
		BufferedReader buff = new BufferedReader(ler);
		String linha = buff.readLine();
		String [] elementos;
		while(linha != null) {
			elementos = linha.split(" ");
			for (String string : elementos) {
				String [] letras = string.split("");
				for (int i = 0; i < letras.length; i++) {
					if (letras[i].equals("@")) {
						escritor.write(string);
					}
				}
			}
			linha = buff.readLine();
			escritor.newLine();
		}
		
		escritor.close();

		// execução do método
		long temp = (System.currentTimeMillis() - tempoInicial);
		System.out.println("Tempo de execução: " + temp + "millisegundos");
		
	}

}