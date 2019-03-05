package design_pattern.criacao.factoryMethod;

import java.util.Calendar;

public abstract class Empresa {

	public abstract Passagem emitePassagem(String origem, String destino, Calendar data);
	
	
}
