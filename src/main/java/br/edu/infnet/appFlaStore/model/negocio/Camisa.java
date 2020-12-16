package src.main.java.br.edu.infnet.appFlaStore.model.negocio;

import br.edu.infnet.appFlaStore.model.exception.NumeroCamisaInvalidaException;

public class Camisa extends Produto {

	private boolean mangaLonga;
	private int camisa;

	public Camisa(String descricao, float valor, boolean produtoFlamengo) {
		super(descricao, valor, produtoFlamengo);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isMangaLonga());
		sb.append(";");
		sb.append(this.getNumeroCamisa());
		
		return sb.toString();
	}
	
	@Override
	public float calcularValorVenda() {
		float valormangaLonga = this.getValor() + (this.mangaLonga() ? 7 : 0);		
		
		return valormangaLonga 
	}

	public boolean isMangaLonga() {
		return mangaLonga;
	}
	public void setMangaLonga(boolean mangalonga) {
		this.mangaLonga = mangalonga;
	}
	public float getNumeroCamisa() {
		return this.camisa;
	}
	public void setNumeroCamisa(float numeroCamisa) throws NumeroCamisaException {
		
		if(this.camisa < 1 || this.camisa > 99) {
			throw new NumeroCamisaException("Número Invalido");
		}
		
		this.NumeroCamisa = NumeroCamisa;
	}
}