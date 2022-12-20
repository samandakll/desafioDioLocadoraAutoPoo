/**
 * 
 */
package br.com.dio.desafio;

import br.com.dio.desafio.dominio.BalancoLocacao;
import br.com.dio.desafio.dominio.Carro;
import br.com.dio.desafio.dominio.Locatario;
import br.com.dio.desafio.dominio.Moto;

/**
 * Classe principal de execução da aplicação - Locadora de Veículos
 * 
 * @author Samanda
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Carro fiatUno = new Carro();
		fiatUno.setCor("Branco");
		fiatUno.setPlaca("ABC-1234");
		fiatUno.setChassi("CH2022BR1PE");
		fiatUno.setDisponivel(true);
		fiatUno.setQuantidadeAirBags(2);
		
		Carro onix = new Carro();
		onix.setCor("Vermelho");
		onix.setPlaca("ABC-1238");
		onix.setChassi("CH2022BR2PE");
		onix.setDisponivel(false);
		onix.setQuantidadeAirBags(2);
		
		Carro gol = new Carro();
		gol.setCor("Preto");
		gol.setPlaca("ABC-1233");
		gol.setChassi("CH2022BR3PE");
		gol.setQuantidadeAirBags(4);
		
		Moto harleyIron = new Moto();
		harleyIron.setCor("Prata");
		harleyIron.setChassi("CH2022BR4PE");
		harleyIron.setPlaca("ABC-9845");
		harleyIron.setDisponivel(false);
		harleyIron.setCapacidadeMaximaAssento(1);
		
		Moto elite125 = new Moto();
		elite125.setCor("Azul");
		elite125.setChassi("CH2022BR5PE");
		elite125.setPlaca("ABC-9805");
		elite125.setDisponivel(true);
		elite125.setCapacidadeMaximaAssento(2);
		
		Moto fazer250 = new Moto();
		fazer250.setCor("Preto Fosco");
		fazer250.setChassi("CH2022BR6PE");
		fazer250.setPlaca("ABC-9875");
		fazer250.setDisponivel(false);
		fazer250.setCapacidadeMaximaAssento(2);
		
		Locatario locatario1 = new Locatario();
		locatario1.setNome("Will");
		locatario1.getLocacoesAtuais().add(onix);
		locatario1.getLocacoesRealizadas().add(fiatUno);
		
		Locatario locatario2 = new Locatario();
		locatario2.setNome("Samanda");
		locatario2.getLocacoesAtuais().add(harleyIron);
		locatario2.getLocacoesAtuais().add(fazer250);
		locatario2.getLocacoesRealizadas().add(elite125);
		locatario2.getLocacoesRealizadas().add(gol);
		
		// Locatario 1:
		System.out.println("A pessoa que realizou a locação foi: " + locatario1.getNome());
		System.out.println(locatario1.getNome() + 
				" possui um total de cauções já efetivadas em locações realizadas no valor de: " 
				+ locatario1.obterCalculoCaucaoJaRealizada());
		
		// atualizar lista de locações realizadas limpando a lista atual
		locatario1.atualizarListaLocacoesRealizadas();
		
		System.out.println(locatario1.getNome() + 
				" possui um total de cauções já efetivadas em locações realizadas no valor de: " 
				+ locatario1.obterCalculoCaucaoJaRealizada());
		
		// atualizar lista de locações realizadas limpando a lista atual
		locatario1.atualizarListaLocacoesRealizadas();
		
		System.out.println("");		
		
		// Locatario 2:
		System.out.println("A pessoa que realizou a locação foi: " + locatario2.getNome());
		System.out.println(locatario2.getNome() + 
				" possui um total de cauções já efetivadas em locações realizadas no valor de: " 
				+ locatario2.obterCalculoCaucaoJaRealizada());
		
		// atualizar lista de locações realizadas limpando a lista atual
		locatario2.atualizarListaLocacoesRealizadas();
		
		System.out.println(locatario2.getNome() + 
				" possui um total de cauções já efetivadas em locações realizadas no valor de: " 
				+ locatario2.obterCalculoCaucaoJaRealizada());
		
		System.out.println("");
		
		// Balanço atual
		BalancoLocacao balancoMesAtual = new BalancoLocacao();
		balancoMesAtual.setTitulo("Balanço do mês atual");
		balancoMesAtual.setTitulo("Esse balanço possui o objetivo de analisar dados do mês atual");
		balancoMesAtual.getListaLocatarios().add(locatario1);
		
		System.out.println("A quantidade de locatários no balanço atual: " + balancoMesAtual.quantidadeLocatarios());
	}

}
