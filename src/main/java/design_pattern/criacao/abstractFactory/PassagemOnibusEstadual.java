package design_pattern.criacao.abstractFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class PassagemOnibusEstadual{

	private String origem;
	private String destino;
	private Calendar horaPartida;
	protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public PassagemOnibusEstadual(String origem, String destino, Calendar horaPartida) {
		this.origem = origem;
		this.destino = destino;
		this.horaPartida = horaPartida;
	}
	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(Calendar horaPartida) {
		this.horaPartida = horaPartida;
	}
	
	public abstract void exibeDetalhes();

}
