package repository;

import java.util.HashMap;
import java.util.Map;

import exemplo.Produto;

public class ProdutoRepository {
	static Map<String, Produto> repositorio = new HashMap<String, Produto>();
	
	public static void addProduto(Produto produto) {
		repositorio.put(produto.getId(), produto);
	}
	
	public static void removeProduto(String id) {
		repositorio.remove(id);
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
}
