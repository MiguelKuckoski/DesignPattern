package design_pattern.criacao.abstractFactory;

import java.util.Calendar;

public abstract class EmpresaOnibus {

	public abstract PassagemOnibusInterestadual emitePassagemInterestadual(String origem, String destino, Calendar date);
	
	public abstract PassagemOnibusEstadual emitePassagemEstadual(String origem, String destino, Calendar date);
}
