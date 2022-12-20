package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * Classe responsável por caracterizar a pessoa locatária com histórico de locações e as atuais, 
 * bem como, processar as cauções realizadas para retornar o total já pago.
 * 
 * @author Samanda
 *
 */
public class Locatario {
	
	private String nome;
	private Set<Veiculo> locacoesRealizadas = new LinkedHashSet<>();
	private Set<Veiculo> locacoesAtuais = new LinkedHashSet<>();
	
	/**
	 * Método responsável por obter o primeiro item da lista atual de locação, e 
	 * atribuir esse elemento para a lista de locações realizadas. Dessa forma, a 
	 * lista de locações realizadas ganhará um novo item sempre que houver registros
	 * de locações atuais. Caso contrário, uma mensagem de erro será apresentada.
	 */
	public void atualizarListaLocacoesRealizadas() {
		
		Optional<Veiculo> primeiraLocacaoDaLista = this.locacoesAtuais.stream().findFirst();
		
		if (primeiraLocacaoDaLista.isPresent()) {
			
			Veiculo veiculoObtido = primeiraLocacaoDaLista.get();
			
			this.locacoesRealizadas.add(veiculoObtido);
			
			System.out.println("Salvando em lista de locações realizadas o item: " + veiculoObtido);
			
			this.locacoesAtuais.remove(veiculoObtido);
		} else {
			System.err.println("A pessoa locatária não possui nenhuma locação em andamento!");
		}
	}
	
	/**
	 * Metódo responsável por somar todas as cauções já realizadas com o intuito de totalizar
	 * 
	 * @return valor totalizado das cauções realizadas
	 */
	public double obterCalculoCaucaoJaRealizada() {
		return this.locacoesRealizadas.stream().mapToDouble(locacao -> locacao.emissaoGuiaCaucao()).sum();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Veiculo> getLocacoesRealizadas() {
		return locacoesRealizadas;
	}
	public void setLocacoesRealizadas(Set<Veiculo> locacoesRealizadas) {
		this.locacoesRealizadas = locacoesRealizadas;
	}
	public Set<Veiculo> getLocacoesAtuais() {
		return locacoesAtuais;
	}
	public void setLocacoesAtuais(Set<Veiculo> locacoesAtuais) {
		this.locacoesAtuais = locacoesAtuais;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(locacoesAtuais, locacoesRealizadas, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locatario other = (Locatario) obj;
		return Objects.equals(locacoesAtuais, other.locacoesAtuais)
				&& Objects.equals(locacoesRealizadas, other.locacoesRealizadas) && Objects.equals(nome, other.nome);
	}
	
	

}
