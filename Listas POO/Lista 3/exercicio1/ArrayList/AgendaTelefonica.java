package ArrayList;

import java.util.Scanner;
import java.util.Vector;

public class AgendaTelefonica {

		private Vector<Pessoa> pessoa;
		private Scanner scanner;
		
		
		public AgendaTelefonica() {
			pessoa = new Vector<Pessoa>();
			scanner = new Scanner(System.in);
		}


		public void cadastrarPessoa(){
				
					System.out.println("Digte um nome para a pessoa: \n");
					String nome = scanner.next();
					System.out.println("Digite o numero de telefone: \n");
					String tel = scanner.next();
					System.out.println("Digite o email: \n");
					String email = scanner.next();
					Pessoa nova = new Pessoa(nome, tel, email);
					pessoa.add(nova);
					System.out.println("Novo contato adicionado\n");
					
				
			
		}

			
		public void imprimirOpcoes(){
			System.out.println("Escolha uma opção: \n");
			System.out.println("1 - Imprimir contatos.\n");
			System.out.println("2 - Colocar novos contatos. \n");
			System.out.println("3 - sair\n");
						
		}
		
		public void imprimirPessoas(){
			for (Pessoa pessoa : pessoa) {
				if(pessoa != null){
					System.out.println("\nNome: " +pessoa.getNome() + "Telefone: \n"
					+ pessoa.getTelefone() + "Email: " + pessoa.getEmail());
				}
			}
		}
		
		public Vector<Pessoa> getPessoas(){
			return pessoa;
		}
		
		public void setPessoas(Vector<Pessoa> pessoas){
			this.pessoa = pessoas;
		}


}
