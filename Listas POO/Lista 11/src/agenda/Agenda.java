package agenda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Agenda {
	Collection<Pessoa> agenda;
	Scanner leitor;
	boolean adicionar = false;
	public boolean alt;

	public Agenda() {
		agenda = new TreeSet<Pessoa>();
		leitor = new Scanner(System.in);
	}

	public void cadastrar() {
		System.out.println("Nome: ");
		String nome = leitor.next();
		System.out.println("Email: ");
		String email = leitor.next();
		System.out.println("Telefone: ");
		String telefone = leitor.next();
		try {
			agenda.add(new Pessoa(nome, email, telefone));
			salvar(agenda);
		} catch (Exception e) {
			System.out.println("Não foi possível fazer o cadastro no momento. Por favor, tente mais tarde!");
		}
	}

	public void salvar(Collection<Pessoa> agenda2) throws Exception {
		FileOutputStream saida = new FileOutputStream("agendapoo.txt");
		ObjectOutputStream output = new ObjectOutputStream(saida);
		output.writeObject(agenda2);
		output.close();
	}

	@SuppressWarnings({ "resource", "unchecked" })
	public void receber() throws Exception {
		FileInputStream entrada = new FileInputStream("agendapoo.txt");
		ObjectInputStream entradaO = new ObjectInputStream(entrada);
		Set<Pessoa> p = (Set<Pessoa>) entradaO.readObject();
		agenda = p;
	}

	public void banco() {
		try {
			receber();
		} catch (Exception e) {

		}

	}

	public void excluir() throws InterruptedException {

		alt = false;
		System.out.println("Digite o nome que deseja excluir: ");
		String nome = leitor.nextLine();
		Iterator<Pessoa> it = agenda.iterator();
		while (it.hasNext()) {
			if (it.next().nome.equalsIgnoreCase(nome)) {
					System.out.println("Excluido");
					it.remove();
					try {
						salvar(agenda);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				alt = true;
			}
		if (!alt)
			System.out.println("Usuário digitado não foi encontrado na Agenda.");

	}

	public void imprimir() {
		for (Pessoa pessoa : agenda) {
			pessoa.toString();
		}
	}

}
