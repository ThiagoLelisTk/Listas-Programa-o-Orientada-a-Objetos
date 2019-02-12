package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public abstract class CadastrarBanco {

	private static final String diretorio = "C:\\Users\\jp-to\\Desktop\\test.txt";
	static File file = new File(diretorio);
	static File prof = new File("C:\\Users\\jp-to\\Desktop\\professor.txt");

	public static void leitorAluno() throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(diretorio));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffer.readLine();
		}
		buffer.close();
	}

	public static void escritorAluno(String a) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

		writer.write(a);
		writer.newLine();
		writer.flush();
		writer.close();

	}

	public static void escritorProfessor(String a) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(prof, true));

		writer.write(a);
		writer.newLine();
		writer.flush();
		writer.close();

	}

	public static void leitorProfessor() throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader(prof));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffer.readLine();
		}
		buffer.close();
	}
	
	public static void alteraLinha(String palavraAntiga, String palavraNova) throws IOException {
	    String arquivo = "C:\\Users\\jp-to\\Desktop\\test.txt";
	    String arquivoTmp = "C:\\Users\\jp-to\\Desktop\\fon.txt";

	    BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoTmp, true));
	    BufferedReader reader = new BufferedReader(new FileReader(arquivo));

	    String linha;
	    while ((linha = reader.readLine()) != null) {
	        if (linha.contains(palavraAntiga)) {
	            linha = linha.replace(palavraAntiga, palavraNova);
	        }
	        writer.write(linha + "\n");
	    }

	    writer.close();        
	    reader.close();

	    new File(arquivo).delete();
	    new File(arquivoTmp).renameTo(new File(arquivo));
	}
}