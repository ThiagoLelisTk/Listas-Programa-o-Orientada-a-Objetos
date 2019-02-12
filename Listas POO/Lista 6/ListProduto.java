package br.com.fatec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class ListProduto {
	Produto produto;
	List<Produto> ListaProdutos = new ArrayList<Produto>();
	Scanner leitor = new java.util.Scanner(System.in);
	
	public void CadastroProduto(){
		produto = new Produto();
		System.out.println("Digite o nome do produto: ");
		produto.setName(leitor.next());
		System.out.println("Digite a quantidade do produto: ");
		produto.setQuantidade(leitor.nextInt());
	}
	
	public void RemoveProduto() throws IOException{
		String nome;
		System.out.println("Entre com o produto que deseja remover: ");
		nome = leitor.next();
		for(Produto encontra: ListaProdutos){
			if(produto.getName().equals(nome)){
				ListaProdutos.remove(nome);
				System.out.println("Produto removido!");
			}
		}
		
	}
}
