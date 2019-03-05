package design_pattern.criacao.factoryMethod;

import java.util.Calendar;

public class EmpresaOnibusEstadual extends Empresa{

	public Passagem emitePassagem(String origem, String destino, Calendar data) {
		return new PassagemOnibusEstadual(origem, destino, data);
	}

}
