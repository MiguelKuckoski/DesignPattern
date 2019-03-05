package design_pattern.criacao.factoryMethod;

import java.util.Calendar;

public class EmpresaOnibusInterestadual extends Empresa{

	public Passagem emitePassagem(String origem, String destino, Calendar data) {
		return new PassagemOnibusInterestadual(origem, destino, data);
	}
	
}
