package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Classe responsável por caracterizar o balanço mensal das locações
 * 
 * @author Samanda
 *
 */
public class BalancoLocacao {
	
	private String titulo;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFim = dataInicio.plusDays(30);
	private Set<Locatario> listaLocatarios = new HashSet<>();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<Locatario> getListaLocatarios() {
		return listaLocatarios;
	}
	public void setListaLocatarios(Set<Locatario> listaLocatarios) {
		this.listaLocatarios = listaLocatarios;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	
	/**
	 * Método responsável por retornar a quantidade de locatários no balanço em questão
	 * 
	 * @return a quantidade locatarios
	 */
	public int quantidadeLocatarios() {
		return listaLocatarios.size();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dataFim, dataInicio, descricao, listaLocatarios, titulo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BalancoLocacao other = (BalancoLocacao) obj;
		return Objects.equals(dataFim, other.dataFim) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(listaLocatarios, other.listaLocatarios)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
}
