package design_pattern.criacao.abstractFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaApp {

	public static void main(String[] args) {
		EmpresaOnibus empresa = new ConcreteEmpresaOnibus();
		
		PassagemOnibusEstadual pEstadual  = empresa.emitePassagemEstadual("Capoeiras", "Itacorubi", new GregorianCalendar(2018, Calendar.JANUARY, 18, 18,30));
		PassagemOnibusInterestadual pInterestadual  = empresa.emitePassagemInterestadual("Florianópolis", "Curitiba", new GregorianCalendar(2019, Calendar.MARCH, 20, 05, 40));
		
		pEstadual.exibeDetalhes();
		pInterestadual.exibeDetalhes();
		
	}

}
