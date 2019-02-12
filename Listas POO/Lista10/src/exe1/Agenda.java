package exe1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Pessoa> pessoa;
	private Scanner leitor;
	private String nome, email, tel;

	public Agenda() {
		pessoa = new ArrayList<>();
		leitor = new Scanner(System.in);
	}

	public void salvar(ArrayList<Pessoa> pessoas) throws Exception {
		FileOutputStream saida = new FileOutputStream("lista10.txt");
		ObjectOutputStream saidaO = new ObjectOutputStream(saida);
		saidaO.writeObject(pessoas);
		saidaO.close();
	}

	@SuppressWarnings({ "resource", "unchecked" })
	public void receber() throws Exception {
		FileInputStream entrada = new FileInputStream("lista10.txt");
		ObjectInputStream entradaO = new ObjectInputStream(entrada);
		ArrayList<Pessoa> p = (ArrayList<Pessoa>) entradaO.readObject();
		pessoa = p;
	}

	public void banco() {
		try {
			receber();
		} catch (Exception e) {
		
		}

	}


	void inserir() {
		System.out.println("Nome: ");
		nome = leitor.nextLine();
		System.out.println("Email: ");
		email = leitor.nextLine();
		System.out.println("Telefone: ");
		tel = leitor.nextLine();
		pessoa.add(new Pessoa(nome, email, tel));

		System.out.println("Contato cadastrado com sucesso!");
	}


	void imprimir() {
		int ident = 0000;
		for (Pessoa pessoa : pessoa) {
			System.out.println("ID: " + ident + " \nNome: " + pessoa.getNome() + "   \nEmail: " + pessoa.getEmail()
					+ "    \nTelefone: " + pessoa.getTelefone());
			ident++;
		}
	}

	void remover() {
		imprimir();
		System.out.println("Seleciona o ID: ");
		int i = leitor.nextInt();
		leitor.nextLine();
		pessoa.remove(i);
		System.out.println("Contato removido com sucesso!");
	}

}