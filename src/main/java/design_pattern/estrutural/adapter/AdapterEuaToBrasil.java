package design_pattern.estrutural.adapter;

public class AdapterEuaToBrasil extends TomadaBrasileira{
	public String conecta(PlugAmericano plug) {
		return plug.obtemEletricidade() + this.getNomeRede();
	}
}
