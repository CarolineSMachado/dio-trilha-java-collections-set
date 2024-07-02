package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, long cod, double preco, int quantidade){
		produtoSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	class ComparatorPorPreco implements Comparator<Produto>{

		@Override
		public int compare(Produto p1, Produto p2) {
			return Double.compare(p1.getPreco(), p2.getPreco());
		}
		
	}
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}
	
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto("Caderno", 100, 50, 10);
		cadastroProdutos.adicionarProduto("Estojo", 255, 30, 5);
		cadastroProdutos.adicionarProduto("Caneta", 333, 5, 100);
		cadastroProdutos.adicionarProduto("Borracha", 111, 2.50, 80);
		
		System.out.println(cadastroProdutos.produtoSet);
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		
	}
}
