/**
 * 
 */
package br.com.dio.desafio.dominio;

/**
 * Classe responsável por caracterizar uma moto
 * 
 * @author Samanda
 *
 */
public class Moto extends Veiculo {
	
	private int capacidadeMaximaAssento;

	public int getCapacidadeMaximaAssento() {
		return capacidadeMaximaAssento;
	}

	public void setCapacidadeMaximaAssento(int capacidadeMaximaAssento) {
		this.capacidadeMaximaAssento = capacidadeMaximaAssento;
	}

	@Override
	public String toString() {
		return "Moto [capacidadeMaximaAssento=" + capacidadeMaximaAssento + ", getCor()=" + getCor() + ", getPlaca()=" + getPlaca()
		+ ", getChassi()=" + getChassi() + ", getDisponivel()=" + getDisponivel() + "]";
	}

	@Override
	protected double emissaoGuiaCaucao() {
		return CAUCAO_PADRAO + 500d;
	}
	
}
