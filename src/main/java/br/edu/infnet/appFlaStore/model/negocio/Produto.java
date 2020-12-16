package src.main.java.br.edu.infnet.appFlaStore.model.negocio;

public abstract class Produto {

	private String descricao;
	private float valor;
	private boolean produtoFlamengo; 

	public Produto(String descricao, float valor, boolean produtoFlamengo) {
		this.descricao = descricao;
		this.valor = valor;
		this.produtoFlamengo = produtoFlamengo;
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValor());
		sb.append(";");
		sb.append(this.isProdutoFlamengo());
		
		return sb.toString();
	}
	
	public abstract float calcularValorVenda();
	
	public String obterValorProduto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.calcularValorVenda());
		sb.append("\r");

		return sb.toString();
	}

	public String getDescricao() {
		return descricao;
	}
	public float getValor() {
		return valor;
	}
	public boolean isProdutoFlamengo() {
		return produtoFlamengo;
	}
}