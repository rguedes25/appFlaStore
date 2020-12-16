package src.main.java.br.edu.infnet.appFlaStore.model.negocio;

import br.edu.infnet.appFlaStore.model.exception.MedidaNegativaException;

public class Chuteira extends Produto {

	private int medida;
	private String marca;
	
	public Chuteira(String descricao, float valor, boolean produtoFlamengo) {
		super(descricao, valor, produtoFlamengo);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getMedida());
		sb.append(";");
		sb.append(this.getMarca());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
		
		if(medida =< 36) {
			return this.getValor()
		}

		return this.getValor() * 0.35f;
	}

	public int getMedida() {
		return this.medida;
	}
	public void setMedida(int medida) throws MedidaInvalidaException {
		
		if(medida < 32 || medida > 46 ) {
			throw new MedidaInvalidaException("Medida inválida.");
		}
		
		this.medida = medida;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
