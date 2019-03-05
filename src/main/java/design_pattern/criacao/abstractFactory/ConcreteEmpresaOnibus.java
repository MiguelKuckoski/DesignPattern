package design_pattern.criacao.abstractFactory;

import java.util.Calendar;

public class ConcreteEmpresaOnibus extends EmpresaOnibus {

	@Override
	public PassagemOnibusInterestadual emitePassagemInterestadual(String origem, String destino, Calendar date) {
		return new ConcretePassagemOnibusInterestadual(origem, destino, date);
	}

	@Override
	public PassagemOnibusEstadual emitePassagemEstadual(String origem, String destino, Calendar date) {
		return new ConcretePassagemOnibusEstadual(origem, destino, date);
	}
}
