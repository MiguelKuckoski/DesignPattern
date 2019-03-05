package design_pattern.criacao.abstractFactory;

import java.util.Calendar;

public class ConcretePassagemOnibusInterestadual extends PassagemOnibusInterestadual{

	public ConcretePassagemOnibusInterestadual(String origem, String destino, Calendar horaPartida) {
		super(origem, destino, horaPartida);
	}

	@Override
	public void exibeDetalhes() {
	System.out.println("Passagem de onibus interestadual: " + this.getOrigem() + " para " + this.getDestino()  
	+ ", Data/hora: " + df.format(this.getHoraPartida().getTime()));
}

}
