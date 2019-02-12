package Agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	private Scanner scanner = new Scanner(System.in);
	private List<Aluno> alunos = new ArrayList<>();
	private List<Professor> professores = new ArrayList<>();

	public void listTodos() {
		System.out.println("Lista de contatos de alunos: ");
		for (Aluno aluno : alunos) {
			System.out.println(aluno.dadosFormatados());
		}

		System.out.println("Lista de contato de professores: ");
		for (Professor professor : professores) {
			System.out.println(professor.dadosFormatados());
		}
	}

	public void CadastroAluno() {
		Aluno a = new Aluno();
		a.pegaAluno(a);
		alunos.add(a);
	}

	public void ExcluirAluno() {
		String nome;
		System.out.println("Digite o nome que deseja excluir: ");
		nome = scanner.next();
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nome)) {
				alunos.remove(aluno);
				System.out.println(aluno.getNome() + " excluido com sucesso.\n");
			}
		}
	}

	public void CadastroProfessor() {
		Professor p = new Professor();
		p.pProfessor(p);
		professores.add(p);
	}

	public void ExcluirProfessor() {
		String nome;
		System.out.println("Digite o nome que deseja excluir: ");
		nome = scanner.next();
		for (Professor p : professores) {
			if (p.getNome().equals(nome)) {
				professores.remove(p);
				System.out.println(p.getNome() + " Excluido com sucesso.\n");
			}
		}
	}

	public void AlterarProfessor() {
		System.out.println("Digite o nome do professor que deseja alterar:");
		String nome = scanner.next();
		for (Professor professor : professores) {
			if (professor.getNome().equals(nome)) {
				professor.editaProfessores();
			}
		}
	}

	public void AlterarAlunos() {
		System.out.println("digite o nome do aluno que deseja alterar: ");
		String nome = scanner.next();
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nome))
				aluno.editaAluno();
		}
	}

	public void impOpcoes() {
		System.out.println("1- Novo Aluno");
		System.out.println("2- Novo Professor");
		System.out.println("3- Excluir Aluno");
		System.out.println("4- Excluir Professor");
		System.out.println("5- Editar Aluno");
		System.out.println("6- Editar Professor");
		System.out.println("7- Imprimir");
		System.out.println("0- Sair");
	}

}
