/**
 * 
 */
package br.com.dio.desafio.dominio;

/**
 * Classe responsável por caracterizar o veículo
 * 
 * @author Samanda
 *
 */
public abstract class Veiculo {
	
	/**
	 * Método responsável por viabilizar a emissão da caução por veículo
	 */
	protected abstract double emissaoGuiaCaucao();
	
	protected static final double CAUCAO_PADRAO = 1000d;
	
	private String cor;
	private String placa;
	private String chassi;
	private Boolean disponivel;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
		
}
