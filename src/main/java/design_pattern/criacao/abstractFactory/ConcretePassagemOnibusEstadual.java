package design_pattern.criacao.abstractFactory;

import java.util.Calendar;

public class ConcretePassagemOnibusEstadual extends PassagemOnibusEstadual{

	public ConcretePassagemOnibusEstadual(String origem, String destino, Calendar horaPartida) {
		super(origem, destino, horaPartida);
	}

	@Override
	public void exibeDetalhes() {
	System.out.println("Passagem de onibus estadual: " + this.getOrigem() + " para " + this.getDestino()  
	+ ", Data/hora: " + df.format(this.getHoraPartida().getTime()));
}
}
