package design_pattern.estrutural.adapter;

public class PlugAmericano extends Plug{

	@Override
	public String obtemEletricidade() {
		return "Plug americando conectado à ";
	}

}
