package design_pattern.estrutural.adapter;

public class TomadaAmericana {
	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
	
	public String getNomeRede() {
		return "tomada americana";
	}
}
