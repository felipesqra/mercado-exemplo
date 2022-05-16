package repository;

import java.util.HashMap;
import java.util.Map;

import exemplo.Lote;

public class LoteRepository {
	
	static Map<String, Lote> repositorio;
	
	public LoteRepository() {
		this.repositorio = new HashMap<String, Lote>();
	}
	 
	public static void addProduto(Lote lote) {
		repositorio.put(lote.getId(), lote);
	}
	
	public static void removeLote(String id) {
		repositorio.remove(id);
	}
	
	public void editLote(Lote lote) {
		this.repositorio.replace(lote.getId(), lote);
	}
	
	public static void getLote(String id) {
		repositorio.get(id);
	}
	
	public static void listLotes(Lote lote) {
		repositorio.values();
	}
}
