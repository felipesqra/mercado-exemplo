package services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import repository.ProdutoRepository;
import exemplo.Produto;

public class ProdutosService {
	ProdutoRepository repositorioProdutos;
	
	public ProdutosService() {
		this.repositorioProdutos = new ProdutoRepository();
	}
	
	public List<Produto> listProdsByName(String name){
		List<Produto> produtos = repositorioProdutos.getAll();
		
	}
	
	public static void addProduto(Produto produto) {
		repositorio.put(produto.getId(), produto);
	}
	
	public static void removeProduto(String id) {
		repositorio.remove(id);
	}
	
	public Collection<Produto> getAll(){
		return this.repositorio.values();
	}

	
	public static void editProduto(String id, String nome, String fabricante) {
		Produto unidade = repositorio.get(id);
		unidade.setId(id);
		unidade.setFabricante(fabricante);
		unidade.setNome(nome);
	}
	
	public static void getProduto(String id) {
		repositorio.get(id);
	}
	
	public static void listProdutos(Produto produto) {
		repositorio.values();
	}
	
	public List<Produto> listarProdByName(String nome){
		List<Produto> produtos = new ArrayList<Produto>();
		for (Produto produto: repositorio.values()) {
			if(produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
				produtos.add(produto);
			}
		}
		
		
		return(produtos);
	}
}
