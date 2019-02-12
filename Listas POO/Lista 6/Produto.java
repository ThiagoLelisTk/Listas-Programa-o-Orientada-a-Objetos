package br.com.fatec;

public class Produto {
	private String name;
	private int quantidade;
	private static int quantidadeTotal;
	
	public Produto(){
		setQuantidade(getQuantidadeTotal() + 1);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidadde) {
		this.quantidade = quantidadde;
	}
	public static int getQuantidadeTotal() {
		return quantidadeTotal;
	}
	public static void setQuantidadeTotal(int quantidadeTotal) {
		Produto.quantidadeTotal = quantidadeTotal;
	}
	

}
