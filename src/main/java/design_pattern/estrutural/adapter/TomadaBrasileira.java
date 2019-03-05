package design_pattern.estrutural.adapter;

public class TomadaBrasileira {
	public String conecta(PlugBrasileiro plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	
	public String getNomeRede() {
		return "tomada brasileira";
	}
}
