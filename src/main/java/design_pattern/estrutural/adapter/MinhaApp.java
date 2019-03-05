package design_pattern.estrutural.adapter;

public class MinhaApp {
	
	public static void main(String[] args) {
		//Target
		TomadaBrasileira tomadaBras = new TomadaBrasileira();
		
		//Adaptado
		PlugAmericano plugEUA = new PlugAmericano();

		AdapterEuaToBrasil tomadaModificada = new AdapterEuaToBrasil();
		String s = tomadaModificada.conecta(plugEUA);
		
		System.out.println(s);
		
	}
	
}
