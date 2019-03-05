package design_pattern.criacao.factoryMethod;

import java.util.Calendar;

public class PassagemOnibusInterestadual extends Passagem{

	public PassagemOnibusInterestadual(String origem, String destino, Calendar horaPartida) {
		super(origem, destino, horaPartida);
	}
	
	public void exibeDetalhes() {
		System.out.println("Passagem de onibus interestadual: " + this.getOrigem() + " para " + this.getDestino()  
		+ ", Data/hora: " + super.df.format(this.getHoraPartida().getTime()));
	}

	
}
