package repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exemplo.Produto;

public class ProdutoRepository {
	static Map<String, Produto> repositorio;
	
	public ProdutoRepository() {
		this.repositorio = new HashMap<String, Produto>();
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
