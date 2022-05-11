import exemplo.Lote;
import exemplo.Produto;
import repository.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produto, 10L);
		ProdutoRepository.addProduto(produto);
		
		
		
		System.out.println(produto);
		System.out.println(lote);
	}
}
