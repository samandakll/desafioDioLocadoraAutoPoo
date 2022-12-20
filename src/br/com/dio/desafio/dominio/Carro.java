/**
 * 
 */
package br.com.dio.desafio.dominio;

/**
 * Classe responsável por caracterizar um carro
 * 
 * @author Samanda
 *
 */
public class Carro extends Veiculo {
	
	private Integer quantidadeAirBags;

	public Integer getQuantidadeAirBags() {
		return quantidadeAirBags;
	}

	public void setQuantidadeAirBags(Integer quantidadeAirBags) {
		this.quantidadeAirBags = quantidadeAirBags;
	}

	@Override
	public String toString() {
		return "Carro [quantidadeAirBags=" + quantidadeAirBags + ", getCor()=" + getCor() + ", getPlaca()=" + getPlaca()
				+ ", getChassi()=" + getChassi() + ", getDisponivel()=" + getDisponivel() + "]";
	}

	@Override
	protected double emissaoGuiaCaucao() {
		return CAUCAO_PADRAO + 250d;
	}	
}
