package design_pattern.estrutural.adapter;

public class AdapterBrasilToEua extends TomadaAmericana{
	public String conecta(PlugBrasileiro plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
}
