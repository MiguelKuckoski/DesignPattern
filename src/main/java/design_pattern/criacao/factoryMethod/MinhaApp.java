package design_pattern.criacao.factoryMethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaApp {

	public static void main(String[] args) {
		Empresa viacaoLocal = new EmpresaOnibusEstadual();
		Empresa viacaoInterestadual = new EmpresaOnibusInterestadual();
		
		Passagem pLocal = viacaoLocal.emitePassagem("Florianópolis", "Palhoça", new GregorianCalendar(2016, Calendar.MARCH, 10,22,15));
		Passagem pEstadual = viacaoInterestadual.emitePassagem("Florianópolis", "Rio de janeiro", new GregorianCalendar(2016, Calendar.MARCH, 10,22,15));
		
		pLocal.exibeDetalhes();
		pEstadual.exibeDetalhes();
	
	}

}
