package src.main.java.br.edu.infnet.appFlaStore.model.negocio;

import br.edu.infnet.appFlaStore.model.exception.TipoBolaInvalidoException;

public class Bola extends Produto {

	private boolean personalizada;
	private String tipo;
	
	public Bola(String descricao, float valor, boolean produtoFlamengo) {
		super(descricao, valor, produtoFlamengo);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isPersonalizada());
		sb.append(";");
		sb.append(this.getTipo());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
		float valor = this.getValor()
		float valorProdutoFlamengo = this.getValor() + (this.isProdutoFlamengo() ? 5 : 0);		
		float valorPersonalizada = valor * 0.35f;

		return valor + valorPersonalizada + valorProdutoFlamengo;
	}

	public boolean isPersonalizada() {
		return personalizada;
	}
	public void setPersonalizada(boolean personalizada) {
		this.personalizada = personalizada;
	}
	public string getTipo() {
		return tipo;
	}
	public void setTipo(string tipobola) throws TipoBolaException {
		
		if(!tipo.equals("Quadra") || !tipo.equals("Campo") || !tipo.equals("Society")) {
			throw new TipoBolaInvalidoException("Tipo inválido.");
		}
		
	}
}