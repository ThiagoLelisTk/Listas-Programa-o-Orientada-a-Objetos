package Array;

import java.util.Scanner;

public class AgendaTelefonica {

		private Pessoa[] pessoas;
		private Scanner leitor;
		
		
		public AgendaTelefonica() {
			pessoas = new Pessoa[10];
			leitor = new Scanner(System.in);
		}
		
		
		public Pessoa[] getPessoas(){
			return pessoas;
		}
		
		public void setPessoas(Pessoa[] pessoas){
			this.pessoas = pessoas;
		}

		public void cadastrarPessoa(){
			for(int i = 0; i < pessoas.length; i++){
				if(pessoas[i] == null){
					System.out.println("Digite um nome para a pessoa: \n");
					String nome = leitor.next();
					System.out.println("Digite o numero de telefone: \n");
					String tel = leitor.next();
					System.out.println("Digite o email: ");
					String email = leitor.next();
					Pessoa nova = new Pessoa(nome, tel, email);
					pessoas[i] = nova;
					System.out.println("\nNovo contato adicionado");
					break;
				}
			}
		}

			
		public void impOpcoes(){
			System.out.println("Escolha uma opção: \n");
			System.out.println("1 - listar contatos.\n");
			System.out.println("2 - incluir contatos. \n");
			System.out.println("3 - sair\n");
						
		}
		
		public void impPessoas(){
			for (Pessoa pessoa : pessoas) {
				if(pessoa != null){
					System.out.println("Nome: \n" +pessoa.getNome() + "Telefone: \n"
					+ pessoa.getTelefone() + "Email: " + pessoa.getEmail());
				}
			}
		}
		


}
