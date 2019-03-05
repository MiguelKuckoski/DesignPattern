package design_pattern.criacao.factoryMethod;

import java.util.Calendar;

public class PassagemOnibusEstadual extends Passagem{

	public PassagemOnibusEstadual(String origem, String destino, Calendar horaPartida) {
		super(origem, destino, horaPartida);
	}
	
	public void exibeDetalhes() {
		System.out.println("Passagem de onibus estadual: " + this.getOrigem() + " para " + this.getDestino()  
		+ ", Data/hora: " + super.df.format(this.getHoraPartida().getTime()));
	}
}
